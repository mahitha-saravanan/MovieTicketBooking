package com.movie_ticket_booking;

import java.util.Arrays;

public class Array {
	static String [][]arr={{"A1","A2","A3","A4","A5"},
	 		{"B1","B2","B3","B4","B5"},
	 		{"C1","C2","C3","C4","C5"},
	 		{"D1","D2","D3","D4","D5"},
	 		{"E1","E2","E3","E4","E5"}};
	
	public void matrix() {
		for (String[] row : arr) {
			System.out.println(Arrays.toString(row));
		}
			
	}
	 

	public static  boolean validation(String seatnum) {
		boolean isvalid=false;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(arr[i][j].equals(seatnum))
				{
					isvalid=true;
					arr[i][j]="X0";
					break;
					
				}
				else
				{
					continue;
				}
				
			}
			
		}
		if(!isvalid) {
			System.out.println("Invalid seat number.");
		}
		
		return isvalid;
		}
		
	}


