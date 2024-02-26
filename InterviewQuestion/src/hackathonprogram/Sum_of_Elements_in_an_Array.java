package hackathonprogram;
import java.util.*;
public class Sum_of_Elements_in_an_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= {1,2,3,4,5};
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum=arr[i]+sum;
		}
		System.out.println("The sum of Element of Array is: " + sum);
		sc.close();
	}
}
