package com.hillel;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/FindWordServlet")
public class FindWordServlet  extends HttpServlet {

    public FindWordServlet(){

    }

    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        String word = request.getParameter("word");
        response.getWriter().append(Utills.countWords(word));
    }

}
