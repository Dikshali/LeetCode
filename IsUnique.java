package github;

public class IsUnique {
	
	public static void main(String args[]) {
		String s = "";
		System.out.println("isUnique for "+s+" : "+solution(s));
	}
	
	public static boolean solution(String s) {
		//ASCII printable characters 128
		if(s.length()>128)
			return false;
		boolean[] ch = new boolean[128];
		for(int i=0;i<s.length();i++) {
			if(ch[s.charAt(i)]) {
				return false;
			}
			ch[s.charAt(i)] = true;
		}
		return true;
	}

}
