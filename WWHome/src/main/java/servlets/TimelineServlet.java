package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.TableUtils;
import model.Avatar;
import model.Timeline;

public class TimelineServlet extends HttpServlet{
	
	private Avatar character;
	private Timeline timeline;

	private static final String ID = "chipID";
	private static final String LOC = "location";
	private static final long serialVersionUID = 1L;
	
	public TimelineServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String chipID = null;
		String location = null;
		chipID = request.getParameter(ID);
		location = request.getParameter(LOC);
		if (chipID != null && location != null) {
			TableUtils.changeTableEntry(chipID, location);
			character = TableUtils.getCharacter(chipID);
			timeline = TableUtils.getTimeline(chipID);
			request.setAttribute("avatar", character);
			request.setAttribute("timeline", timeline);
			RequestDispatcher rd = request.getRequestDispatcher("timeline_view.jsp");
			rd.forward(request, response);
		} else {
			//Error
		}
	}
}
