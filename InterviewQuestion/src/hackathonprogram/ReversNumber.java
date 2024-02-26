package hackathonprogram;
import java.util.*;
public class ReversNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i=sc.nextInt();
		int  reves=0, digit;
		
		while(i!=0) {
			digit=i%10;
			reves=reves*10+digit;
			i/=10;
		}
		System.out.println(reves);
		sc.close();
	}
}
