import java.util.Scanner;

public class String_special_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1=sc.nextLine();
		int specialcharacterCount = 0;
		s1= s1.toLowerCase();
		
		for(int i=0;i<=s1.length()-1;i++) {
			if((s1.charAt(i)>=32 && s1.charAt(i)<=47) || (s1.charAt(i)>=58 && s1.charAt(i)<=64) || (s1.charAt(i)>=91 && s1.charAt(i)<=96)  || (s1.charAt(i)>=123 && s1.charAt(i)<=126))
			{
				specialcharacterCount ++;
			}
		}
		
		System.out.println("Number of special characters in the given String is: "+specialcharacterCount);
		

	}
}

