/*
package controller;

import model.Worker;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class WorkerServlet extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        //HttpSession session = req.getSession(true);

        WorkersDAO workersDAO = new WorkersDAO();

        workersDAO.removeAll();
        workersDAO.insertWorker(new Worker("Jas", "dertop"));
        workersDAO.insertWorker(new Worker("Jas2", "dertop2"));
        workersDAO.insertWorker(new Worker("Jas3", "dertop3"));

        req.setAttribute("workers", workersDAO.getWorkers());

        req.getRequestDispatcher("/insert.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setAttribute("worker",
                new Worker(req.getParameter("firstName"),
                           req.getParameter("lastName")));
        req.getRequestDispatcher("/insert.jsp").forward(req, resp);
    }
}*/
