package com.hillel.servlet;

import com.hillel.service.DBLibrary.DBLibrary;
import com.hillel.service.VideoLibrary;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/actorsNfilms")
public class ActorsFilmedInNFilmsServlet extends HttpServlet {
    private VideoLibrary library;

    public ActorsFilmedInNFilmsServlet() {
        library = new DBLibrary();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/ActorsFilmedInNFilms.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int filmQ = Integer.parseInt(request.getParameter("filmQ"));
        request.setAttribute("multyactors", getLibrary().selectActorsFilmedNFilms(filmQ));
        request.getRequestDispatcher("/jsp/ActorsFilmedInNFilms.jsp").forward(request, response);
    }

    public VideoLibrary getLibrary() {
        return library;
    }

    public void setLibrary(VideoLibrary library) {
        this.library = library;
    }
}
