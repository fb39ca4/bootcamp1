public class Triangle {

	// we call x1, y1, etc., fields or instance variables
	// and collectively they are the "representation" of the Triangle
	private double x1, y1, x2, y2, x3, y3;

	// Our constructor
	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		// We have to distinguish the x1 being passed to the constructor
		// from the x1 that is a field.
		// this.x1 is the field x1
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}

	public double area() {
		double area = ((x1 - x3) * (y2 - y1) - (x1 - x2) * (y3 - y1)) / 2;
		if (area < 0) area = -area;
		return area;
	}

}
