/*Write a Program to compute and print perimeter and area of a rectangle in inch and inch2, where length and breadth are entered in cm.
 */

import java.io.*;
class Rectangle{


        void rectangle(float length,float breadth){

                double area=(length*breadth)/2.54;

		double perimeter=(2*(length+breadth)/2.54);

		System.out.println("Area of rectangle is "+area);

		System.out.println("Perimeter of rectangle is "+perimeter);
        }
        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the length in cm");

                float length=Float.parseFloat(br.readLine());

		System.out.println("Enter the breadth in cm");
                
		float breadth=Float.parseFloat(br.readLine());

		Rectangle obj=new Rectangle();
		obj.rectangle(length,breadth);
	
        }
}

