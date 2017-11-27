package iterator;

public class Main {
	public static void main(String[] args) {
		Company railRoadCompany = new Company();
		Train train1 = new Train("TGV");
		Wagon wagon1 = new Wagon("Eerste klasse", 25);
		wagon1.setTrain(train1);
		train1.addWagon(wagon1);
		Wagon wagon2 = new Wagon("Tweede klasse", 30);
		wagon2.setTrain(train1);
		train1.addWagon(wagon2);
		Train train2 = new Train("Sprinter");
		Wagon wagon3 = new Wagon("Sprinter klasse", 15);
		wagon3.setTrain(train2);
		train2.addWagon(wagon3);
		railRoadCompany.addTrain(train1);
		railRoadCompany.addTrain(train2);
//		System.out.println(railRoadCompany);
		for (Wagon wagon : railRoadCompany.getWagons()) {
			System.out.println("Name : " + wagon.getName());
		}
	}

}
