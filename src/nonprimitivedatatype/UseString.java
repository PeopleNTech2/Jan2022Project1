package nonprimitivedatatype;

public class UseString {

	public static void main(String[] args) {
		
		System.out.println("your name");
		
		String str = "John Doe"; 
		String str2 = "John Snow";
		String str3 = "     Jack Sparrow     ";
		System.out.println(str);
		
		//string manipulation
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str3.trim());
		
		//string concatenation
		int i = 5;
		int a = 10;
		
		System.out.println(i+a);//doing math
		System.out.println(str+" "+str2);

	}

}
