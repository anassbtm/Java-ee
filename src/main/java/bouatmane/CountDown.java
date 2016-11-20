package bouatmane;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountDown extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\" />");
		out.println("<title>CountDown</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+diff()+"</p>");
		out.println("</body>");
		out.println("</html>");

	}
	private String diff(){
		String theDate = "20/11/2016 12:30:00";
		String pattern = "dd/MM/yyyy HH:mm:ss";
		Date d2 = null;
		try {
			d2 = new SimpleDateFormat(pattern).parse(theDate);
		} catch (ParseException e) {
			return "server error...";
		}
		Date d1 = new Date();
		LocalDateTime d3 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		long diff = d2.getTime() - d1.getTime();
		
		long diffSeconds = diff / 1000 % 60;
		long diffMinutes = diff / (60 * 1000) % 60;
		long diffHours = diff / (60 * 60 * 1000) % 24;
		long diffDays = diff / (24 * 60 * 60 * 1000);
		if(diffSeconds == 0 && diffMinutes == 0 && diffHours == 0 && diffDays == 0 ){
			return "vous êtes bien dans la date attendu ";
		}else
			if(diffSeconds<0 ){
				return "la date attendu est dépassé ";
			}else
				return "mtn elle est :"+d3+" Il vous reste "+diffDays+" jour(s) "+diffHours+" heure(s) "+diffMinutes+" minute(s) "+diffSeconds+" seconde(s)";
				
	}
}