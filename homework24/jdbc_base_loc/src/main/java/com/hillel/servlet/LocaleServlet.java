package com.hillel.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;
import java.io.IOException;


@WebServlet("/local")
public class LocaleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String lang = request.getParameter("lang");
        Config.set(request.getSession(), "javax.servlet.jsp.jstl.fmt.locale", lang);
        response.sendRedirect("index.jsp");
    }
}