package hackathonprogram;
import java.util.*;
public class Sum_of_Digit {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int sum=0 , digit;
		
		while(n!=0) {
			digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		
		System.out.println(sum);
		sc.close();
	}
}
