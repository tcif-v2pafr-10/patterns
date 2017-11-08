package strategy;

public class BubbleSort implements SortInterface {
	public void sort(double[] list) {
		int n = list.length;
		double temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {

				if (list[j - 1] > list[j]) {
					// swap the elements!
					temp = list[j - 1];
					list[j - 1] = list[j];
					list[j] = temp;
				}

			}
		}
	}
}