package webapp.servlets;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webapp.entities.Product;
import webapp.services.ProductService;
@WebServlet("/products")
public class ProductServlet extends HttpServlet {
	ProductService productService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("This is doGetMethod ");
//		System.out.println(request.getParameter("id"));
//		request.setAttribute("id", request.getParameter("id"));
		productService = new ProductService();
		List<Product> products = productService.getProducts();
		request.setAttribute("products", products);
		request.getRequestDispatcher("products.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print("This is doPost Method");
	}

}
