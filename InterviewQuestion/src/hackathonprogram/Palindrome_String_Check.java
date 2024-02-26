package hackathonprogram;
import java.util.*;
public class Palindrome_String_Check {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		char ch;
		String str2="";
		
		for(int i=0 ; i<str1.length(); i++) {
			ch= str1.charAt(i);
			str2=ch+str2;
		}
		if(str2.equals(str1)) {
			System.out.println("The String is palindrome : "+ str1);
		}
		else {
			System.out.println("The String is Not palindrome : "+ str1);

		}
		sc.close();
	}
}
