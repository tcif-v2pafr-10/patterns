package flyweight;

class Gazillion {
	private int row;

	public Gazillion(int theRow) {
		row = theRow;
		System.out.println("ctor: " + row);
	}

	void report(int theCol) {
		System.out.print(" " + row + theCol);
	}
}