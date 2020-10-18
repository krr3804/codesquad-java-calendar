package calendar;

import java.util.Scanner;

public class Sum {
	public static void main (String [] args) {
		System.out.println("값을 입력하시오 : ");
		Scanner sc = new Scanner (System.in);
		String inputVal = sc.nextLine();
		String [] splitVal = inputVal.split(",");
		
		int input1 = Integer.parseInt(splitVal[0]);
		int input2 = Integer.parseInt(splitVal[1]);
		
		int sum = input1 + input2;
		System.out.println("두 수의 합은 : " + sum);
		sc.close();
	}
	
}
