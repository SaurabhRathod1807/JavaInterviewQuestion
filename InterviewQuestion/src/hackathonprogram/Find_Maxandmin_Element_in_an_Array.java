package hackathonprogram;
import java.util.*;
public class Find_Maxandmin_Element_in_an_Array {
	public static void main(String[] args) {
		int arr[]= {6,5,9,7,2,1,4,3,8};
		int max=arr[0];
		int min=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("The Max Element is :" + max);
		System.out.println("The Min Element is :" + min);
	}
}
