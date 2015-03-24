package webapp.test;

import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CalendarTest {
	
	public static void printCalendar(int year, int month) {
		System.out.println("year = " + year + ", month = " + month);
		
		Date date = new Date(year - 1900, month-1, 1);
		
		month = date.getMonth();
		System.out.print(date.getDate() + " ");
		
		while(true) {
			date.setDate(date.getDate() + 1);
			if(month != date.getMonth())
				break;
			if(date.getDay() == 0)
				System.out.print(date.getDate() + " ");
			else if(date.getDay() == 1)
				System.out.print(date.getDate() + " ");
			else if(date.getDay() == 2)
				System.out.print(date.getDate() + " ");
			else if(date.getDay() == 3)
				System.out.print(date.getDate() + " ");
			else if(date.getDay() == 4)
				System.out.print(date.getDate() + " ");
			else if(date.getDay() == 5)
				System.out.print(date.getDate() + " ");
			else if(date.getDay() == 6) {
				System.out.print(date.getDate() + " ");
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			boolean flag = true;
			String param = "";
			do {
				flag = true;
				System.out.print("[yyyy/MM] : ");
				param = scan.nextLine();
				System.out.println("param = " + param);
				
				flag = param.matches("[1-9][0-9]{3}/[0-9]{2}");
			} while(!flag);
			
			StringTokenizer tokens = new StringTokenizer(param, "/");
			
			printCalendar(Integer.parseInt((String)tokens.nextElement()),
						  Integer.parseInt((String)tokens.nextElement()));
		}
		
	}

}
