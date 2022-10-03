package array2D;

//For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.
//Input format:
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First line of each test case or query contains a single integer value, 'N' representing the 'rows' and 'columns' for the two-dimensional square matrix.
//
//Second line onwards, the next 'N' lines or rows represent the ith row values.
//
//Each of the ith row constitutes 'N' column values separated by a single space.
//
//Output format:
//For each test case, print the single integer denoting the sum.
//
//Output for every test case will be printed in a seperate line.
//
//Constraints:
//1 <= t <= 10^2
//0 <= N <= 10^3
//Time Limit: 1sec
//
//Sample input 1:
//1
//3
//1 2 3
//4 5 6
//7 8 9
//
//Sample Output 1:
//45



public class SumOfBoundariesAndDiagl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] nums = new int [][] {{1, 2, 3, 4, 5},
									{6, 7, 8, 9, 10},
									{11, 12, 13, 14, 15},
									{16, 17, 18, 19, 20},
									{21, 22, 23, 24, 25}};

		System.out.println(boundariesSum(nums));
	}
	
	public static int boundariesSum(int[][] nums) {
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			for( int j=0;j<nums[i].length;j++) {
				sum+= i==0 || i==nums.length-1?nums[i][j]:0;
				
				sum+= i>0 && i<nums.length-1  && i==j ? nums[i][j]:0;
				
				sum+= i>0  && i<nums.length-1 && i+j==nums[i].length-1 && i!=j? nums[i][j] :0;
				
				sum+= (j==0 ||j==nums[i].length-1 ) && i>0 && i<nums.length-1 ? nums[i][j]:0;
				
				//sum+=(j==nums[i].length-1 && i>0 && i<nums.length-1)?nums[i][j]:0;
				
			}
		}
		
		return sum;
	}

}
