package arraySerchingSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSum {
	public static void main(String[] args) {
		
		//int[][] result=pairSum();
	}
	
	public static int[][] pairSum(int[] arr, int s) {
	
		List<List<Integer>> list=new ArrayList<>();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]+arr[j]==s && i!=j) {
					List<Integer> list2=new ArrayList<Integer>();
					list2.add(arr[i]);
					list2.add(arr[j]);
					list.add(list2);
				}
			}
		}
		
		int[][] result=new int[list.size()][2];
		
		for(int i=0;i<list.size();i++) {
			result[i][0]=list.get(i).get(0);
			result[i][1]=list.get(i).get(1);
		}
		
		
		
		
		
		return result;
	}
}
