package JavaCodingT_0408.ex03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeExample {

	public static void main(String[] args) throws ParseException {
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat ("HH:mm:ss"); 
		
		Date date = new Date( ); 
		String endtime = "18:30:00";
		String time = sdf.format(date);
		
		Date endTime = sdf.parse(endtime);
		Date SecondTime = sdf.parse(time);
		
		long Time = (endTime.getTime() - SecondTime.getTime())/1000;
		long hour = Time/3600;
		long min = (Time%3600)/60;
		long sec = (Time%3600)%60;
		
		
		System.out.println("퇴근시간 : " + endtime);
		System.out.println("현재시간 : " + time);
		
		System.out.println("남은시간 : " + hour + "시간" + min + "분" + sec + "초");
	}

}
