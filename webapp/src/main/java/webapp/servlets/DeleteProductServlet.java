package webapp.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webapp.services.ProductService;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/deleteProduct")
public class DeleteProductServlet extends HttpServlet {
	ProductService productService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("id"));
		productService = new ProductService();
		productService.delete(Integer.parseInt(request.getParameter("id")));
		response.getWriter().write("deleted");
	}

}
