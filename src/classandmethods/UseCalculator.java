package classandmethods;

public class UseCalculator {//this is a runnable class

	//main method is the starting point of any java application 
	public static void main(String[] args) {
		
		//object
		Calculator casio = new Calculator();
		
		casio.add(87654, 12345);
		casio.sub();
		System.out.println(casio.mul(987.5677, 345.6432));
		//System.out.println(casio.add(453, 234));
		System.out.println(casio.div(50, 10));
		
		System.out.println(casio.typeYourName("philip"));
		
		System.out.println(casio.married());
		

	}

}
