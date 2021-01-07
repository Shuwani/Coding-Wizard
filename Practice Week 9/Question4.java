import java.util.Scanner; 
public class Question4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Column c = new Column(); 
		System.out.println("Enter no of columns");
	        int n=sc.nextInt(); 
	        c.print(n); 
	}}   
class Column{ 
   public void print(int n) { 
        int x1=n/2, x2=1;  
        for (int i=1;i<=n;i++) { 
            for (int j=1;j<=x1;j++) 
                System.out.print(" ");  
            int count=(x2/2)+1; 
            for (int k=1;k<=x2;k++) { 
                System.out.print(count); 
                if (k<=x2/2) 
                    count--; 
                 else
                   count++; 
            } 
            System.out.println(); 
            if (i<=n/2) { 
                x1-=1; 
                x2+=2; 
            } 
            else { 
                x1+=1; 
                x2-=2; 
            }} 
}}