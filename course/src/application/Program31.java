//Static members
package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program31 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		//Calculator calc = new Calculator(); Don't need a new object instance 
		double radius, c, v;
		System.out.print("Enter radius: ");
		radius = scan.nextDouble();
		c = Calculator.circunference(radius); //Call Calculator class with Circumference calculus
		v = Calculator.volume(radius);
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		scan.close();
	}

}
