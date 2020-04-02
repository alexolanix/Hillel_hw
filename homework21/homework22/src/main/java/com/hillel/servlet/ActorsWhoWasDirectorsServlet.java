package com.hillel.servlet;

import com.hillel.service.DBLibrary.DBLibrary;
import com.hillel.service.VideoLibrary;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/actorsdirectors")
public class ActorsWhoWasDirectorsServlet extends HttpServlet {


    private VideoLibrary library;

    public ActorsWhoWasDirectorsServlet() {
        library = new DBLibrary();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("directors", getLibrary().selectActorsDirectors());
        request.getRequestDispatcher("/jsp/ActorsAsDirector.jsp").forward(request, response);
    }

    public VideoLibrary getLibrary() {
        return library;
    }

    public void setLibrary(VideoLibrary library) {
        this.library = library;
    }
}
