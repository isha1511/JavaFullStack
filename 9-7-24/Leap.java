
/*Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year */

import java.io.*;

class LeapYear{


	public static void main(String[] args)throws IOException{

		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		 System.out.println("Enter a year");

		 int year=Integer.parseInt(br.readLine());

		 if(year % 4==0){

			 if(year %100 ==0){

				 if(year %400 ==0){

					 System.out.println(year+" is a Leap Year");
				 }
				 else{
					    System.out.println(year+" is not a Leap Year");
				 }
			 }
			else{
				   System.out.println(year+" is a Leap Year");
			}
		 }

		else{
			   System.out.println(year+" is not a Leap Year");
		}
	}
}		 





