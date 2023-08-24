package webapp.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/cookies")
public class CookieServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("cookies.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		//Cookie[] cookies =  req.getCookies();
		Cookie cookie = new Cookie("username", username);
		cookie.setMaxAge(30);
		resp.addCookie(cookie);
		//System.out.println(req.getCookies()[0].getValue());
		req.getRequestDispatcher("cookies.jsp").forward(req, resp);
	}
}
