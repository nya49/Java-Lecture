package sec14;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
		
		TimeZone tz = TimeZone.getTimeZone("US/Pacific");
		Calendar nowLA = Calendar.getInstance(tz);
		System.out.print(nowLA.get(Calendar.MONTH)+1 + "월 ");
		System.out.print(nowLA.get(Calendar.DAY_OF_MONTH) + "일 ");
		System.out.print(nowLA.get(Calendar.HOUR)+1 + "시 ");
		System.out.print(nowLA.get(Calendar.MINUTE)+1 + "분 ");

	}

}
