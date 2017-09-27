//Oleg P
//Assignment 2 - 11.1
public class Triangle extends GeometricObject {

	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	public Triangle() { 
	}	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getArea() {
		double n = (side1 + side2 + side3) / 2 ;
		return Math.sqrt(n * (n - side1) * (n - side2) * (n - side3));
	}
	public double getPerimeter() {
		return side1+side2+side3;
	}
	
	public String toString() {
		return "Triangle\nside1 = "+ side1 
		+ "\nside2 = "+ side2 
		+ "\nside3 = "+ side3 ;
	}
}
