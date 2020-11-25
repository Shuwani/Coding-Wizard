import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			a[i][i]=1;
		}
		for(int i=0;i<n;i++) {
			a[i][n-i-1]=1;
		}
		if(n%2!=0) {
			a[n/2][0]=1;
			a[0][n/2]=1;
		}
		for(int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
			System.out.print(a[i][j]+" ");
		}
			System.out.println();
	}
		
}

}
