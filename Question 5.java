
package package1;

public class LargestPalindromeProduct {
	public static void main(String[]args){
		int max=0;
		int num=0;
		int i,j=0;
		for( i=99;i>=0;i--){
			for( j=i;j>=0;j--){
				int p=i*j;
				if(p>max)
					num=p;
		int rev=0;
		while(num!=0){
			rev=rev*10+num%10;
			num/=10;
		}
		if(p==rev && p>max)
			 max=p;
	}
}
		System.out.println("Largest palindrome product:"+max);
	}
}