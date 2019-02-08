
public class Circle {
	Circle(double r) {
		setRadius(r);
		Count++;
		// or radius = r;
	}
	public static int Count = 0;
	protected double radius;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double r) {
		this.radius = r;
	}
	
	public double Circumference() {
		return 2 * radius * Math.PI;
	}
	public String FormattedCircumference() {
		return FormatNumber(Circumference());
	}
	public double Area() {
		return radius * radius * Math.PI;
	}
	public String FormattedArea() {
		return FormatNumber(Area());
	}
	protected String FormatNumber(double x) {
		return String.format("%.2f", x);
	}
	
	public void PrintDetails() {
		System.out.println("Circumference: \t" + FormattedCircumference());
		System.out.println("Area: \t\t" + FormattedArea());
	}
	
	

}

