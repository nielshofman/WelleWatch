package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.TableUtils;

public class SetTimeLineServlet extends HttpServlet {

	private static final String ID = "chipID";
	private static final String LOC = "location";
	private static final long serialVersionUID = 1L;

	public SetTimeLineServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String chipID = request.getParameter(ID);
		String location = request.getParameter(LOC);
		System.out.println(chipID);
		System.out.println(location);
		if (chipID != null && location != null) {
			System.out.println("hoi");
			TableUtils.changeTableEntry(chipID, location);
			TableUtils.setLastKnownPosition(location, chipID);
			request.setAttribute("timeline", null);
			RequestDispatcher rd = request.getRequestDispatcher("resetpage.html");
			rd.forward(request, response);
		} else {
			response.sendError(500);;
		}
	}
}
