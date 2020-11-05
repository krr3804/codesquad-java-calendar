package calendar;


public class Calendar1 {
	private static final int [] MaxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int [] Leap_MaxDays = {31,29,31,30,31,30,31,31,30,31,30,31};
	public static boolean isLeapYear (int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
		return false;
	}
	public static int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
		return Leap_MaxDays [month - 1];
		} else {
		return MaxDays [month - 1];
		}
	}
	//시작 일 계산 알고리즘
	// fM = n-1%7
	public static int fM(int month) {
		int sum = 0;
		for(int i=0; i<(month-1); i++) {
			sum += MaxDays[i];
			
		}
		return sum % 7;
	}
	// Leap year = 366 ? 365 :
	public static int Leap(int year, int month) {		
	if (isLeapYear(year) && (month == 1 || month == 2)) {
		return -1;
	}
	else {
		return 0;
	}
}
	//start day of the month
	public static int StartDayofMonth(int year, int month) {
		
		int XX= year/100;
		int YY= year%100%100;
		int fM = fM(month);
		int I = Leap(year, month);
		int j = (YY%7) + ((YY/4)%7) + (5*(XX%4)) - 1 + fM + 1 + I;
	
		return j%7;
	}
		public static void printCalendar (int year, int month) {
			System.out.println("  SU MO TU WE TH FR SA");
			System.out.println("----------------------");
			
		int weekday = StartDayofMonth(year, month);
			//print blank space 
			for(int j=0;j<weekday;j++ ) {
				System.out.print("   ");
			}
			int maxDay = getMaxDaysOfMonth(year, month);
			int count = 7-weekday;
			int delim = (count<7) ? count:0;
			/*
			int delim; 
			if(count<7) {
			delim = count;
			)else {
			delim = 0;
			} 
			*/
			
			//print first line
			for(int i=1; i<=count; i++) {
				System.out.printf("%3d", i);
			}
				System.out.println();
			
			//print from second line to last	
			count++;
			for(int i = count ; i<= maxDay; i++) {
					System.out.printf("%3d",i);
				if(i%7 == delim) 
			System.out.println();
			}
			System.out.println(); 
		}

}
