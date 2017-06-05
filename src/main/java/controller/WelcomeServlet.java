package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp)
        throws IOException, ServletException {
        HttpSession session = req.getSession(true);

        //resp.setContentType("text/html");
        //req.setAttribute("path", session);

        if (req.getAttribute("emptyList") == "empty") {
            req.setAttribute("empty", new Integer(0));
            req.getRequestDispatcher("/welcome.jsp").forward(req, resp);
        }
        req.getRequestDispatcher("/welcome.jsp").forward(req, resp);
    }
}
