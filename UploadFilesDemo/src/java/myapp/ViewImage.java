/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author paula
 */
@WebServlet(name = "ViewImage", urlPatterns = {"/view"})
public class ViewImage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ServletContext ctx = this.getServletContext();
        
        try{
            File folder = new File(ctx.getRealPath("/Images/"));
        for(File file : folder.listFiles() ){
            out.println("<img style=\"width:200px;height:250px\" src=\"Images/" + file.getName() + "\"/>" + file.getName());
        }
        }catch(Exception ex){
            System.out.println("Not successful" + ex.getMessage());
        }
        
    }


}
