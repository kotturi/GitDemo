package learning;

public class StringsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Payment $100 Paid";
		System.out.println(s.charAt(8));
		System.out.println(s.indexOf("$"));
		System.out.println(s.substring(8));
		
		
		//string in reverse
		//palandorm madam=madam
		String s1="madama";
		String t="";
		for(int i=s1.length()-1; i>=0;i--)
		{
			t=t+s1.charAt(i);
			
		}
		System.out.println("s1 is: "+ s1);
		System.out.println("t is: "+ t);
		if(s1 == t)
		{
			System.out.println("its a palandrom");
		}
		else 
			System.out.println("its not a palandrom");

	}

}
