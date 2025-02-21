
import java.util.Random;
import java .util.Scanner;
public class RockPaperScissors{
    public static void main(String args[]){
 Scanner sc= new Scanner(System.in);
 System.out.println("Its your turn,\nPlease choose your choice");
 Random rand=new Random();
 int i=1;
 while(i<=4){
    int YourTurn,ComputerTurn;
    YourTurn=sc.nextInt();
    ComputerTurn=rand.nextInt(3);
    System.out.println("You Choosed:");
    switch(YourTurn){
        case 0: System.out.println("Rock");
        break;
        case 1:System.out.println("Paper");
        break;
        case 2:System.out.println("Scissors");
        break;
    }
 System.out.println("Computer choosed:");
 if(ComputerTurn==0){
    System.out.println("Rock");
 } else if(ComputerTurn==1){
    System.out.println("Paper");
 } else if(ComputerTurn==2){
    System.out.println("Scissors");
 }
 System.out.println("Here is the winner");
 if(YourTurn==0 && ComputerTurn==1){
    System.out.println("Computer Win");
 } else if(YourTurn==1 && ComputerTurn==2){
    System.out.println("Computer Win");
 } else if(YourTurn==2 &&ComputerTurn==0){
    System.out.println("Computer Win");
 } else if(YourTurn==1 && ComputerTurn==0){
    System.out.println("You Win");
 }else if(YourTurn==2 &&ComputerTurn==1){
    System.out.println("You Win");
 } else if(YourTurn==0 &&ComputerTurn==2){
    System.out.println("You Win");
 } else if(YourTurn==0 &&ComputerTurn==0 || YourTurn==1 &&ComputerTurn==1||YourTurn==2  &&ComputerTurn==2){
System.out.println("Match Draw ");
 }
 i++;
    }
    }
}
