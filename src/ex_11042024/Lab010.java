package ex_11042024;

import java.util.Scanner;

public class Lab010 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char ch=sc1.next().charAt(0);
        
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
        	  System.out.println("The entered character is a vowel");
        }
       
        else	
            
        {
        	 System.out.println("The entered character is a ");
        }
	}

}