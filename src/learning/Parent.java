package learning;

public class Parent extends Methods{

	public static void main(String[] args) {
		System.out.println("I navigate to Hoe Page");
		
		Methods m= new Methods();
		String s=m.ValidateHeader();
		System.out.println(s);
		ValidateHeader1();
	}

}
