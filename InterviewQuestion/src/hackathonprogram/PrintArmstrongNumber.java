package hackathonprogram;
import java.util.*;
public class PrintArmstrongNumber {
	public static void getArmstrong(int i) {
		int y, count=0,digit, sum=0, mul;
		y=i;
		while(y!=0) {
			count++;
			y/=10;
		}
		
		y=i;
		while(y!=0) {
			digit= y%10;
			mul=1;
			for(int j=1; j<=count; j++) {
				mul=mul*digit;
			}
			
			sum=sum+mul;
			y/=10;
		}
		
		if(sum==i) {
			System.out.println(i);
		}
			
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number:");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			getArmstrong(i);
		}
	}
}
