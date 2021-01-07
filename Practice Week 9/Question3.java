import java.util.Scanner;
public class Question3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		int n=sc.nextInt();
		String str=roman(n);
		System.out.println(str);
	}
		public static String roman(int in) {
		    if (in<0||in>1000)
		    	return "Invalid input";
		    String s="";
		    while (in>=1000) {
		        s+="M";
		        in-=1000;        }
		    while (in>=900) {
		        s+="CM";
		        in-=900;
		    }
		    while (in>=500) {
		        s+="D";
		        in-=500;
		    }
		    while (in>=400) {
		        s+="CD";
		        in-=400;
		    }
		    while (in>=100) {
		        s+="C";
		        in-=100;
		    }
		    while (in>=90) {
		        s+="XC";
		        in-=90;
		    }
		    while (in>=50) {
		        s+="L";
		        in-=50;
		    }
		    while (in>=40) {
		        s+="XL";
		        in-=40;
		    }
		    while(in>=10) {
		        s+="X";
		        in-=10;
		    }
		    while(in>=9) {
		        s+="IX";
		        in-=9;
		    }
		    while(in>=5) {
		        s+="V";
		        in-=5;
		    }
		    while(in>=4) {
		        s+="IV";
		        in-=4;
		    }
		    while(in>=1) {
		        s+="I";
		        in-=1;
		    }    
		    return s;
	}}