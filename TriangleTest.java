//Oleg P
//Assignment 2 - 11.1
public class TriangleTest {

	public static void main(String[] args) {
		Triangle tri = new Triangle(33.0, 22.0, 17.0);
		System.out.println( tri.toString());
		System.out.println( "Color : " +tri.getColor());
		System.out.println( "Filled : " +tri.isFilled());
		System.out.println( "Area : "+ tri.getArea());
		System.out.println( "Perimeter : "+ tri.getPerimeter());
	
		tri.setSide1(3);
		tri.setSide2(4);
		tri.setSide3(5);
		tri.setColor("Salmon");
		tri.setFilled(true);
		
		System.out.println( "\n.:NEW:. "+ tri.toString());
		System.out.println( "Color : " +tri.getColor());
		System.out.println( "Filled : " +tri.isFilled());
		System.out.println( "Area : "+ tri.getArea());
		System.out.println( "Perimeter : "+ tri.getPerimeter());
	}

}
