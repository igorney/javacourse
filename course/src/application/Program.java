//Instance members
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		//double areaX, areaY, p;
		System.out.println("Enter the measures of triangle x: ");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		//p = (x.a + x.b + x.c)/2;
		//areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		System.out.println("Enter the measures of triangle y: ");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();
		//p = (y.a + y.b + y.c)/2;
		//areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("Larger area: %.4f%n", x.area() > y.area() ? x.area() : x.area());
		System.out.printf("Triangle X area: %.4f%n", x.area());
		System.out.printf("Triangle Y area: %.4f%n", y.area());
		
		scan.close();
	}

}
