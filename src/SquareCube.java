import java.util.Scanner;
public class SquareCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   double cube;
   double square;
   Scanner one=new Scanner(System.in);
   System.out.print("enter a number to calculate cuberoot:");
   cube=one.nextDouble();
   double cbrt=Math.cbrt(cube);
   System.out.println("cube root of"+cube+" is "+cbrt);
   Scanner two=new Scanner(System.in);
   System.out.print("enter a number to calculate squareroot:");
   square=two.nextDouble();
   double sqrt=Math.sqrt(square);
   System.out.println("square root of"+square+" is "+sqrt);
   
   
	}

}
