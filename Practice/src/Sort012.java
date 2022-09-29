import java.util.Arrays;
//Sort 0 1 2
//Send Feedback
//You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort012(new int[] {1,1,2,2,0,0});
		sort012_(new int[] {2,0,2,1,1,0});
	}
	
	public static void sort012(int[] nums) {
		int n1=0;
		int n2=0;
		int n3=0;
		
		for(int num:nums) {
			if(num==0) n1++;
			if(num==1) n2++;
			if(num==2) n3++;
		}
		
		for(int i=0;i<n1;i++) nums[i]=0;
		
		for(int i=n1;i<n1+n2;i++) nums[i]=1;
		
		for(int i=n1+n2;i<n1+n2+n3;i++) nums[i]=2;	
		
		System.out.println(Arrays.toString(nums));
				
	}
	
	public static void sort012_(int[] nums) {
		int min=0;
		int mid=1;
		int max=nums.length-1;
		
		while(mid<=max){
			if(nums[mid]==2) {
				swap(nums,mid,max);
				max--;
			}else if(nums[mid]==0) {
				swap(nums,mid,min);
				min++;
				mid++;
			}else {
				mid++;
			}
		}
		
		System.out.println(Arrays.toString(nums));
				
	}

	private static void swap(int[] nums, int min, int max) {
		// TODO Auto-generated method stub
		int temp=nums[min];
		nums[min]=nums[max];
		nums[max]=temp;
		
	}

}
