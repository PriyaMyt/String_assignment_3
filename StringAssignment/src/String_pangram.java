import java.util.Scanner;
public class String_pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String:");
		String str=sc.nextLine();
		str=str.replaceAll("","").toLowerCase();
		String s="";

		for(char i='a';i<='z';i++){
			if(str.indexOf(i)!=-1){

				s=s+i;// empty string+character
			}
		}
		if(s.length()==26){
			System.out.println("Given string is Pangram");
		}
		else{
			System.out.println("Given string is Not Pangram");
		}

	}

}
