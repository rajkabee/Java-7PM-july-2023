package webapp.servlets;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webapp.entities.Product;
import webapp.services.ProductService;
@WebServlet("/updateProduct")
public class UpdateServlet extends HttpServlet {
	ProductService productService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		productService = new ProductService();
		Product pd = productService.getProduct(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("product", pd);
		request.getRequestDispatcher("updateProductForm.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product pd = new Product();
		pd.setId(Integer.parseInt(request.getParameter("id")));
		pd.setName(request.getParameter("name"));
		pd.setDescription(request.getParameter("description"));
		pd.setPrice(Float.parseFloat(request.getParameter("price")));
		System.out.println(pd);
		productService = new ProductService();
		productService.update(pd);
		response.sendRedirect("products");
	}

}
