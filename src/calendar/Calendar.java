package calendar;

import java.util.Scanner;

public class Calendar {
	private static final int [] MaxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
	public int getMaxDaysOfMonth(int month) {
		return MaxDays [month - 1];
	}
	public void printSampleCalendar () {
		System.out.println("    일      월      화      수      목      굼      토");
		System.out.println("----------------------------");
		System.out.println("  1   2   3   4   5   6   7");
		System.out.println("  8   9  10  11  12  13  14");
		System.out.println(" 15  16  17  18  19  20  21");
		System.out.println(" 22  23  24  25  26  27  28");
		System.out.println(" 29  30  31 ");
			
		}
		
	
	public static void main (String [] args) {

	String PROMPT = "<cal> ";
	Scanner scanner = new Scanner(System.in);
	System.out.println("반복횟수를 입력하시오:");
	int month=1;
	
	
	while(true) {
	Calendar cal = new Calendar();
	System.out.println("달을 입력하시오:");
	System.out.print(PROMPT);
	month = scanner.nextInt();
	if(month == -1) {
		break;
	}
	if(month > 12)
		continue;
	
	System.out.println(month + "월달은 " + cal.getMaxDaysOfMonth(month) + "일 까지 있습니다.");
	}
	//cal.printSampleCalendar();
	System.out.println("-end-");
	scanner.close();
	}	
}	

