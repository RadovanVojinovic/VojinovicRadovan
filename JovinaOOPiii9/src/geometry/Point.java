package geometry;

public class Point extends Shape{
	private int x;
	private int y;
	private boolean selected;

	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Point(int x, int y, boolean selected) {
		this.x=x;
		this.y=y;
		this.selected=selected;
	}
	
	public double distance(int x, int y) {
		int dX = this.x - x;
		int dY = this.y - y;
		double d = Math.sqrt(dX*dX + dY*dY);
		return d;
	}
	public boolean contains(int x,int y) {
		System.out.println("Uraditi za domaci");
		return false;
	}
	
	
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point temp = (Point) obj;
			if (x == temp.x && y == temp.y) {
				return true;
			}
		}
		return false;
	}
	@Override
	public void moveTo(int x,int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int newY) {
		y = newY;
	}

	public boolean getSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}