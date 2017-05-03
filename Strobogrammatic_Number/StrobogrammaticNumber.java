import java.util.*;

public class StrobogrammaticNumber {
	public static boolean isStrobogrammatic(int num) {
		Map<Character, Character> map = new HashMap<>();
		map.put('0', '0');
		map.put('1', '1');
		map.put('6', '9');
		map.put('9', '6');
		map.put('8', '8');
		
		String no = Integer.toString(num);
		
		int low = 0, high = no.length()-1;
		
		while (low <= high) {
			if (!map.containsKey(no.charAt(low))) return false;
			if (no.charAt(high) == map.get(no.charAt(low))) {
				low++;
				high--;
			} else return false;
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = kbd.nextInt();
		System.out.println("The number entered is a Strobogrammatic number - "+isStrobogrammatic(num));
		kbd.close();
	}
}
