package hackathonprogram;
import java.util.*;
public class Prime_Number_Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count=0;
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("The number is prime: " + n);
		}
		else {
			System.out.println("The number is Not prime: " + n);

		}
		sc.close();
	}
}
