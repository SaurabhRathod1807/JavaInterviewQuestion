package hackathonprogram;
import java.util.*;
public class Count_Vowels_and_Consonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int count1=0, count2=0;
//		str.toUpperCase();
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
//				count1++;
//			}
//			else {
//				count2++;
//			}
//		}
//		System.out.println("The count of Vowels : "+count1);
//		System.out.println("The count consonants : "+count2);
//		
		for(char ch:str.toLowerCase().toCharArray()) {
			if(ch>='a' && ch<='z') {
				if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ) {
					count1++;
				}
				else{
					count2++;
				}
			}
		}
		System.out.println("The count of Vowels : "+count1);
		System.out.println("The count consonants : "+count2);
		
		
		sc.close();
	}
}
