package com.hillel.servlet;

import com.hillel.service.DBLibrary.DBLibrary;
import com.hillel.service.VideoLibrary;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteElderFilmServlet extends HttpServlet {
    private VideoLibrary library;
    public DeleteElderFilmServlet(){
        library = new DBLibrary();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getLibrary().deleteFilmsElder(Integer.parseInt(request.getParameter("age")));
        request.getRequestDispatcher("/jsp/DeleteE.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/DeleteE.jsp").forward(request, response);
    }

    public VideoLibrary getLibrary() {
        return library;
    }

    public void setLibrary(VideoLibrary library) {
        this.library = library;
    }

}
