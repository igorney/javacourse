package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ProgramCallendar {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date date = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(date));
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR_OF_DAY, 4);
		date = calendar.getTime();
		int minutes = calendar.get(Calendar.MINUTE);
		int month = 1 + calendar.get(Calendar.MONTH);
		System.out.println("Minutes: "+minutes);
		System.out.println("Month: "+month);
		System.out.println("Date: "+sdf.format(date));
	}

}
