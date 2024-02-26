package hackathonprogram;
import java.util.*;
public class Check_for_AnagramsStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		
		if(str1.length()==str2.length()) {
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean result=Arrays.equals(ch1, ch2);
			
			if(result) {
				System.out.println(str1 + " And "+ str2 +" Both Strings Are  Anagrams" );
			}
			else {
				
				System.out.println(str1 + " And " + str2 +" Both Strings Are Not Anagrams");
			}
			
			
		}
		else {
			System.out.println(str1 + " And " + str2 +" Both Strings Are Not Anagrams");
		}
		sc.close();
	}
}
