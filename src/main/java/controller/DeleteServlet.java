package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteServlet extends HttpServlet {

    @Override
    public void doGet (HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        WorkersDAO workersDAO = new WorkersDAO();
        long workerId = Long.parseLong(req.getParameter("id"));
        //if (workerId != null)
        workersDAO.deleteWorker(workerId);
        //System.out.println("Delete " + workersDAO.getWorkers());
        //req.getRequestDispatcher("/printall.jsp").forward(req, resp);
        resp.sendRedirect("printall");
    }

   /* @Override
    public void doPost (HttpServletRequest req, HttpServletResponse resp) {
    }*/
}
