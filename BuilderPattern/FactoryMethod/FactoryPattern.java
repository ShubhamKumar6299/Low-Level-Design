package BuilderPattern.FactoryMethod;

public class FactoryPattern {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape shape1 = shapeFactory.getShape("circle");
		Shape shape2 = shapeFactory.getShape("square");

		shape1.draw();
		shape2.draw();
	}
}
