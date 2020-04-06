package com.hillel.servlet;

import com.hillel.entity.User;
import com.hillel.service.DBLibrary.UserServiceImpl;
import com.hillel.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private UserService userService;

    public LoginServlet() {
        userService =  new UserServiceImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/Login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = userService.findUser(username);
        if (user != null && user.getPassword().equals(password)) {
            request.getSession().setAttribute("user", user);
            response.sendRedirect("index.jsp");
        } else {
            request.setAttribute("error", "user not found");
            request.getRequestDispatcher("/jsp/Login.jsp").forward(request, response);
        }
    }
}
