/*Write a Program to take the temperature as input as well as the unit C for Celsius and F for Fahrenheit. Compute and print the temperature
 in Fahrenheit or Celsius */

import java.io.*;
class ConvertTemp{

	public static void main(String[] args)throws IOException{

                 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		 System.out.println("Enter a temperature");

		 float temp=Float.parseFloat(br.readLine());

		 System.out.println("Enter a unit of Temperature C for celcius and F for Fahrenheit");

		 char unit=(char)br.read();
		 br.readLine();

		 switch(unit){

		case 'C':
		case 'c':

			 float celcius1=temp;
			 float fahrenheit1=(celcius1 *9/5)+32;
			 System.out.println(celcius1+"\u00B0 C is equal to "+fahrenheit1+"\u00B0 F");
			 break;
		case 'F':
		case 'f':

			 float fahrenheit2=temp;
			 float celcius2=(fahrenheit2-32) *5/9;
			 System.out.println(fahrenheit2+"\u00B0 F is equal to "+celcius2+"\u00B0 C");
			 break;
		default:
			 System.out.println("Invalid unit input please enter C or F");
		 }
	}
}





