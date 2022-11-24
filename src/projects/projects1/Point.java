package projects.projects1;

public class Point {

	private double x, y;

	public Point() {
		setX(0);
		setY(0);
	}

	public Point(double userX, double userY) {
		setX(userX);
		setY(userY);
	}

	public void setX(double inpX) {
		x = inpX;
	}

	public void shiftX(double userX) {
		x += userX;
	}

	public double getX() {
		return x;
	}

	public void setY(double inpY) {
		y = inpY;
	}

	public void shiftY(double userY) {
		y += userY;
	}

	public double getY() {
		return y;
	}

	public void swap() {
		double tempX = x;
		double tempY = y;
		x = tempY;
		y = tempX;
	}

	public void rotate(double userAngle) {
		double tempX = x;
		x = x * Math.cos(userAngle) - y * Math.sin(userAngle);
		y = tempX * Math.sin(userAngle) + y * Math.cos(userAngle);
	}

	public double distance() {
		return Math.hypot(Math.abs(this.x - 0), Math.abs(this.y - 0));
	}

	public double distance(Point p) {
		return Math.hypot(Math.abs(this.x - p.x), Math.abs(this.y) - p.y);
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

}
