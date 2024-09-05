package com.movie_ticket_booking;
import java.util.Scanner;
public class Main {
	public static void main (String []args) {
		System.out.println("----------");
		System.out.println("Menu Page.");
		System.out.println("----------");
		System.out.println("1.Login.");
		System.out.println("2.Exit.");
		Scanner s=new Scanner(System.in);
		System.out.println("Wanna books tickets ?Then do Login by pressing 1. ");
	    String input=s.nextLine();
	    if(input.equals("1")) {
	    //s.close();
		System.out.println("--------------------------");
		System.out.println("Verify your Mobile Number.");
		System.out.println("--------------------------");
	Scanner scanner = new Scanner (System.in);
	System.out.println("Enter your mobile number :");
	String number=scanner.nextLine();
	Login.validation(number);
	//scanner.close();
	    }
	    else
	    {
	    	System.out.println("Oops! Catch yu later.");
	    }
	
	}
}

