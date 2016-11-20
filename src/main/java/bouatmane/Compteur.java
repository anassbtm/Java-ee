package bouatmane;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.springframework.cglib.core.Local;

public class Compteur {

	private String titre;
	private String local;
	private String time_end;

	public Compteur( String titre,String local,String  date){
		this.titre=titre;
		this.local=local;
		this.time_end=date;
	}
	
	public String getTite(){
		return titre;
	}
	
	public String getLocal(){
		return local;
	}
	
	public String getDate(){
		return time_end;
	}
	
	public void setTitre(String titre){
		this.titre=titre;
	}
	
	public void setLocal(String local){
		this.local=local;
	}
	
	public void setDate(String date){
		this.time_end=date;
	}
	
	
	public String ToString(){
		return titre+" "+ local+" "+time_end;
	}
	
	public String diff(){
		String theDate = "19/11/2016 00:00:00";
		String pattern = "dd/MM/yyyy HH:mm:ss";
		Date d2 = null;
		try {
			d2 = new SimpleDateFormat(pattern).parse(theDate);
		} catch (ParseException e) {
			return "server error...";
		}
		Date d1 = new Date();

		long diff = d2.getTime() - d1.getTime();
		
		long diffSeconds = diff / 1000 % 60;
		long diffMinutes = diff / (60 * 1000) % 60;
		long diffHours = diff / (60 * 60 * 1000) % 24;
		long diffDays = diff / (24 * 60 * 60 * 1000);
		if(diffSeconds == 0 && diffMinutes == 0 && diffHours == 0 && diffDays == 0 ){
			return "vous êtes bien dans la date attendu ";
		}else
			if(diffSeconds<0){
				return "la date attendu est dépassé ";
			}else
				return "Il vous reste "+diffDays+" jour(s) "+diffHours+" heure(s) "+diffMinutes+" minute(s) "+diffSeconds+" seconde(s)";
				
	}
}
