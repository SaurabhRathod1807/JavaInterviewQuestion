package hackathonprogram;
import java.util.*;
public class Reverse_an_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= {9,8,7,6,5,4,3,2,1};
		System.out.println("The Orignal Array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(+arr[i] + " ");
		}
		System.out.println();
		System.out.println("The revers Array :");
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
