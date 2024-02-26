package hackathonprogram;
import java.util.*;
public class Reverse_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch;
		String str1="";
		
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			str1=ch+str1;
		}
		System.out.println(str1);
		sc.close();
	}
}
