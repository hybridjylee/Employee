package webapp.test;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateTest {
	static Log log = LogFactory.getLog(DateTest.class);
	
	@Test
	public void test1() {
		Date current = new Date();
		log.info(current.toLocaleString());
	}
	
	@Test
	public void test2() {
		Calendar current = Calendar.getInstance();
		log.info(current.getTime().toLocaleString());
	}
	
	@Test
	public void test3() {
		Date current = new Date();
		
		current.setDate(current.getDate()+10);
		
		log.info("year = " + (current.getYear()+1900));
		log.info("month = " + (current.getMonth()));
		log.info("day = " + (current.getDate()));
		log.info("week = " + (current.getDay()));
	}
	
	@Test
	public void test4() {
		Date date = new Date(2015 - 1900, 2-1, 1);
		
		log.info("start week = " + date.getDay());
		
		int month = date.getMonth();
		while(true) {
			date.setDate(date.getDate() + 1);
			if (month != date.getMonth())
				break;
		}
		date.setDate(date.getDate() - 1);
		log.info("end week = " + date.getDay());
		log.info("end date = " + date.getDate());
		
		log.info(date.toLocaleString());
	}
	
	@Test
	public void test5() {
		Date date = new Date(2015-1900, 3-1, 1);
		int month = date.getMonth();
		log.info("start week = " + date.getDay() + " ");
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
	

}
