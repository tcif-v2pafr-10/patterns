package delegate;

public class Delegate {
	// to the outside world it looks like Printer actually prints.
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.print();
	}

}

class RealPrinter { // the "delegate"
	void print() {
		System.out.print("something");
	}
}

class Printer { // the "delegator"
	RealPrinter p = new RealPrinter(); // create the delegate

	void print() {
		p.print(); // delegation
	}
}
