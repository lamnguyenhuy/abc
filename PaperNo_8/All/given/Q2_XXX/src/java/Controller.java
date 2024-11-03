
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

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
        String msg = "";
        Boolean check = true;

        HttpSession session = req.getSession();
        List<result> li = (List<result>) session.getAttribute("li");
        if ( li == null) {
            li = new ArrayList();

        }

        for (result o : li) {
            if (o.getStr().equalsIgnoreCase(str) && o.getOpt().equalsIgnoreCase(opt)) {
                msg = "Execution Existed! ";
                check = false;
            }

        }
        if (str.isEmpty() || str == null) {
            msg = "Input string is invalid! ";
            check = false;
        } if (opt.equalsIgnoreCase("Length of string")&&check) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                count++;
            }
            result rs = new result(str, opt, Integer.toString(count));
            li.add(rs);
            req.setAttribute("result", count);
        } if (opt.equalsIgnoreCase("Consonant characters")&&check) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != 'a'
                        && str.charAt(i) != 'a'
                        && str.charAt(i) != 'A'
                        && str.charAt(i) != 'e'
                        && str.charAt(i) != 'E'
                        && str.charAt(i) != 'i'
                        && str.charAt(i) != 'I'
                        && str.charAt(i) != 'o'
                        && str.charAt(i) != 'O'
                        && str.charAt(i) != 'u'
                        && str.charAt(i) != ' '
                        && str.charAt(i) != 'U') {
                    count++;
                }
            }
            result rs = new result(str, opt, Integer.toString(count));
            li.add(rs);
            req.setAttribute("result", count);

        }

        session.setAttribute("li", li);
        req.setAttribute("msg", msg);
        req.setAttribute("name", str);
        req.getRequestDispatcher("MyExam.jsp").forward(req, resp);
    }
}
