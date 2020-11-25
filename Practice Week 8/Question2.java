import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the temperature of room in deg C");
		        int temp=sc.nextInt();
		        System.out.println("Enter the times door opened");
		        int door=sc.nextInt();
		        System.out.println("Operating time of purifier in min");
		        int time=sc.nextInt();
		        int purity;
		        if(temp>=25){
		           int inctemp=temp-25;
		           int efftemp=inctemp*2;
		           int effdoor=door*10;
		           purity =((40+efftemp)*time)-effdoor;
		         }
		        else{
		            int inctemp=25-temp;
		            int efftemp=inctemp*2;
			        int effdoor=door*10;
			        purity =((40-efftemp)*time)-effdoor;
		        }
		        System.out.println("Purifier purifies "+purity+" sq/min with the given conditions.");
		    }
		}
