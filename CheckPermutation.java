package github;

import java.util.HashMap;

public class CheckPermutation {

	public static void main(String[] args) {
		String s1 = "peeks";
		String s2 = "keens";
		System.out.println(check(s1, s2));
	}
	//if s2 is permutation of s1
	public static boolean check(String s1, String s2) {
		//hastable
		if(s1.length()!=s2.length())
			return false;
		
		HashMap<Character,Integer> hs = new HashMap<>();
		for(int i=0;i<s1.length();i++) {
			if(hs.containsKey(s1.charAt(i))) {
				hs.put(s1.charAt(i),hs.get(s1.charAt(i))+1);
			}else {
				hs.put(s1.charAt(i),1);
			}
		}
		for(int i=0;i<s2.length();i++) {
			if(hs.containsKey(s2.charAt(i)) && hs.get(s2.charAt(i))!=0){
				hs.put(s2.charAt(i),hs.get(s2.charAt(i))-1);
			}else {
				return false;
			}
		}
		return true;
		
	}

}
