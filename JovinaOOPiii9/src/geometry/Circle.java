package geometry;

public class Circle extends Shape{
	
	private Point center;
	private int r;
	private boolean selected;
	
	public Circle() {

	}

	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	public Circle(Point center, int r, boolean selected) {
		this(center, r);
		this.selected = selected;
	}
	public boolean contains(int x,int y) {
		System.out.println("Uraditi za domaci");
		return false;
	}
	
	@Override
	public String toString() {
		return "Center: "  + center + ", radius: " + r;
	}
	@Override
    public boolean equals(Object objC){
        if (objC instanceof Circle){
            Circle temp = (Circle)objC;
            if(center.equals(temp.center) && r == temp.r){
                return true;
            }
        }
        return false;
    }
	
	public double circumference() {
		return 2 * r * Math.PI;
	}
	
	public double area() {
		return r * r * Math.PI;
	}
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	

}
