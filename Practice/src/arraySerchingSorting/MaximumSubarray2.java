package arraySerchingSorting;


public class MaximumSubarray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int [] {-2,-1,-3,-4,-1,-2,-1,-5,-4};
		
		System.out.println(maxSubArray(nums));

	}
	
	 public static int maxSubArray(int[] nums) {
	        
		 
		 int sum=0;
		 int result = nums[0];
		 
		 for(int i=0;i<nums.length;i++) {
			 sum =sum+nums[i];
			 if(sum>result) {
				 result=sum;
			 }
			 if(sum<0) {
				 sum=0;
			 }
			 
			 
		 }
         return result;
    }

}

/*
 * 
 * 	{-2,1,-3,4,-1,2,1,-5,4}
 * sum=-2
 * 
 * 
 * 
 * */
