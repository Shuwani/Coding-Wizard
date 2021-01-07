import java.util.Scanner;
public class Question2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("First String");
		String s1=sc.nextLine();
		s1=s1.toLowerCase();
		System.out.println("Enter Second String");
		String s2=sc.next();
		char a[]=new char[200];
		     for(int i=0;i<s2.length();i++){
		    	 char ch=s2.charAt(i);
		    	 String s=Character.toString(ch);
		    	 s1=s1.replace(s,"");
		     }
		     System.out.println(s1.trim());
		} }