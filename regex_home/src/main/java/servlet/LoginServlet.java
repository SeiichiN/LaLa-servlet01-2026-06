package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Pattern ID_PATTERN = Pattern.compile("\\w+");
	// private static final Pattern PASSWORD_PATTERN = Pattern.compile("\\w{4,8}");
	private static final Pattern PASSWORD_PATTERN = 
			Pattern.compile("(\\d|[a-z]|[A-Z]|[!@#\\$%\\^&\\*()_]){4,8}");
	
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		String msg = null;
		if (ID_PATTERN.matcher(id).matches() && PASSWORD_PATTERN.matcher(password).matches()) {
			msg = "ログイン処理に進みます";
		} else {
			msg = "IDまたはパスワードが違います";
		}
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<p>" + msg + "</p>");
		out.println("<p><a href=\"login.jsp\">戻る</a></p>");
		out.println("</body></html>");
	}

}
