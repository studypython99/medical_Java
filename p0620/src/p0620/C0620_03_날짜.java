package p0620;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class C0620_03_날짜 {

		public static void main(String[] args) {
			//날짜객체, Date객체
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
			System.out.println(sdf.format(date));
			System.out.println(sdf2.format(date));
			
			// Calendar객체
			Calendar cal = Calendar.getInstance(); 
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
			System.out.println(cal.get(Calendar.YEAR));
			System.out.println(cal.get(Calendar.MONTH));
			System.out.println(cal.get(Calendar.DATE));
			
			
			// currentTimeMillis 활용 날짜출력
			System.out.println(date.getTime()); // 1/1000단위로 가져오기
			long today = System.currentTimeMillis();
			System.out.println(today);
			SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
			
			System.out.println(sdf4.format(today));
		}
}
