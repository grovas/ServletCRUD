package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class UpdateServlet extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        HttpSession session = req.getSession(true);

        resp.setContentType("text/html");
        req.getParameter("firstName");
        req.getParameter("lastName");
        req.getParameter("age");
        req.getParameter("salary");

        req.getRequestDispatcher("/update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

        if (req.getAttribute("id") == "lista") {
            resp.sendRedirect("printallworkers");
        }
    }
}
