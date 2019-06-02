package oops;

import java.util.Scanner;

public class Circle 
{
	private double radius = 1.0;
	private String color = "red";

	
	  Circle() {
	  
	  }
	 
	Circle(double r) {
		this.radius = r;
	}

	Double getRadius() {
		return radius;
	}

	Double getArea() {
		Double pi = (double) (22.0 / 7.0);
		System.out.println("value of pi is "+pi);
		Double area = pi * radius * radius;
		return area;
	}

	public static void main(String[] args) {
		System.out.println("Enter the raduis");
		Scanner scn=new Scanner(System.in);
		double r=scn.nextDouble();
		Circle obj = new Circle(r);
		System.out.println("Radius is "+obj.getRadius());
		System.out.println("Area is "+obj.getArea());

		// TODO Auto-generated method stub

	}

}
