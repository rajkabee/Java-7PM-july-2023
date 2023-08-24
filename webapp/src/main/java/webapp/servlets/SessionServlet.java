package webapp.servlets;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/sessions")
public class SessionServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("session.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String item = req.getParameter("item");
		HttpSession session =  req.getSession();
		ArrayList<String> myitems =null;
		if(session.getAttribute("items")!=null) {
			myitems=(ArrayList<String>)session.getAttribute("items");
		}
		else {
			myitems = new ArrayList<String>();
		}
		myitems.add(item);
		session.setAttribute("items", myitems);
		req.setAttribute("myitems", myitems);
		req.getRequestDispatcher("session.jsp").forward(req, resp);
	}
}
