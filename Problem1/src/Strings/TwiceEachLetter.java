package Strings;

public class TwiceEachLetter {
	
	public static void main(String[] args) {
		String a = "Hello" ;
		
//		twiceLetter(a);
		
		System.out.println(twiceLetter1(a));
	}
	
	static void twiceLetter(String a) {
		
		for(int i = 0 ; i < a.length() ; i++ ) {
			
			for(int j = 0 ; j < 2 ; j++) {
				System.out.print(a.charAt(i));
			}
		}
		
	}
	
	static String twiceLetter1(String a) {
		StringBuilder sb = new StringBuilder();
		
		for(char alphabet : a.toCharArray()) {
			sb.append(alphabet).append(alphabet);
		}
		
		return sb.toString();
	}

}
