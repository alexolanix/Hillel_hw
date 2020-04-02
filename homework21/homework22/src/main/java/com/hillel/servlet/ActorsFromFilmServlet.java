package com.hillel.servlet;

import com.hillel.entity.Actors;
import com.hillel.service.DBLibrary.DBLibrary;
import com.hillel.service.VideoLibrary;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/actors")
public class ActorsFromFilmServlet extends HttpServlet {
    private VideoLibrary library;
    public ActorsFromFilmServlet(){
        library = new DBLibrary();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/ActorsFromFilm.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int filmID = Integer.parseInt(request.getParameter("filmID"));
        request.setAttribute("actors", getLibrary().selectActorsByFilm(filmID));
        request.getRequestDispatcher("/jsp/ActorsFromFilm.jsp").forward(request, response);
    }

    public VideoLibrary getLibrary() {
        return library;
    }

    public void setLibrary(VideoLibrary library) {
        this.library = library;
    }
}
