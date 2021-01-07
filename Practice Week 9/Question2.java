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
				    a[ch]++;
				    }
		     String str="";
		     for(int j=0;j<s1.length();j++){
		    	 char chr=s1.charAt(j);
				    if(a[chr]==0) {
				    	char chr1=s1.charAt(j);
				    	str+=chr;
				    }}
		     str=str.trim();
		     System.out.println(str);
		} }