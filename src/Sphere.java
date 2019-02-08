public class Sphere extends Circle{

	Sphere(double r) {
		super(r);
		// TODO Auto-generated constructor stub
	}
	public double Volume() {
		return radius * radius * radius * Math.PI * 4 / 3;
	}
	public String FormattedVolume() {
		return FormatNumber(Volume());
	}
	public void PrintDetails() {
		super.PrintDetails();
		System.out.println("Volume: \t" + FormattedVolume());
	}
}
