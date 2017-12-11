package iterator;

import java.util.ArrayList;
import java.util.List;

public class Train {
	private String name;
	private List<Wagon> wagons = new ArrayList<>();

	public Train(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Train train = (Train) o;

		return name.equals(train.name);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	public boolean addWagon(Wagon wagon) {
		if (!this.wagons.contains(wagon)) {
			wagons.add(wagon);
			return true;
		}
		return false;
	}

	public int getSeats() {
		int seats = 0;
		for (Wagon wagon : wagons) {
			seats += wagon.getSeats();
		}
		return seats;
	}

	public void removeWagon(Wagon wagon) {
		wagons.remove(wagon);
	}

	public List<Wagon> getWagons() {
		return wagons;
	}

	public void setWagons(List<Wagon> wagons) {
		this.wagons = wagons;
	}

	@Override
	public String toString() {
		return "Train [name=" + name + ", wagons=" + wagons + "]";
	}
}
