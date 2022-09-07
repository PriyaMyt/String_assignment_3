
public class String_reverse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "iNeuron";
		String reverse="";
		char ch;
		System.out.println("Input: " +s);
		for(int i=0; i<s.length(); i++) {
			ch=s.charAt(i);
			reverse=ch+reverse;
		}
		System.out.println("Output: " +reverse);

	}

}
