package shape;

public abstract class Prism extends Shape {
    private double side;

    public Prism(double height, double side) {
        super(height);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return getBaseArea() * getHeight();
    }

    @Override 
    public double getBaseArea() {
        return Math.pow(side, 2);
    }

    // Watch 1:35:00 of the video for this part
}
