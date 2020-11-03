package package1;
import java.util.*;
public class DayNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month");
		int month=sc.nextInt();
		System.out.println("Enter date");
		int date=sc.nextInt();
		System.out.println("Enter year");
		int year=sc.nextInt();
		int res1=dates(date,month);
		if(month>2){
		boolean res=leapyear(year);
		if(res)
			System.out.println(res1+1);
		else
			System.out.println(res1);
	}
		else{
			System.out.println(res1);
		}
  }
	
	public static int dates(int date,int month){
		int dayno=0;
		switch(month){
		case 1:
			dayno=date;
			break;
		case 2:
			dayno=31+date;
			break;
		case 3:
			dayno=31+28+date;
			break;
		case 4:
			dayno=31+28+31+date;
			break;
		case 5:
			dayno=31+28+31+30+date;
			break;
		case 6:
			dayno=31+28+31+30+31+date;
			break;
		case 7:
			dayno=31+28+31+30+31+30+date;
			break;
		case 8:
			dayno=31+28+31+30+31+30+31+date;
			break;
		case 9:
			dayno=31+28+31+30+31+30+31+31+date;
			break;
		case 10:
			dayno=31+28+31+30+31+30+31+31+30+date;
			break;
		case 11:
			dayno=31+28+31+30+31+30+31+31+30+31+date;
			break;
		case 12:
			dayno=31+28+31+30+31+30+31+31+30+31+30+date;
			break;
	    default:
	    	break;
		}
		return dayno;
	}
		public static boolean leapyear(int year){
		if((year%4==0&&(year%100!=0))||(year%400==0)){
		return true;
		}
		else{
			return false;
		}
    }
  }
