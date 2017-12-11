package iterator;

public class Main {
	public static void main(String[] args) {
		Company railRoadCompany = new Company();
		Train train = new Train("TGV");
		Wagon wagon = new Wagon("Eerste klasse", 25);
		train.addWagon(wagon);
		wagon = new Wagon("Tweede klasse", 30);
		train.addWagon(wagon);
		wagon = new Wagon("Restauratie", 10);
		train.addWagon(wagon);
		railRoadCompany.addTrain(train);
		train = new Train("Sprinter");
		wagon = new Wagon("Sprinter klasse", 15);
		train.addWagon(wagon);
		railRoadCompany.addTrain(train);
//		System.out.println(railRoadCompany);
		for (Wagon thisWagon : railRoadCompany.getWagons()) {
			System.out.println("Name : " + thisWagon.getName());
		}
	}

}
