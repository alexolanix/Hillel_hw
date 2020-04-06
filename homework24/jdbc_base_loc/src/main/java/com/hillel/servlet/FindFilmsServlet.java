package com.hillel.servlet;

import com.hillel.service.DBLibrary.DBLibrary;
import com.hillel.service.VideoLibrary;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;


@WebServlet("/films")
public class FindFilmsServlet extends HttpServlet {

    private VideoLibrary library;
    public FindFilmsServlet(){
        library = new DBLibrary();
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request,
                         javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("movies", getLibrary().findFilmLastYear());
        request.getRequestDispatcher("/jsp/NewFilms.jsp").forward(request, response);


    }
    protected void doPost(javax.servlet.http.HttpServletRequest request,
                               javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    public VideoLibrary getLibrary() {
        return library;
    }

    public void setLibrary(VideoLibrary library) {
        this.library = library;
    }
}
