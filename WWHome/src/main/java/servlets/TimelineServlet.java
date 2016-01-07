package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.TableUtils;
import model.Timeline;

public class TimelineServlet extends HttpServlet{
	
	private Timeline timeline;

	private static final String LOC = "location";
	private static final long serialVersionUID = 1L;
	
	public TimelineServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String location = null;
		location = request.getParameter(LOC);
		String chipID = null;
		if (location.equals("2") || location.equals("4") || location.equals("6")) {
			chipID = TableUtils.getTable().getLastKnownChipOnLocation().get(location);
		}
		if (chipID != null && location != null) {
			timeline = TableUtils.getTimeline(chipID);
			System.out.println(chipID);
			request.setAttribute("timeline", timeline);
			RequestDispatcher rd = request.getRequestDispatcher("timeline_view.jsp");
			rd.forward(request, response);
		} else {
			response.sendError(500);
		}
	}
}
