package arraySerchingSorting;

//Maximum number
//We are given a 4 digit number using digits 1 to 9. What is the maximum 3 digit number that we can make by removing one digit from the given integer.
//Input Format :
//A 4 digit number
//
//Output Format :
//A 3 digit number
//
//Sample Input :
//5438
//
//Sample Output :
//548
//
//Explanation :
//1. If we remove 5, the new number is 438.
//2. If we remove 4, the new number is 538.
//3. If we remove 3, the new number is 548.
//4. If we remove 8, the new number is 543.
//Out of the 4 cases removing 3 gives us the maximum 3 digit number i.e 548


public class MaximumNumber4digTo3Dig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(maxOf3digit(9833));
	}
	
	public static int maxOf3digit(int n) {
		String s=String.valueOf(n);
		int pos=0;
		
		for(int i=1;i<s.length();i++) {
			if(s.charAt(pos)>s.charAt(i)) pos=i;
		}
		return Integer.parseInt(s.substring(0,pos)+s.substring(pos+1));
	}

}
