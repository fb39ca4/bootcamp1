import java.util.ArrayList;


public class BootcampApplication {

	public static void main(String[] args) {

		Triangle testTriangle = new Triangle(1, 2, 3, 4, 5, 6);
		System.out.println("The area of testTriangle is " + testTriangle.area());

		ArrayList<Triangle> shapes = new ArrayList<Triangle>();

		for (int i = 0; i < 5; i++) {
			shapes.add(new Triangle(0, 0, i + 1, 0, 0, i + 1));
		}
		System.out.println("There are now " + shapes.size() + " shapes in the shapes list.");

		double totalArea = 0.;
		for (Triangle shape : shapes) {
			totalArea += shape.area();
		}
		System.out.println("The total area of the shapes is " + totalArea);

	}

}
