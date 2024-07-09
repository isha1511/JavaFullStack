
/*Write a Program to take the temperature in Celsius as input and compute and print the temperature in Fahrenheit using the formula 
 fahrenheit = (celsius * 9/5) + 32 */

import java.io.*;
import java.util.*;
class DegreeToFah{


        double convert(double temp){

                double fah=(temp*9/5)+32;

                return fah;
        }
        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the temperature in Degree Celcius");

                double temp=Double.parseDouble(br.readLine());

                double res=new DegreeToFah().convert(temp);

                System.out.println(temp +"\u00B0"+" is "+res+" in Faraenheit");
        }
}

