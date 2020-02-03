package github;

import java.util.HashSet;
import java.util.Set;

public class PalindromeStringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Tact Coa";
		System.out.println(check(input));
	}
	
	public static boolean check(String input) {
		input = input.toLowerCase();
		input = input.replaceAll("\\s+", "");
		char[] ch = input.toCharArray();
		Set<Character> perm = new HashSet<>();
		for(char c : ch) {
			if(perm.contains(c)) {
				perm.remove(c);
			}else {
				perm.add(c);
			}
		}
		if(perm.size()>=0 && perm.size()<=1) {
			return true;
		}
		return false;
		
	}

}
