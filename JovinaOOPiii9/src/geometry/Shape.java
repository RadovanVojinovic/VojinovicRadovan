package geometry;

public abstract class Shape implements Moveable {
	protected boolean selected;
	public Shape() {
		
	}
	
	public Shape(boolean selected) {
		this.selected = selected;
	}
	public abstract boolean contains(int x,int y);

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}


}
