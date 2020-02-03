package github;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(checkPalindrome(12321));
		
	}
	
	public static boolean checkPalindrome(int x) {
		if(0==x)
			return true;
		if(0 > x || 0 == x%10)
			return false;
		int reverse = 0;
		while(x > reverse) {
			int pop = x%10;
			reverse = reverse*10 + pop;
			x= x/10;
		}
		if(x == reverse || reverse/10 == x)
			return true;
		return false;
	}
}
