package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;
public class ShapeFactory {

	public static Shape create(RegularShapeType type) {
		Shape ret = null;
		switch(type) {
			case Triangle:
				ret = new Triangle();
				break;
			case Quadrilateral:
				ret = new Quadrilateral();
				break;
			case Pentagon:
				ret = new Pentagon();
				break;
			case Hexagon:
				ret = new Hexagon();
				break;
			}
		return ret;
	}
}
