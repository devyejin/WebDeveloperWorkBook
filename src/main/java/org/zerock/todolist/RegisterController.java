package org.zerock.todolist;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/todo/register")
public class RegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getMethod();

        if("GET".equals(method)) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/todo/register.jsp");
            dispatcher.forward(req, resp);
        } else if ("POST".equals(method))


            System.out.println("호출");
            RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/todo/list");
            //대에충 값 받아서 저장했다 치고
            resp.sendRedirect("/todo/list");
        }
    }


}
