package shape;

public abstract class Shape implements Comparable<Shape> {
	private double height; 
	
	public Shape(double height) {
		super();
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public abstract double getVolume();
	
	public abstract double getBaseArea();

	@Override
	public int compareTo(Shape that) {
		if (this.height > that.height) {
			return 1;
		} else if (this.height < that.height) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Shape with height:" + height + ", volume:" + getVolume() + ", BaseArea:" + getBaseArea();
	}
}
