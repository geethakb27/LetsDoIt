package tech;

public class Ecommerce {
	static String applicationName;
	static String currentLocation;
	static String DestinationAdress;
	static int price;
	public static String getApplicationName() {
		return applicationName;
	}
	public static void setApplicationName(String applicationName) {
		Ecommerce.applicationName = applicationName;
	}
	public static String getCurrentLocation() {
		return currentLocation;
	}
	public static void setCurrentLocation(String currentLocation) {
		Ecommerce.currentLocation = currentLocation;
	}
	public static String getDestinationAdress() {
		return DestinationAdress;
	}
	public static void setDestinationAdress(String destinationAdress) {
		DestinationAdress = destinationAdress;
	}
	public static int getPrice() {
		return price;
	}
	public static void setPrice(int price) {
		Ecommerce.price = price;
	}

	
}
