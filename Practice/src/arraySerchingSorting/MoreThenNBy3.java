package arraySerchingSorting;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

//Q1 :- You are given an array/list 'ARR' of integers of length ‘N’. 
//You are supposed to find all the elements that occur strictly more than floor(N/3) times in the given array/list.
public class MoreThenNBy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(morethenNby3(new int[] {2,2,2,3,3,3,1,1,2}));
		
	}
	
	public static List<Integer> morethenNby3(int [] arr){
		
		List<Integer> list=new ArrayList<>();
		HashMap<Integer,Integer> map=new HashMap<>();
		
		int n=arr.length/3;
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		for(Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue()>=3) list.add(entry.getKey());
		}
		
		return list;
		
	}

}
