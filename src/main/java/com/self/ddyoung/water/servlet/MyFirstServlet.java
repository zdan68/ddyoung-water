package com.self.ddyoung.water.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by sanbian on 2017/8/18.
 */
@WebServlet(name = "MyFirstServlet", urlPatterns = {"/ServletExample/MyFirstServlet"})
public class MyFirstServlet extends HttpServlet{


    private static final long serialVersionUID = 1641664816036074762L;



    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            // Write some content
            out.println("<html>");
            out.println("<head>");
            out.println("<title>MyFirstServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Servlet MyFirstServlet at " + request.getContextPath() + "</h2>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        //Do some other work
    }

    @Override
    public String getServletInfo() {
        return "MyFirstServlet";
    }
}
