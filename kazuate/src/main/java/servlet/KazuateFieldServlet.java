package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/KazuateField")
public class KazuateFieldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String you = request.getParameter("kazu");
		int com = (int) (Math.random() * 9) + 1;
		String msg = "";
		int user = Integer.parseInt(you);
		if (user > com) {
			msg = "大きすぎます";
		} else if (user < com) {
			msg = "小さすぎます";
		} else {
			msg = "正解です";
		}

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<p>" + msg + "</p>");
	}

}
