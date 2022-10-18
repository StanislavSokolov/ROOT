import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class Redirect extends HttpServlet {
    private final String DOMEN_1 = "falconfamily.shop";
    private final String DOMEN_2 = "tapasandpintxos.ru";
    private final String PORT = "8448";
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("text/html");
        String request = String.valueOf(httpServletRequest.getRequestURL());
        if (request.equals("http://www." + DOMEN_1 + "/") ||
                request.equals("http://" + DOMEN_1 + "/") ||
                request.equals("https://www." + DOMEN_1 + "/") ||
                request.equals("https://" + DOMEN_1 + "/") ||
                request.equals("https://www." + DOMEN_1 + ":" + PORT + "/") ||
                request.equals("https://" + DOMEN_1 + ":" + PORT + "/")) {
//            String path = httpServletRequest.getContextPath() + "/MebelCity";
            httpServletResponse.sendRedirect("https://www." + DOMEN_1 + "/MebelCity");
        } else if (request.equals("http://www." + DOMEN_2 + "/") ||
                request.equals("http://" + DOMEN_2 + "/") ||
                request.equals("https://www." + DOMEN_2 + "/") ||
                request.equals("https://" + DOMEN_2 + "/") ||
                request.equals("https://www." + DOMEN_2 + ":" + PORT + "/") ||
                request.equals("https://" + DOMEN_2 + ":" + PORT + "/")) {
//            String path = httpServletRequest.getContextPath() + "/docs";
//            httpServletResponse.sendRedirect(path);
            httpServletResponse.sendRedirect("https://www." + DOMEN_2 + "/docs");
        } else {
            String path = httpServletRequest.getContextPath() + "/test";
            httpServletResponse.sendRedirect(path);
        }
    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        super.doPost(httpServletRequest, httpServletResponse);
    }
}

