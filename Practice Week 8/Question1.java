import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		str=str.toLowerCase();
		String s="";
		boolean isvowel=false;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			switch(ch) {
			case'a':
			case'e':
			case'i':
			case'o':
			case'u':
				isvowel=true;
				break;
		    default:
		    	s=s+ch;
			}
			}
 		if(isvowel) {
 			System.out.println(s);
 		}
 		else {
 			System.out.println("The string consists of no vowels.");
 		}
	}
}