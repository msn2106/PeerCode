package StringPrac;

import java.util.HashMap;

public class PermutaionContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(checkPermutaionContains("stringabjjjhcjbd","","stirng"));
		System.out.println(checkPermutaionBycount("cjbd","stirng"));

	}
	
	public static boolean checkPermutaionContains(String str, String asf, String checkIf) {
		
		if(str.length()==0) {
			if(asf.contains(checkIf)) return true;
		}
		if(asf.length()>=checkIf.length()) {
			if(asf.contains(checkIf)) return true;
		}
		
		boolean[] alpha=new boolean[26];
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String newStr=str.substring(0,i)+str.substring(i+1);
			
			if(!alpha[ch-'a']) {
				if(checkPermutaionContains(newStr,asf+ch,checkIf)) {
					return true;
				}
				alpha[ch-'a']=true;
			}
			
			
		}
		
		return false;
	}
	
	
	public static boolean checkPermutaionBycount(String str1, String str2) {
		
//		if(str1.length()<str2.length()) {
//			String temp=str1;
//			str1=str2;
//			str2=temp;
//		}
		
		HashMap<Character,Integer> str1map=new HashMap<>();
		HashMap<Character,Integer> str2map=new HashMap<>();
		
		for(int i=0;i<26;i++) {
			str1map.put((char)('a'+i), 0);
			str2map.put((char)('a'+i), 0);
		}
		
		for(int i=0;i<str1.length();i++) {
			str1map.put(str1.charAt(i), str1map.getOrDefault(str1.charAt(i),0)+1);
		}
		for(int i=0;i<str2.length();i++) {
			str2map.put(str2.charAt(i), str2map.getOrDefault(str2.charAt(i),0)+1);
		}
		
		for(int i=0;i<26;i++) {
			int num1=str1map.get((char)('a'+i));
			int num2=str2map.get((char)('a'+i));
			
			if(num1!=num2) return false;
		}
		return true;
		
	}

}
