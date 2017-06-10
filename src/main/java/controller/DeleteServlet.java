package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteServlet extends HttpServlet {

    private WorkersDAO workersDAO = new WorkersDAO();
    private long workerId = 0;

    @Override
    public void doGet (HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        workerId = Long.parseLong(req.getParameter("id"));
        doDelete(req, resp);
    }

    @Override
    public void doDelete (HttpServletRequest req,
                          HttpServletResponse resp)
            throws IOException {

        workersDAO.deleteWorker(workerId);
        resp.sendRedirect("printall");
    }
}
