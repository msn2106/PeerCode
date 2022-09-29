
//
//You have been given an integer array/list(ARR) of size N. It has been sorted(in increasing order) and then rotated by some number 'K' in the right hand direction.
//Your task is to write a function that returns the value of 'K', that means, the index from which the array/list has been rotated.

public class ReturnK_RotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkRotation(new int[] {5 ,6 ,7 ,8 ,9 ,10})+1);
	}
	
	public static int checkRotation(int[]arr) {
		
		int min =0;
		int max= arr.length-1;
		
		while(min<max) {
			int mid=min+(max-min)/2;
			
			if(mid<arr.length-1 && arr[mid]>arr[mid+1]) return mid;
			
			if(arr[mid]>arr[max]) {
				min=mid+1;
			}
			
			if(arr[mid]<arr[min]) {
				max=mid-1;
			}
			
		}
		if(max==arr.length-1) return -1;
		return max;
		
	}

}
