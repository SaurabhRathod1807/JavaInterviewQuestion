package hackathonprogram;
import java.util.*;
public class Duplicate_Elements_in_an_Array {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		

		for(int i=0; i<arr.length; i++) {
			System.out.print("The orignal Array : "+arr[i]+ " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.print("The Duplicate Element : "+arr[i]+ " " );
				}
			}
		}
		sc.close();
	}
}
