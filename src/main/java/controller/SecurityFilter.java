package controller;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecurityFilter implements Filter {

    public void init(FilterConfig config)
            throws ServletException {
    }

    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws java.io.IOException, ServletException {
        HttpSession session = ((HttpServletRequest) request).getSession();

        if (session==null || session.getAttribute("userName") == null) {
            ((HttpServletResponse) response).sendRedirect("login");
        } else {
            chain.doFilter(request, response);
        }
    }

    public void destroy() {
    }
}