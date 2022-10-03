package arraySerchingSorting;

//
//You have been given an integer array/list(ARR) of size N. It has been sorted(in increasing order) and then rotated by some number 'K' in the right hand direction.
//Your task is to write a function that returns the value of 'K', that means, the index from which the array/list has been rotated.

public class ReturnK_RotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkRotation(new int[] {12 ,17 ,1 ,3 ,6 ,11}));
		System.out.println(checkRotation(new int[] {1,2,3,4,5,6,7}));
		System.out.println(checkRotation(new int[] {4,5,6,7,1,2,3}));
	}
	
public static int checkRotation(int[]arr) {
		
		int min =0;
		int max= arr.length-1;
		
		while(min<=max) {
			int mid=min+(max-min)/2;
			
			if(mid<max && arr[mid]>arr[mid+1]) return mid+1;
			if(mid>min && arr[mid]<arr[mid-1]) return mid;
			
			if(arr[mid]>arr[min]) {
				min=mid+1;
				
			}else {
				max=mid-1;
			}
			
		}
		
		if(min==arr.length-1) return 0;
		
		return min+1;
		
	}

}
