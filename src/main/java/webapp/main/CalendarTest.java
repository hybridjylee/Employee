package webapp.main;

import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.junit.experimental.theories.FromDataPoints;

import webapp.escape.Background;
import webapp.escape.Foreground;
import webapp.escape.Screen;

public class CalendarTest {
	
	public static void printCalendar(int year, int month) {
		Screen.cursorPosition(3, 5);
		System.out.println("year = " + year + ", month = " + month);
		
		Date date = new Date(year - 1900, month-1, 1);
		
		month = date.getMonth();
		for(int i=0; i<date.getDay(); i++) {
			System.out.print("    ");
		}
		
		while(month == date.getMonth()) {
			switch (date.getDay()) {
			case 0:
				Screen.forground(Foreground.RED);
				break;
			case 6:
				Screen.forground(Foreground.BLUE);
				break;
			default:
				break;
			}
			System.out.printf("%4d", date.getDate());
			if(date.getDay() == 6) {
				System.out.println();
			}
			date.setDate(date.getDate() + 1);
			Screen.forground(Foreground.WHITE);
		}
	}
	
	public static void main(String[] args) {
		Screen.clear();

		Scanner scan = new Scanner(System.in);
		String param = "";
		while(true) {
			boolean flag = true;
			do {
				flag = true;
				Screen.cursorPosition(20, 1);
				System.out.print("[yyyy/MM] : ");
				param = scan.nextLine();
				Screen.clear();
				System.out.println("param = " + param);
				
				flag = param.matches("[1-9][0-9]{3}/[0-1][0-9]");
			} while(!flag);
			
			StringTokenizer tokens = new StringTokenizer(param, "/");
			int year = Integer.parseInt((String)tokens.nextElement());
			int month = Integer.parseInt((String)tokens.nextElement());
			
			if(month > 0 && month < 13)
				printCalendar(year, month);
		}
		
	}

}
