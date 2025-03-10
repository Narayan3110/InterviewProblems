package Strings;

public class RemoveSpace {
	public static void main(String[] args) {
		
		String s = "Hello   Narayan    This is a test " ;
		
		removeSpace(s);
//		
		String a = remove(s);
//		
		String b= removeSpaces(s);
		System.out.println(a);
		System.out.println(b);
	}
	
	static void removeSpace(String s) {
		s = s.replaceAll(" ", "");
		System.out.println(s);
		
	}
	
	static String remove(String s) {
		return new StringBuilder(s).toString().replace(" " , "");
	}
	
	static String removeSpaces(String s) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i) != ' ') {
				sb.append(s.charAt(i));
			}
		}
		
		return sb.toString();
	}
	
}
