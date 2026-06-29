package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ex62")
public class ExampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = (int)(Math.random() * 10);
		// int num = new Random().nextInt(10);
		if (num % 2 == 0) {
			request.getRequestDispatcher("forwarded.jsp")
			       .forward(request, response);
			
		} else {
			response.sendRedirect("redirected.jsp");
		}
	}

}
