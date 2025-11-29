package org.example.ss10.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.ss10.service.IViewlistService;
import org.example.ss10.service.ViewlistService;

import java.io.IOException;

@WebServlet(name = "ViewListController", value = "/customers")
public class ViewlistController extends HttpServlet {

    private IViewlistService viewlistService = new ViewlistService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setAttribute("customers", viewlistService.findAll());
        req.getRequestDispatcher("/view/index.jsp").forward(req, resp);
    }

}
