package org.ds.list;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateFormatter {

	/**
	 * Utility function to convert java Date to TimeZone format
	 * @param date
	 * @param format
	 * @param timeZone
	 * @return
	 */
	public static String formatDateToString(Date date, String format,
			String timeZone) {
		// null check
		if (date == null) return null;
		// create SimpleDateFormat object with input format
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		// default system timezone if passed null or empty
		if (timeZone == null || "".equalsIgnoreCase(timeZone.trim())) {
			timeZone = Calendar.getInstance().getTimeZone().getID();
		}
		// set timezone to SimpleDateFormat
		sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
		// return Date in required format with timezone as String
		return sdf.format(date);
	}

	public static void main(String[] args) throws ParseException {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DATE, -10);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
		Date txnStartDate = sdf.parse("20-11-19");
		Date txnEndDate =  cal.getTime();
		
		System.out.println("start "+ txnStartDate);
		System.out.println("end "+ txnEndDate);
		
		System.out.println(txnEndDate.after(txnStartDate));
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"dd-MM-yy");
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");				
		
		Date inActiveStartDate = dateFormat.parse(dateFormat.format(formatter.parse("12-Jun-2019")));
		Date inActiveEndDate = dateFormat.parse(dateFormat.format(formatter.parse("12-Oct-2019")));	
		
		System.out.println("inactive start "+ inActiveStartDate);
		System.out.println("incactive end "+ inActiveEndDate);
		
		
		
		//Test formatDateToString method
		/*
		 * Date date = new Date(); System.out.println("Default Date:"+date.toString());
		 * System.out.println("System Date: "+formatDateToString(date,
		 * "dd MMM yyyy hh:mm:ss a", null));
		 * System.out.println("System Date in PST: "+formatDateToString(date,
		 * "dd MMM yyyy hh:mm:ss a", "PST"));
		 * System.out.println("System Date in IST: "+formatDateToString(date,
		 * "dd MMM yyyy hh:mm:ss a", "IST"));
		 * System.out.println("System Date in GMT: "+formatDateToString(date,
		 * "dd MMM yyyy hh:mm:ss a", "GMT"));
		 */
	}
}

