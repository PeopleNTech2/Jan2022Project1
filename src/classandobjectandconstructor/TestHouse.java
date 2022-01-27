package classandobjectandconstructor;

public class TestHouse {

	public static void main(String[] args) {
		
		House myHouse = new House();
		
		myHouse.bathRoom();
		myHouse.kitchen();
		myHouse.livingroom();
		myHouse.room();
		System.out.println(myHouse.unit);
		System.out.println(myHouse.houseName);
		
		House yourHouse = new House(567);
		yourHouse.bathRoom();
		
		House hisHouse = new House("white house");
		
		House herHouse = new House("red house", 456);
		herHouse.room();
		herHouse.livingroom();
	}

}
