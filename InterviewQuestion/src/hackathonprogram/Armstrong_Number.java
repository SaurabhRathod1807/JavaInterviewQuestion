package hackathonprogram;
import java.util.*;
public class Armstrong_Number {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int y, count=0, sum=0,digit, mul;
		
		y=n;
		while(y!=0) {
			count = count+1;
			y=y/10;
		}
		
		y=n;
		while(y!=0) {
			digit=y%10;
			mul=1;
			
			for(int i=1; i<=count; i++) {
				mul=digit*mul;
			}
			
			
			sum= sum+mul;
			
			y=y/10;
		}
		
		if(sum==n) {
			System.out.println("The Given Number Is Armstrong: " + n );
		}
		else {
			System.out.println("The Given Number Is Not Armstrong: " + n );

		}
		
		sc.close();
	}
}
