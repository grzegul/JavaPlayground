package uzytki;

import java.text.*;
import java.util.*;
public class MsToDate {
	
	public String MTS(long milliSeconds){
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(milliSeconds); 
		return formatter.format(calendar.getTime());
	}
	public long STM(String s){
		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy"); 
		Date date = new Date();
		try{
			date = dt.parse(s); 
		}catch(ParseException e) {
			throw new RuntimeException(e);
		}
		return date.getTime();
	}
		
	public static void main (String[] args){
		MsToDate mtd = new MsToDate();
		long x = Long.parseLong("1451602800000");
		System.out.println("x = " + mtd.MTS(x)); 
		String a = "01/01/2016";
		System.out.println("a = " + mtd.STM(a));

	}
}
