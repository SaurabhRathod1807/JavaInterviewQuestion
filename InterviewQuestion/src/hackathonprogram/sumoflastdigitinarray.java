package hackathonprogram;

public class sumoflastdigitinarray {
	public static void main(String[] args) {
		int arr[]= {24,65,25,41,23,4};
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
//			int last=;
			sum=sum+arr[i]%10;
		}
		System.out.println(sum);
		
	}
}
