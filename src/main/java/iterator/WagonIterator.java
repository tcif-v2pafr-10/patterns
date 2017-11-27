package iterator;

import java.util.List;
import java.util.Iterator;

public class WagonIterator implements Iterator<Wagon> {
	private int index;
	private List<Train> trains;

	public WagonIterator(List<Train> trains) {
		this.index = 0;
		this.trains = trains;
	}

	@Override
	public boolean hasNext() {
		int total = 0;
		for (Train train : trains) {
			total += train.getWagons().size();
		}
		if (index < total) {
			return true;
		}
		return false;
	}

	@Override
	public Wagon next() {
		if (this.hasNext()) {
			int current = 0;
			index++;
			for (Train train : trains) {
				if (index > (current + train.getWagons().size())) {
					current += train.getWagons().size();
				} else {
//					System.out.println("Index = "+index+" current = "+current);
					return train.getWagons().get(index-current-1);
				}
			}

		}
		return null;
	}
}
