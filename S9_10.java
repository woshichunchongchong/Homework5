package U9_one_star;

import java.util.Scanner;

public class S9_10 {
	public static void main(String[] args) {
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
		if(quadraticEquation.getDiscriminant()>0) {
			System.out.println(quadraticEquation.getRoot1()+ " " +quadraticEquation.getRoot2());
		}
		else if(quadraticEquation.getDiscriminant()==0){
			System.out.println(quadraticEquation.getRoot1());
		}
		else {
			System.out.println("The equation has no roots.");
		}
	}
}

class QuadraticEquation{
	
	private double a, b, c;

	public QuadraticEquation(double a, double b, double c) {
		super();
		this.setA(a);
		this.setB(b);
		this.setC(c);
	}
	
	public QuadraticEquation() {
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public double getDiscriminant() {
		return this.b*this.b-4*this.a*this.c;
	}
	
	public double getRoot1() {
		if(getDiscriminant()>=0) {
			return (-(this.b)+Math.sqrt(getDiscriminant()))/2*this.a;
		}
		else {
			return 0;
		}
	}
	
	public double getRoot2() {
		if(getDiscriminant()>=0) {
			return (-(this.b)-Math.sqrt(getDiscriminant()))/2*this.a;
		}
		else {
			return 0;
		}
	}
}