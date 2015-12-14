package servlets;

import java.io.IOException;
import java.util.Enumeration;

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

	private static final long serialVersionUID = 1L;
	
	public TimelineServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> params = request.getParameterNames();
		int i = 0;
		String chipID = null;
		String location = null;
		while(params.hasMoreElements() && i < 2) {
			if (i%2 == 1) { 
				chipID = params.nextElement();
			} else if (i%2 == 0) {
				location = params.nextElement();
			}
			i++;
		}
		
		TableUtils.changeTableEntry(chipID, location);
		character = TableUtils.getCharacter(chipID);
		timeline = TableUtils.getTimeline(chipID);
		request.setAttribute("avatar", character);
		request.setAttribute("timeline", timeline);
		RequestDispatcher rd = request.getRequestDispatcher("timeline_view.jsp");
		rd.forward(request, response);
	}
}
