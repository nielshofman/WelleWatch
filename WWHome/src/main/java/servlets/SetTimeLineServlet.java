package servlets;

import java.io.IOException;

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
		if (chipID != null && location != null) {
			TableUtils.changeTableEntry(chipID, location);
			TableUtils.setLastKnownPosition(location, chipID);
		} else {
			response.sendError(500);;
		}
	}
}
