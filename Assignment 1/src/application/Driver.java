package application;

import shape.Cone;
import shape.Shape;

public class Driver {

	public static void main(String[] args) {
		Shape shape;
		Cone cone = new Cone(10,1);
		cone.getRadius();
		cone.getVolume();
		System.out.println(cone);
	}

}
