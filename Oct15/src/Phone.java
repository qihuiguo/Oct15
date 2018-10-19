/*
 * Qihui Guo
 */

	//attributes
public class Phone {
	private String Manufacturer;
	private String Model;
	private int Price;
	private String Carrier;
	
	//constructor
	public Phone(String manufacturer, String model, int price, String carrier) {
		Manufacturer = manufacturer;
		Model = model;
		Price = price;
		Carrier = carrier;
	}
	
	//methods
	public String call(String phonenumber) {
		return "I am calling "+phonenumber;
		}
	
	public String text(String message) {
		return message+"is sent in";}
	
	public String toString() {
		return "The Manufacturer is: "+Manufacturer+
				"\nThe Model is: "+Model+
				"\nThe Price is: "+Price+
				"\nThe Carrier is: "+Carrier;
		
	}
	
}
