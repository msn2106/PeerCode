package StringPrac;

public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(numberOfwords(" this is a simple example "));
	}
	public static int numberOfwords(String s) {
		s=s.trim();
		int count=0;
		while(s.indexOf(" ")!=-1) {
			count++;
			s=s.substring(s.indexOf(" ")+1);
		}
		
		return count;
//		String[] strs=s.split(" ");
//		return strs.length;
	}

}
