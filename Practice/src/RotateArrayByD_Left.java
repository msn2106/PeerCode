import java.util.Arrays;

public class RotateArrayByD_Left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr=revrse(new int[] {1 ,2 ,3 ,4 ,5 ,6 ,7},2);
			System.out.println(Arrays.toString(arr));
	}
//	1 2 3 4 5 6 7
//	2
//
//	Sample Output 1:
//	3 4 5 6 7 1 2

	public static int[] revrse(int[] arr, int d) {
		reverse(arr,0,arr.length-1);
		reverse(arr,0,arr.length-1-d);
		reverse(arr,arr.length-d,arr.length-1);
		return arr;
	}
	
	public static void reverse(int[] arr, int i, int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
