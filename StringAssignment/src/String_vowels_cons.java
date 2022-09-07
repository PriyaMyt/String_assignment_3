import java.util.Scanner;
public class String_vowels_cons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s1=sc.nextLine();
		int vowelCount = 0;
		int consCount = 0;
		s1= s1.toLowerCase();
		
		for(int i=0;i<=s1.length()-1;i++) {
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
			{
				vowelCount ++;
			}
			else if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
				consCount ++;
		}
		
		System.out.println("Number of vowels in the given String is: "+vowelCount);
		System.out.println("Number of Consonants in the given String is: "+consCount);
		
	}

}
