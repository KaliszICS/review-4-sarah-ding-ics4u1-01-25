import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String input = in.nextLine();
		input = "5" + input;
		int num = Integer.parseInt(input)+5;
		System.out.println(num);
		//Write question 1 code here
		
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String input = in.nextLine();
		input = "4" + input + "3";
		double num = Double.parseDouble(input)+3.4;
		System.out.println(num);//Write question 2 code here
		
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a boolean");
		String input = in.nextLine();
		System.out.println(!Boolean.parseBoolean(input));//Write question 3 code here
		
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String input = in.nextLine();
		input = input + "3";
		int num = Integer.parseInt(input)+2;
		char result = (char)num;
		System.out.println(result);//Write question 4 code here
		
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String input = in.nextLine();
		input = input + "1";
		int num Integer.parseInt(input);
		double result =  num/2.0;
		System.out.println(result);
		//Write question 5 code here
		
	}

	public static void q6() {
		Scanner in = new Scanner(System.in);
		Steing input = in.nextLine();
		input = "1"+input;
		double num = Double.parseDouse(input);
		int result = (int)num;
		System.out.prinln(result);//Write question 6 code here
		
	}

}
