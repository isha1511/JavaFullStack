//Write a program that takes a range of numbers as input and outputs the Prime Numbers in that range.

import java.io.*;

class Prime{


        public static void main(String[] args)throws IOException{

                 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                 System.out.println("Enter a start");

		 int start=Integer.parseInt(br.readLine());

		 System.out.println("Enter a end");

		 int end=Integer.parseInt(br.readLine());
		
		 System.out.println("prime number from "+start+" to "+end+" are: ");
		 for(int i=start;i<=end;i++){

			 if(isPrime(i)){
				 System.out.println(i+" ");
			 }
		 }
	}

	static boolean isPrime(int num){

		if(num<=1){
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++){

			if(num%i==0){
				return false;
			}
		}
		
		return true;
		
	}
}
