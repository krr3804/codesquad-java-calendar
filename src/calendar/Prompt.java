package calendar;

import java.util.Scanner;

public class Prompt {	
/*	public int parseDay(String week) {
		if (week.equals("SU")) return 0;
		else if (week.equals("MO")) return 1;
		else if (week.equals("TU")) return 2;
		else if (week.equals("WE")) return 3;
		else if (week.equals("TH")) return 4;
		else if (week.equals("FR")) return 5;
		else if (week.equals("SA")) return 6;
		else return 0;
	}
	*/
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar1 cal = new Calendar1 ();
	
		int year = 0;
		int month = 0;
		
	
		while(true) {
			System.out.println("몇년도입니까?");
			year = scanner.nextInt();
			System.out.println("몇월입니까?");
			month = scanner.nextInt();
		
		if (year <1) {
			break;
		}
		//System.out.println("시작 요일을 입력하시오");
		//System.out.println("WEEKDAY>");
	//	String str_weekday = scanner.nextLine();
	//	weekday = parseDay(str_weekday);
		
		if(month>12 || month<1) {
			break;
	}
		cal.printCalendar(year, month);
	}	
	System.out.println("잘못된 입력입니다.");
	}
	
	public static void main (String [] args) {
		 Prompt p = new Prompt();
		 p.runPrompt();
	}
		
	
}




