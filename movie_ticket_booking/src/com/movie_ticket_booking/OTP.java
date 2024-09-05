package com.movie_ticket_booking;
import java.util.Random;
import java.util.Scanner;
public class OTP {
	public static int generateRandomFourDigitNumber() {
        Random random = new Random();
        return 1000 + random.nextInt(9000);
    }
	public static void otp_gen() {
        for (int i = 0; i <1; i++) {
            int randomNumber = generateRandomFourDigitNumber();
            System.out.println("Your OTP is :"+randomNumber);
            Scanner scan=new Scanner(System.in);
    		System.out.println("Re-Enter the given OTP :");
    		int otp1=scan.nextInt();
    		//scan.close();
    		if(randomNumber==otp1)
    		{
    		System.out.println("Mobile number Verification Successful.");
    		System.out.println();
    		System.out.println("---------------------------");
    		System.out.println("Welcome to Riyah Cinemas !!");
    		System.out.println("---------------------------");
    		System.out.println();
    		Array array = new Array();
			array.matrix();
			System.out.println();
			System.out.println("The above given Matrix represents our seating format.");
			System.out.println();
			Scanner scann=new Scanner(System.in);
			System.out.println("Enter the number of requirements:");
			int req=scann.nextInt();
			//scann.close();
			if(req>0&&req<=25)
			{   for(int a=1;a<=req;a++)
			{
				Scanner scan1=new Scanner(System.in);
				System.out.println("Enter the Seat number "+a+":");
				String seatnum=scan1.nextLine();
				if(Array.validation(seatnum))
				{
					continue;
				}
				else
				{
					System.out.println("Seat not avaialable . Go through the matrix and select seat number");
					a--;
				}
				}
				System.out.println("Your Grand total for the tickets are : "+120*req);
				Scanner sc=new Scanner(System.in);
				System.out.println("Select 1 for payment confirmation.");
				String ans=sc.nextLine();
				if(ans.equals("1"))
				{
				System.out.println("Your tickets are confirmed . Thank you for choosing Riyah Cinemas !!");
				Array array2 = new Array();
				array2.matrix();
				System.out.println("Wanna continue then click S.");
				Scanner sa=new Scanner(System.in);
				String inp=sa.nextLine();
				if(inp.equals("S")) {
					Main.main(null);
				}
				else {
					System.out.println("Catch you later.");
				}
				//sa.close();
					
				}
				else
				{
					System.out.println("Payment failed.Try again later.");
				}
				//sc.close();
				
			}
			else
			{
				System.out.println("Requirements are not available.");
			}
    		}
    		else
    		{
    			System.out.println("Invalid OTP.Try again later.");
    		}
    	}
        
    }

}
