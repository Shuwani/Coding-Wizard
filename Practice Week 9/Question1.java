import java.util.*;
public class Question1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int total=sc.nextInt();
		System.out.println("Enter sum");
		int sum=sc.nextInt();
		int arr[]=new int[total];
		int a,b,i,j,k;
		System.out.println("Array elements are");
		for(a=0;a<total;a++) {
			arr[a]=sc.nextInt();
		}
		for(i=0;i<total-2;i++) {
			for(j=i+1;j<total-1;j++) {
				for(k=j+1;k<total;k++) {
					if(arr[i]+arr[j]+arr[k]==sum) {
						System.out.println(arr[k]+","+arr[j]+","+arr[i]);
						System.out.println("There is a triplet ("+arr[k]+" "+arr[j]+" "+arr[i]+") present in array whose sum is "+sum);
				}}}}
		}}