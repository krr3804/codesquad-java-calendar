package calendar;


public class Calendar1 {
	private static final int [] MaxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static int getMaxDaysOfMonth(int month) {
		return MaxDays [month - 1];
	}
			
		
		/*System.out.println("  1   2   3   4   5   6   7");
		System.out.println("  8   9  10  11  12  13  14");
		System.out.println(" 15  16  17  18  19  20  21");
		System.out.println(" 22  23  24  25  26  27  28");*/
	
	

		
		public static void printCalendar (int month) {
			System.out.println("  SU MO TU WE TH FR SA");
			System.out.println("----------------------");
			int maxDay = getMaxDaysOfMonth(month);
			for(int i =1 ; i<= maxDay; i++) {
			System.out.printf("%3d",i);
			if(i%7 == 0) 
			System.out.println();
			}
			System.out.println();
		}

	}
