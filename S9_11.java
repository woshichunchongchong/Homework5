package U9_one_star;

import java.util.*;

public class S9_11 {
	public static void main(String[] args) {
		double a, b, c, d, e, f;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		e = sc.nextDouble();
		f = sc.nextDouble();
		LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
		if(linearEquation.isSolvableO()) {
			System.out.println(linearEquation.getX()+ " " +linearEquation.getY());
		}
		else {
			System.out.println("The equation has no solution.");
		}
	}
}

class LinearEquation{
	
	private double a, b, c, d, e, f;
	
	public LinearEquation() {
	}
	
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		super();
		this.setA(a);
		this.setB(b);
		this.setC(c);
		this.setD(d);
		this.setE(e);
		this.setF(f);
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

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public double getF() {
		return f;
	}

	public void setF(double f) {
		this.f = f;
	}
	
	public boolean isSolvableO() {
		if(this.a*this.d-this.b*this.c!=0) {
			return true;
		}
		else
			return false;
	}
	
	public double getX() {
		double X = 0;
		X=(this.e*this.d-this.b*this.f)/(this.a*this.d-this.b*this.c);
		return X;
	}
	
	public double getY() {
		double Y = 0;
		Y=(this.a*this.f-this.e*this.c)/(this.a*this.d-this.b*this.c);
		return Y;
	}
}
