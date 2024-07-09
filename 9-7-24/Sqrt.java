
//Write a Program to calculate the square root of a Number.

import java.io.*;
import java.util.*;
class SquareRoot{

	
	double sqrt(double num){

		double sqr=Math.sqrt(num);

		return sqr;
	}
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a number");

		double num=Double.parseDouble(br.readLine());

		double res=new SquareRoot().sqrt(num);

		System.out.println("SquareRoot of "+num+" is "+res);
	}
}

