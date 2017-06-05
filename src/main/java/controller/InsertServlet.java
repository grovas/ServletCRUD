package controller;

import model.Worker;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class InsertServlet extends HttpServlet{

    Worker worker = new Worker();

    @Override
    protected void doGet  (HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

        resp.setContentType("text/html");
        req.setAttribute("insertWorker", worker);
        req.getRequestDispatcher("/insert.jsp").forward(req, resp);
    }

    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

        WorkersDAO workersDAO = new WorkersDAO();

        workersDAO.insertWorker(new Worker(req.getParameter("firstName"),
                                           req.getParameter("lastName"),
                                           Integer.parseInt(req.getParameter("age")),
                                           Double.parseDouble(req.getParameter("salary")),
                                           workersDAO.getSize()));
        resp.sendRedirect("printall");
    }
}
