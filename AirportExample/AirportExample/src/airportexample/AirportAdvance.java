/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airportexample;

/**
 *
 * @author Himanshu.Devnani
 */
public class AirportAdvance {
    
    private String code;
    private String city;
    private String country;

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String cName) {
        if(cName != null && cName.length() != 0){
            country = cName;
        
        }
    }

    public String getCode() {
        return code;
    }
     
    public AirportAdvance(String code, String city, String country) {
        this.code = code;
        this.city = city;
        this.country = country;
    }
    @Override
    public String toString(){
        String res = "";
        res += code;
        res += "(";
        res += city + " , " + country;
        
        res += ")";
        return res;

    }
}
