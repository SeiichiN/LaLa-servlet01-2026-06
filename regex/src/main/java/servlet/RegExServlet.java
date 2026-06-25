package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegEx")
public class RegExServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Pattern PATTERN =
			Pattern.compile("^EMP[0-9]{3}$");

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		
		String msg = "";
		if (PATTERN.matcher(id).matches()) {
			msg = "正しいIDです";
		} else {
			msg = "不正なIDです";
		}
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<p>" + msg + "</p>");
	}

}
