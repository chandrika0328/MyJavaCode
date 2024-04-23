package ex_11042024;

import java.util.Scanner;

public class Lab009 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the first no");
        int a= sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the first no");
        int b= sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the first no");
        int c= sc3.nextInt();
        
        if(a>b&& a>c)
        {
        	  System.out.println("The largest no is:"+a);
        }
        else if(b>c && b>a)	
        
        {
        	 System.out.println("The largest no is:"+b);
        }
        else	
            
        {
        	 System.out.println("The largest no is:"+c);
        }
	}

}

