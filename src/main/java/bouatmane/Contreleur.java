package bouatmane;
import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;

public class Contreleur extends HttpServlet{
	private String titre, locale, time_end;
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,
	ServletException{
	       titre = req.getParameter("titre");
	       locale = req.getParameter("locale");
	       time_end = req.getParameter("time_end");
	      
	      if(titre !=null || locale!=null || time_end!=null ){
	    	  Compteur c = new Compteur(titre, locale, time_end); 
	    	  HttpSession session = req.getSession();
	    	  session.setAttribute("Compteur",c);
	    	 //RequestDispatcher requestDispatcher = req.getRequestDispatcher("//ajouter.jsp") ;
	    	  req.getRequestDispatcher("../webapp/ajouter.jsp").forward(req,res);
	      }else{
	    	  Exception e = new Exception("Veuillez remplir tous les champs");
	    	  req.setAttribute("erreur", e);
	    	  req.getRequestDispatcher("../webapp/erreur.jsp").forward(req,res);
	      }
	      
	      
	      
	      
	      //les cookie
		Cookie [] cookies = req.getCookies();
		if(cookies!=null){
			for(int i=0;i<cookies.length;i++){
				Cookie cookie= cookies[i];
				String nom = cookie.getName();
				String valeur= cookie.getValue();
				
			}
		}
	}

	
}
