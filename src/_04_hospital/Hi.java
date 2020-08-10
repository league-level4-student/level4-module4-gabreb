package _04_hospital;

import java.util.Random;

import javax.swing.JOptionPane;

public class Hi {
	static int[] a = {2, 3, 5, 6, 8, 9};
	public static void main(String[] args) {
		// 1
		System.out.println("9");
		// 2
		int x = new Random().nextInt(3);
		switch (x) {
		case 0:
			System.out.println("cheese");
			break;
		case 1:
			System.out.println("pepperoni");
			break;
		case 2:
			System.out.println("sausage");
			break;
		default:
			System.out.println("Error!");
			break;
		}
		// 3
		// CustomList<String> string = new CustomList<String>();
		// CustomList<Random> random = new CustomList<Random>();

		// 4
		// s == Season.WINTER
		// s == Season.SPRING
		// s == Season.SUMMER
		// s == Season.FALL

		// 5
		reverseString("Nachos");

		// 6
		// failure
		// x = 0
		
		//7 
		
		/* 
		public int get() {
		return value;
		}
		public void set(int z) {
		if (z >= 0) {
		this.value = z;
		}
		else {
		System.out.println("ERROR! THE NUMBER WAS NEGATIVE");
		}
		*/
		
		//8
		// YOU CAN NOT DO THIS ----> Super t = new Sub(); you can't do this because the sub class extended the super class
		// and the super class did not extend the sub class
		
		//9
		// 2 1
		
		//10
		
		// A comment looks like this:
		// \\*comment here*\\
		
		//11
		String in = JOptionPane.showInputDialog("Enter some words."); 
		String out = "";
		for (int i = 0; i < in.length(); i++) {
			if (i % 2 == 0) {
				String s = "" + in.charAt(i);
				out += s.toUpperCase();
			}
			else {
				String s = "" + in.charAt(i);
				out += s.toLowerCase();
			}
		}
		System.out.println(out);
		//12
		//because there is no catch
		
		//13
		//5 3 1 4 2 9 
		
		//14
		// x : 6  (or 7)
		// y : 4 (or 5) first one first though for both
		
		//15 
	    // int isLargerThan(Shape other) {
		// return 0;	
		// }
		
		//16
		oddArray(a);
		
		//17
		//nothing because there is no defualt return statement the method should not run
		//because the else statement messes with the return statement there should be not else statement
		
		//18
		//takes to long and I know how to do it
		
		//19
		String codeAllDay = "Code all day.";
		int indexOfFirstSpace = codeAllDay.indexOf(" ");
		int indexOfSecondSpace = codeAllDay.indexOf(" ", indexOfFirstSpace + 1); codeAllDay.substring(0, indexOfSecondSpace);
		String codeAllNight = codeAllDay + " night"; System.out.println(codeAllDay + codeAllNight);
	}
	
	
	public static void oddArray (int[] arr) {
		for (int i = 0; i < arr.length; i++) {
		if (arr[i]%2 != 0) {
			arr[i] = 0;
		}
		}
	}
	
	static String reverseString(String s) {
		String reverse = "";
		for (int i = s.length() - 1; i > -1; i--) {
			reverse += s.charAt(i);
		}
		System.out.println(reverse);
		return reverse;
	}

}
