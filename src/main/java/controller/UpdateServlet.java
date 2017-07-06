package controller;

import dao.WorkersDAO;
import model.Worker;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateServlet extends HttpServlet {

    private WorkersDAO workersDAO = new WorkersDAO();

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

        long workerId = Long.parseLong(req.getParameter("id"));
        req.setAttribute("worker", workersDAO.getWorkerById((int)workerId));
        req.getRequestDispatcher("/update.jsp").forward(req, resp);
    }

    @Override
    protected void doPut (HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        int age = Integer.parseInt(req.getParameter("age"));
        double salary = Double.parseDouble(req.getParameter("salary"));
        long id = Long.parseLong(req.getParameter("id"));

        Worker worker = new Worker(firstName, lastName, age, salary, id);
        System.out.println("Update servlet " + worker);
        workersDAO.updateWorker((int) id, worker);
        resp.sendRedirect("printall");
    }
}
