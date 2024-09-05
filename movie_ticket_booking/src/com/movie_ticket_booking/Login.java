package com.movie_ticket_booking;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Login {
	public static void validation(String n) {
	        String regex = "\\d{10}";
	        Pattern pattern = Pattern.compile(regex);
	        //CharSequence number;
			Matcher matcher = pattern.matcher(n);
			if(matcher.matches())
			{
				OTP.otp_gen();
			}
			else
			{
				System.out.println("Invalid input.Try again later.");
			}
			
	}		
	}
     

	


