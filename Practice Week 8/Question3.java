
import java.util.*;

public class Question3{
	public static int Absolute(int X, int Y, int A, int B, int N) { 
	     int maxdiff=0;
	     int num1=X-A; 
	     X= X-Math.min(num1,N); 
	     N= N-Math.min(num1,N);  
	     int num2 = Y-B; 
	     Y = Y-Math.min(num2,N); 
	     maxdiff = Math.abs(X - Y); 
	     return maxdiff; 
}
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter X,Y,A,B,N respectively");
	int X=sc.nextInt();
	int Y=sc.nextInt();
	int A=sc.nextInt();
	int B=sc.nextInt();
	int N=sc.nextInt();
	int diff1 = Absolute(X, Y, A, B, N); 
	int count1=X, count2=A;
    X=Y;
    Y=count1;
    A=B;
    B= count2;
    int diff2 = Absolute(X, Y, A, B, N); 
    int res= Math.max(diff1,diff2); 
    System.out.println(res);
}
}
