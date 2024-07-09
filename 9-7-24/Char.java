/*Create a program that takes a single character as input and determines whether it is a vowel or a consonant. Handle wrong inputs by user and default it to character 'A' */

import java.io.*;
class CharCheck{

        public static void main(String[] args)throws IOException{

                 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                 System.out.println("Enter a Character ");

		 char ch=(char)br.read();
		 br.readLine();

		 char default_char='A';

		 if((ch>=65 && ch<=90 )||(ch>=97 && ch<=122)){
			 

		 }else{
			 ch=default_char;
		 }
		 

		 if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){

			 System.out.println(ch+" is a vowel");
		 }
		 else{
			 System.out.println(ch+ " is a consonant");
		 }
	}
}


