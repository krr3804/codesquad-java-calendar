package calendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT ="cal> ";
	
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar1 cal = new Calendar1 ();
		
		int month = 1;
	
	while(true) {
		System.out.println("달을 입력하시오:");
		System.out.print(PROMPT);
		month = scanner.nextInt();
		if(month == -1) {
			break;
		}
		if(month>12 || month<1) {
			continue;
	}
		cal.printCalendar(month);
	}
	System.out.println("-end-");
	scanner.close();	
	}
	
	public static void main (String [] args) {
		 Prompt p = new Prompt();
		 p.runPrompt();
	}
	
	
	
}




