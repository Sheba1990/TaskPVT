package by.nikita.controllers;


import by.nikita.entities.UserInfo;
import by.nikita.service.CarInfoService;
import by.nikita.service.UserInfoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(urlPatterns = "/in")
public class CarInfoServlet extends HttpServlet {

    /**
     * Servlet controller for Http requests
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        req.setAttribute("currentDate", simpleDateFormat.format(new Date()));

        UserInfo attribute = (UserInfo) req.getSession().getAttribute("CurrentUser");

        if (attribute != null) {
            req.setAttribute("carinfo", CarInfoService.getInstance().getCars(attribute.getUsername()));
        }

        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    private void setLocale(HttpServletRequest req) {
        String header = req.getHeader("accept-language");

        if (header.contains("ru-RU")) {
            req.getSession().setAttribute("locale", "ru_RU");
        } else {
            req.getSession().setAttribute("locale", "us_EN");

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        req.setAttribute("currentDate", simpleDateFormat.format(new Date()));

        UserInfo userByPassAndName = UserInfoService.getInstance().getUserByPassAndName(req.getParameter("password"), req.getParameter("username"));

        if (userByPassAndName != null) {
            req.getSession().setAttribute("LoggedUser", userByPassAndName.toString());
            req.getSession().setAttribute("CurrentUser", userByPassAndName);

            req.setAttribute("cars", CarInfoService.getInstance().getCars(userByPassAndName.getUsername()));
        }

        req.getRequestDispatcher("/index.jsp").forward(req, resp);

    }
}
