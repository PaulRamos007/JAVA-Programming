let addOrUpdate;

window.onload = function (){
    //adding event handler for buttons
    document.querySelector("#GetButton").addEventListener("click", getAllItems);
    document.querySelector("#DeleteButton").addEventListener("click", deleteItem);
    document.querySelector("#DoneButton").addEventListener("click", processForm);
    document.querySelector("#AddButton").addEventListener("click", addItem);
    document.querySelector("#UpdateButton").addEventListener("click", updateItem);
    document.querySelector("#CancelButton").addEventListener("click", CancelAddUpdate);
    
    
    document.querySelector("table").addEventListener("click", handleRowClick);
    
    hideUpdatePanel();
    loadMenuItemCategories();
};

function resetUpdatePanel() {
    document.querySelector("#orderIdInput").value = "";
    document.querySelectorAll("option")[0].selected = true;
    document.querySelector("#nameInput").value = "";
    document.querySelector("#priceInput").value = "";
    document.querySelector("#quantityInput").value = "";
    document.querySelector("#premiumInput").checked = false;
      
}
function CancelAddUpdate(){
    hideUpdatePanel();
}

function showUpdatePanel(){
    document.querySelector("#AddUpdatePanel").classList.remove("hidden");
    
}
function hideUpdatePanel(){
    document.querySelector("#AddUpdatePanel").classList.add("hidden");
    
}
function addItem(){
    addOrUpdate = "add";
    resetUpdatePanel();
    showUpdatePanel();
}

function updateItem(){
    addOrUpdate = "update";
    
    resetUpdatePanel();
    poplateUpdatePanelWithSelectedItem();
    showUpdatePanel();
}

function poplateUpdatePanelWithSelectedItem(){
    let tds = document.querySelector(".highlighted").querySelectorAll("td");
    document.querySelector("#orderIdInput").value = tds[0].innerHTML;
    let options = document.querySelectorAll("option");
    for(let i =0; i < options.length; i++){
        options[i].selected = options[i].value === tds[1].innerHTML;
        
    }
    document.querySelector("#nameInput").value = tds[2].innerHTML;
    document.querySelector("#priceInput").value = tds[3].innerHTML;
    document.querySelector("#quantityInput").value = tds[4].innerHTML;
    document.querySelector("#premiumInput").checked = "true" === tds[5].innerHTML;
    
    
}
function processForm(){
    let orderId = document.querySelector("#orderIdInput").value;
    
    let statusId = document.querySelector("#statusSelect").value;
    
    let name = document.querySelector("#nameInput").value;
    
    let price = document.querySelector("#priceInput").value;
    
    let quantity = document.querySelector("#quantityInput").value;
    
    let premium = document.querySelector("#premiumInput").checked;
    
    let obj = {
        "id" : orderId,
        "status" : statusId,
        "name" : name,
        "price" : price,
        "quantity" : quantity,
        "premium" : premium
    };
    
    let url = "OrderService/items/" + orderId;
    let method = (addOrUpdate === "add") ? "POST" : "PUT";
    xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.readyState === 4 && xmlhttp.status === 200){
            let resp = xmlhttp.responseText.trim();
            if(resp.search("ERROR") >= 0 || resp !== "true"){
                alert("could not complete request");
            }else{
                alert("request completed successfully");
            getAllItems();
        }
        
        }
    };
    xmlhttp.open(method, url, true);
    xmlhttp.send(JSON.stringify(obj));
}

function initUpdatePanel(text) {
    let cats = JSON.parse(text);
    let html = "";
    for(let i = 0; i< cats.length; i++){
        let id = cats[i].id;
        let desc = cats[i].description;
        
        html += "<option value='" + id + "'> " + desc + "</option>";
    }
    document.querySelector("#statusSelect").innerHTML = html;
    resetUpdatePanel();
}


function loadMenuItemCategories(){
    let url = "OrderStatusService/status";
    let xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function (){
        if(xmlhttp.readyState ===4 && xmlhttp.status ===200){
            let resp = xmlhttp.responseText;
            
            if(resp.search("ERROR") >= 0){
                alert("could not perform operation");
                console.log(resp);
            }else{
                initUpdatePanel(resp);
            }
        }
    };
    xmlhttp.open("GET", url, true);
    xmlhttp.send();
}

function deleteItem(){
    let id = document.querySelector(".highlighted").querySelector("td").innerHTML;
    
    let url = "OrderService/items/" + id;
    let xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function(){
       if(xmlhttp.readyState ===4 && xmlhttp.status ===200){
           let resp = xmlhttp.responseText.trim();
           if(resp.search("ERROR") >= 0 || resp !== "true") {
                alert("could not complete request");
               
            }else{
                alert("delete request completed successfully");
                getAllItems();
            
            }
           
       }
        
    };
    xmlhttp.open("DELETE", url, true );
    xmlhttp.send();
    
}


function clearSelection(){
    let trs = document.querySelectorAll("tr");
    for(let i = 0; i < trs.length; i++){
        trs[i].classList.remove("highlighted");
    }
}


function handleRowClick(e){
    
    clearSelection();
    //adding class and style to parent of clicked cell
    e.target.parentElement.classList.add("highlighted");
    
    //enable update and delete button
    document.querySelector("#DeleteButton").removeAttribute("disabled");
    document.querySelector("#UpdateButton").removeAttribute("disabled");
}

function getAllItems(){
    let url = "OrderService/items";
    let xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function (){
        if (xmlhttp.readyState ===4 && xmlhttp.status ===200) {
            let resp = xmlhttp.responseText;
            console.log(resp);
            if(resp.search("ERROR") >= 0) {
                alert("could not complete request");
                console.log(resp);
            }else{
                buildTable(xmlhttp.responseText);
                clearSelection();
                resetUpdatePanel();
                hideUpdatePanel();
            
            }
          
        }
       
    };
    xmlhttp.open("GET", url, true); // HTTP verb says what action to take; URL says which item(s) to act upon
    xmlhttp.send();
    
    
}

function buildTable(text){
    let data = JSON.parse(text);
    console.log(data);
    
    let theTable = document.querySelector("table");
    let html = theTable.querySelector("tr").innerHTML;
    for(let i = 0; i < data.length; i++){
        let temp = data[i];
        
        html += "<tr>";
        html += "<td>" + temp.id + "</td>";
        html += "<td>" + temp.status + "</td>";
        html += "<td>" + temp.name + "</td>";
        html += "<td>" + temp.price + "</td>";
        html += "<td>" + temp.quantity + "</td>";
        html += "<td>" + temp.premium + "</td>";
        html += "</tr>";
    }
    theTable.innerHTML = html;
}


