package classandobjectandconstructor;

public class House {

	//variables
	int address;
	String houseName;
	char unit = 'A';
	
	//constructors
	//build constructors
	public House(String name) {
		this.houseName = name;
	}
	public House(String name, int houseAddress) {
		this.houseName = name;
		this.address = houseAddress;
	}
	public House(int houseAddress) {
		this.address = houseAddress;
	}
	//default constructor
	public House() {
		
	}
	
	//methods
	public void livingroom() {
		System.out.println("wtach tv");
	}
	
	public void room() {
		System.out.println("sleep zzzzzzz");
	}
	
	public void kitchen() {
		System.out.println("cook");
	}
	
	public void bathRoom() {
		System.out.println("let's shower");
	}
	
}
