package hackathonprogram;
import java.util.*;
public class Count_Occurrences_of_a_Character {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter The String :");
//		String str = sc.next();
//		System.out.println("Enter the traget Character: ");
//		char Traget_ch=sc.next().charAt(0);
//		int count=0;
//		
//		for(char ch:str.toCharArray()) {
//			if(ch==Traget_ch) {
//				count++;
//			}
//		}
//		
//		System.out.println("The Occurrences of Character " + Traget_ch + " is " + count );
//		sc.close();
//	}


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        char traget=sc.next().charAt(0);
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==traget) {
            	count++;
            }
        }
        System.out.println(count);
    }

}
