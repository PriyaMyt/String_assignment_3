import java.util.Scanner;
public class Repeated_char_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1 = sc.nextLine();
		char s1Arr[]= s1.toCharArray();
		System.out.println("Repeated Char in this string : ");
		
		for(int i=0;i<=s1.length()-1;i++) {
			for(int j=i+1; j<=s1.length()-1;j++) {
				
				if(s1Arr[i]==' ' || s1Arr[j]==' ')
				{
					continue;
				}
				else if(s1Arr[i]==s1Arr[j]) {
					System.out.print(s1Arr[j]+ " ");
					break;
				}
			}
		}

	}

}
