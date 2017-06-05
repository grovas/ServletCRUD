package controller;

import model.Worker;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicLong;

public class LoginServlet extends HttpServlet {

    private AtomicLong lastIndex = new AtomicLong(1);

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    public void doPost (HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

        resp.setContentType("text/html");

        String userName = req.getParameter("username");
        String password = req.getParameter("password");
       // System.out.println("user" + userName + "pass" + password);

        if(LoginDAO.validate(userName, password )){
            req.getSession(true).setAttribute("userName", "root");
            resp.sendRedirect("/welcome.jsp");

            WorkersDAO workersDAO = new WorkersDAO();

            workersDAO.removeAll();
            workersDAO.insertWorker(
                    new Worker("Jas", "dertop", 12, 3333.3, lastIndex.getAndIncrement()));
            workersDAO.insertWorker(
                    new Worker("Jas2", "dertop2",22, 44444.4, lastIndex.getAndIncrement()));
            /*workersDAO.insertWorker(
                    new Worker("Jas3", "dertop3", 33,22222.4,lastIndex.getAndIncrement()));
            workersDAO.insertWorker(
                    new Worker("Jas4", "dertop4", 33,22222.4,lastIndex.getAndIncrement()));
            workersDAO.insertWorker(
                    new Worker("Jas5", "dertop5", 33,22222.4,lastIndex.getAndIncrement()));*/

            //req.setAttribute("workers",workersDAO);
            //req.getRequestDispatcher("/welcome.jsp").forward(req, resp);
        }
        else{
            req.setAttribute("error", "Niepoprawny użytkownik, bądź hasło");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }
}
