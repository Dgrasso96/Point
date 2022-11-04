public class Point {

	private double x;
	private double y;

	public Point() {
		this(0, 0);
	}

	public Point(double x, double y) {

		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double distance() {
		// calcolo con P(x,y)=0,0

		return Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
	}

	public double distance(Point p) {

		return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
	}

}
