package proxy;

class Main {

	/**
	 * Test method
	 */
	public static void main(String[] args) {
		Image proxyImage = new ProxyImage("HiRes_10MB_Photo1");
		Image realImage = new RealImage("HiRes_10MB_Photo2");

		proxyImage.displayImage(); // loading necessary
		proxyImage.displayImage(); // loading unnecessary
		realImage.displayImage(); // loading necessary
		realImage.displayImage(); // loading unnecessary
		proxyImage.displayImage(); // loading unnecessary
	}

}