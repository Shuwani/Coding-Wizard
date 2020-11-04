 package package1;
 import java.util.*;
 import java.util.Random;
 public class RockPaperScissorGame {
 	public static void main(String[] args){
 		Scanner sc=new Scanner(System.in);
 		RPSGame rps=new RPSGame();
 		int count1=0;
 		int count2=0;
 		int draw=0;
 		for(int i=0;i<3;i++){
 			System.out.println("Enter 'R' for rock, 'P' for paper and 'S' for scissor");
 			char player2=sc.next().charAt(0);
 			System.out.println("Computer's Choice");
 			char player1=' ';
 			for(int k=0;k<4;k++){
 			 player1=(char)(80+(int)(Math.random()*(84-80)));
 			if(player1=='Q'){
 				continue;
 			}
 			else{
 				System.out.println(player1);
 				break;
 			}
 		}
 			int res=rps.checkwinner(player1,player2);
 			if(res==-1){
 				draw++;
 				System.out.println("Tie of round");
 			}
 			else if(res==1){
 				count1++;
 				System.out.println("User won the round");
 			}
 			else{
 				count2++;
 				System.out.println("Computer won the round");
 			} 		}
 		if(count1==count2){
 			System.out.println("3 Rounds over, Draw");
 		}
 		else if(count2<count1){
 			System.out.println("3 Rounds over, User scored:"+count1+", User won the game");
 		}
 		else{
 			System.out.println("3 Rounds over, Computer scored:"+count2+", Computer won the game");
 		}
     }}
  class RPSGame{
 	public Random random=new Random();
 	
 	public int checkwinner(char firstplayerturn,char secondplayerturn){
 		if(firstplayerturn==secondplayerturn){
 			return -1;
 		}
 		else if((firstplayerturn=='R' && secondplayerturn=='P')||
 			     (firstplayerturn=='P' && secondplayerturn=='S')||
 			     (firstplayerturn=='S' && secondplayerturn=='R')){
 			    return 1;
 			}
 			else{
 				return 0;
 			}
 		}
  }