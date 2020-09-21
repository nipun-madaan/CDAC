package cdac;
import java.util.*;
class Circle{
	public static void main(String... args){
		double radius;
		double pi = 3.14;
		System.out.print("Enter the radius of circle: ");
		Scanner sc = new Scanner(System.in);
		radius = sc.nextDouble();
		double circum = 2*pi*radius;
		double area =  pi*radius*radius;
		System.out.println("Circumference of circle : "+circum);
		System.out.println("Area of circle : "+area);
	}
}