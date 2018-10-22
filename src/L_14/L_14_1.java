package L_14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class L_14_1 {
	  public static void main(String[] args) {
		  //long型で日時を取得
		  long now = System.currentTimeMillis();
		  System.out.println(now);
		  // Date型で日時を表現
		  Date date = new Date(now);
		  System.out.println(date);
		  date = new Date();
		  System.out.println(date);
		  System.out.println(date.getTime());
		  // カレンダークラスからでも取得可能。
		  Calendar calendar = Calendar.getInstance();

		  int year = calendar.get(Calendar.YEAR);
		  System.out.println(year);

		  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		  String string = dateFormat.format(date);
		  System.out.println(string);

	  }
}
