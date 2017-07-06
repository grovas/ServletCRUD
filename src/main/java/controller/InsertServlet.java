package controller;

import dao.WorkersDAO;
import model.Worker;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

public class InsertServlet extends HttpServlet{

    private AtomicLong lastId = new AtomicLong();
    private Worker worker = new Worker();

    @Override
    protected void doGet  (HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

        resp.setContentType("text/html");
        req.setAttribute("insert", worker);
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
                                           workersDAO.getSize()+1));
        resp.sendRedirect("printall");
    }
}
