/*
web/index.jsp deki html formdan aldigi iki sayi ile temel mat. islemlerini gerceklestirir ve json object olarak response dondurur.
get metodu kullanildigindan parametreler linkte de acik olarak gorulebilir
*/
package org.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;


public class Calculate extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/json");
        response.setCharacterEncoding("UTF-8");
        
        PrintWriter write = response.getWriter();
        
        int n1 = new Integer(request.getParameter("num1"));
        int n2 = new Integer(request.getParameter("num2"));
        
        JSONObject jo = new JSONObject();
        // key,value
        jo.put("number 1 ", n1);
        jo.put("number 2 ", n2);
        
        jo.put("addition ", n1+n2);
        jo.put("subtraction ", n1-n2);
        jo.put("multiplication ", n1*n2 );
        jo.put("division ", (double)n1/n2 );
        jo.put("mode ", n1%n2);
        
        write.println(jo);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
    }

}
