package iterator;

import java.util.Iterator;
import java.util.List;

public class Wagons implements Iterable<Wagon> {
	private List<Train> trains;
	
	public Wagons(List<Train> trains) {
		this.trains = trains;
	}

	@Override
	public Iterator<Wagon> iterator() {
		return new WagonIterator(trains);
	}

}
