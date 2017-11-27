package iterator;

import java.util.ArrayList;
import java.util.List;

public class RailRoadCompany {
	private List<Train> trains = new ArrayList<>();
	private Wagons wagons = new Wagons(trains);

	public RailRoadCompany() {
	}

	public List<Train> getTrains() {
		return trains;
	}

	public Train getTrainByName(String name) {
		for (Train train : trains) {
			if (train.getName().equals(name))
				return train;
		}
		return null;
	}

	public boolean addTrain(Train train) {
		if (!trains.contains(train)) {
			trains.add(train);
			return true;
		}
		return false;
	}

	public void removeTrain(Train train) {
		trains.remove(train);
	}

	// public Wagon getWagonByName(String name) {
	// for (Wagon wagon : wagons) {
	// if (wagon.getName().equals(name))
	// return wagon;
	// }
	//
	// return null;
	// }

	public boolean addWagon(Wagon wagon) {
		if (!wagon.getTrain().getWagons().contains(wagon)) {
			wagon.getTrain().getWagons().add(wagon);
			return true;
		}
		return false;
	}

	public void removeWagon(Wagon wagon) {
		wagon.getTrain().removeWagon(wagon);
	}

	@Override
	public String toString() {
		return "RailRoadCompany [trains=" + trains + "]";
	}

	public Wagons getWagons() {
		return wagons;
	}

	public void setWagons(Wagons wagons) {
		this.wagons = wagons;
	}
}
