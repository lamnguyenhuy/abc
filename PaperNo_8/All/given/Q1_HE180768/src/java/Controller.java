
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author lam
 */
@WebServlet(urlPatterns = "/execute")
public class Controller extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str = req.getParameter("str");
        String opt = req.getParameter("opt");

        if (str.isEmpty() || str == null) {
            resp.getWriter().print("Input string is invalid!");
        }
        else if (opt.equalsIgnoreCase("2")) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                count++;
            }
            resp.getWriter().print(count);
        }
        else if (opt.equalsIgnoreCase("1")) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a'
                        || str.charAt(i) == 'a'
                        || str.charAt(i) == 'A'
                        || str.charAt(i) == 'e'
                        || str.charAt(i) == 'E'
                        || str.charAt(i) == 'i'
                        || str.charAt(i) == 'I'
                        || str.charAt(i) == 'o'
                        || str.charAt(i) == 'O'
                        || str.charAt(i) == 'u'
                        || str.charAt(i) == 'U') {
                    count++;
                }
            }                resp.getWriter().print(count);

        }

    }
}
