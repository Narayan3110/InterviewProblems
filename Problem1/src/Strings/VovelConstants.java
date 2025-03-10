package Strings;

public class VovelConstants {
	public static void main(String[] args) {
		String name ="Hello World" ;
		count(name);
		
		
	}
	
	static void count(String s) { //name
		int vovel = 0 ;
		int cons = 0 ;
		s= s.toLowerCase().replaceAll(" ", "");
		
		for(int i = 0 ; i <s.length() ; i++) {
			if(Character.isLetter(s.charAt(i))) {
				
				if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u') {
					vovel++;
				}else {
					cons++;
				}
			}
		}
		
		System.out.println("Vovels are =  " + vovel);
		System.out.println("constansts are =  " + cons);
	}
	
}
