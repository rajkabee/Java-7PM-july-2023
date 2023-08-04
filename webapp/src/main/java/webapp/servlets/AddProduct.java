package webapp.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webapp.entities.Product;
import webapp.services.ProductService;

@WebServlet("/addProduct")
public class AddProduct extends HttpServlet {
	ProductService productService; 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("addProductForm.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product pd = new Product();
		pd.setName(request.getParameter("name"));
		pd.setDescription(request.getParameter("description"));
		pd.setPrice(Float.parseFloat(request.getParameter("price")));
		
		productService = new ProductService();
		productService.save(pd);
		
		response.sendRedirect("products");
		
	}

}
