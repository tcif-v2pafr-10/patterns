package iterator;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private List<Train> trains = new ArrayList<>();
	private Wagons wagons = new Wagons(trains);

	public Company() {
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

	public Wagon getWagonByName(String name) {
		for (Wagon wagon : wagons) {
			if (wagon.getName().equals(name))
				return wagon;
		}
		return null;
	}

	@Override
	public String toString() {
		return "RailRoadCompany [trains=" + trains + "]";
	}

	public Wagons getWagons() {
		return wagons;
	}
}
