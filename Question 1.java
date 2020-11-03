package package1;
import java.util.*;
public class DuckandChickDna {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.nextLine();
		s=s.toUpperCase();
		char ch;
		String str="";
		for(int i=0;i<s.length();i++){
			  ch=s.charAt(i);
		if(!Character.isDigit(ch)){
			if(ch=='G' || ch=='C'|| ch=='T'|| ch=='A'){
				if(ch=='G'){
					str=str+"C";
				}
				else if(ch=='C'){
					str=str+"G";
				}
				else if(ch=='T'){
					str=str+"A";
				}
				else if(ch=='A'){
					str=str+"U";
				}
		}}}
			if(s.length()==str.length()){
				System.out.println(str);
			}
			else{
				System.out.println("Invalid Input");
			}
    }}
