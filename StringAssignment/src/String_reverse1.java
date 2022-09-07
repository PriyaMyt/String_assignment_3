
public class String_reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Think";
		String s1=" Twice"; 
		String reverse="";
		String reverse1="";
		char ch;
		char ch1;
		System.out.println("Input: " +s+s1);
		for(int i=0; i<s.length(); i++) {
			ch=s.charAt(i);
			reverse=ch+reverse;
		}
			for(int j=0; j<s1.length(); j++) {
				ch1= s1.charAt(j);
				reverse1= ch1+ reverse1;
			}
		System.out.println("Output: " +reverse +" " +reverse1);
	}

}
