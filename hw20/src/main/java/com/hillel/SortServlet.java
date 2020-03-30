package com.hillel;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;




@WebServlet("/SortServlet")
public class SortServlet extends HttpServlet{

    public SortServlet(){

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String inputDigit = request.getParameter("digits");
        response.getWriter().append(Utills.sortString(inputDigit));
    }

}
