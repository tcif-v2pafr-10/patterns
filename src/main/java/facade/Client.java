package facade;

import java.util.Date;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		TravelFacade facade = new TravelFacade();

		long from = 1;
		long to = 100000;

		List<String> traveloptions = facade.getFlightsAndHotels(new Date(from), new Date(to));
		// process traveloptions
		for (String top : traveloptions)
			System.out.println(top);
	}

}
