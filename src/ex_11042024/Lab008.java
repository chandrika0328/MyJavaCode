package ex_11042024;

import java.util.Scanner;

public class Lab008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int entered_number = sc.nextInt();
        if(entered_number>0)
        {
        	  System.out.println("The entered number is  positive");
        }
        	
        else if(entered_number<0)
        {
        	System.out.println("The entered number is negative");
        }
        else
        {
        	System.out.println("The entered number is zero");
        }
	}

}
