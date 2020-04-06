package com.hillel.filter;

import com.hillel.entity.User;
import com.hillel.entity.UserRole;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/delete")
public class DeleteFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        if(req.getMethod().equals("POST")){
            HttpSession session = req.getSession();
            User user = (User) session.getAttribute("user");
            if(user != null && user.getRole() == UserRole.ADMIN) {
                chain.doFilter(request, response);
            } else {
                System.err.println("not ADMIN");
                res.sendRedirect("index.jsp");
            }
        }else {
            chain.doFilter(request, response);
        }

    }

    @Override
    public void destroy() {

    }


}
