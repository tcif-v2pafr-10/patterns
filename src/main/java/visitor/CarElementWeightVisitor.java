package visitor;

public class CarElementWeightVisitor implements CarElementVisitor {

	public void visit(Wheel wheel) {
		System.out.println("Mass of a "+wheel.getName()+" wheel is: 10 kg");
	}

	public void visit(Engine engine) {
		System.out.println("Mass of an engine is: 100 kg");
	}

	public void visit(Body body) {
		System.out.println("Mass of a body is: 80 kg");
	}

	public void visit(Car car) {
		System.out.println("Mass of a car is: 1000 kg");
	}

}
