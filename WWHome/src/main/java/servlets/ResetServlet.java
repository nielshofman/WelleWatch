package servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.TableUtils;

public class ResetServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResetServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> params = request.getParameterNames();
		String[] parameterList = new String[2];
		int i = 0;
		while(params.hasMoreElements() && i < 2) {
			parameterList[i] = params.nextElement();
			i++;
		}
		String chipID = parameterList[0];
		TableUtils.resetTableEntry(chipID);
		response.sendRedirect("resetpage.html");
	}
}
