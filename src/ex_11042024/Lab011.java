package ex_11042024;

import java.util.Scanner;

public class Lab011 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc1.nextInt();
        if(year%4==0)
        {
        	System.out.println("The year is a leap year");
        }
        else {
        	System.out.println("The year is not a leap year");
        }
	}

}
