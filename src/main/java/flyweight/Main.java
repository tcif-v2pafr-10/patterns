package flyweight;

public class Main {
	public static final int ROWS = 6, COLS = 10;

	public static void main(String[] args) {
		Factory theFactory = new Factory(ROWS);
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++)
				theFactory.getFlyweight(i).report(j);
			System.out.println();
		}
	}
}