package facade;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class TravelFacade 
{
	private HotelBooker hotelBooker;
	private FlightBooker flightBooker; 
	
	public List<String> getFlightsAndHotels(Date from, Date to)
	{
	         List<Flight> flights = flightBooker.getFlightsFor(from, to);
	         List<Hotel> hotels = hotelBooker.getHotelNamesFor(from, to);
	         //process and return
	         List<String> traveloptions = new ArrayList<String>();
	         traveloptions.add(flights.toString());
	         traveloptions.add(hotels.toString());
	         return traveloptions;
	}

}
