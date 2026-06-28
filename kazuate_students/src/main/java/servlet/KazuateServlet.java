package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.regex.Pattern;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Kazuate")
public class KazuateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int com =  new Random().nextInt(9) + 1;
		String you = request.getParameter("kazu");
		String msg = "";
		Pattern pattern = Pattern.compile("^[0-9]+$");
		if (pattern.matcher(you).matches()) {
			int user = Integer.parseInt(you);
			if (user > com) {
				msg = "大きすぎます";
			} else if(user < com){
				msg = "小さすぎます";
			} else {
				msg = "正解です";
			}
		}
		else {
			msg = "数字を入力してください";
		}
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<p>" + msg + "</p>");
	}

}
