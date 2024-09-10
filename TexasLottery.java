import java.util.*;
import java.util.Random;


public class TexasLottery{

    public static void main(String[] args) {

     int userarr[] = new int[6];
     int randarr[] = new int[6];
     int num = 0;
     int matches = 0;

     Random rand = new Random();

     Scanner in = new Scanner(System.in);
   
     RandNums(rand, randarr);
     PlayerNums(userarr, num, in);
     matches = MatchCounter(userarr, randarr);
     
     System.out.println("There are " + matches + " in the lottery\n");


     PrintArr(userarr);

     PrintArr(randarr);




    
     
     in.close();



   }



public void heading(){
   //heading

}
public static void RandNums(Random rand, int randarr[]){

   for(int i = 0; i < randarr.length; i++){
      randarr[i] = rand.nextInt(53 + 2);
   }
}

public static void PlayerNums(int userarr[], int num, Scanner in){
   System.out.println("Please enter 6 numbers in the range of 1-54: ");
     for (int i = 0; i < userarr.length; i++){
     num = in.nextInt();
     
     userarr[i] = num;

     }
}

public static int MatchCounter(int userarr[], int randarr[]){
   int counter = 0;

   for(int i = 0; i < userarr.length; i++){
      if(userarr[i] == randarr[i]){
         counter++;
      }
   }
      
   return counter;
   }


public static void PrintArr(int Array[]){
   //print
   for (int i = 0; i < Array.length; i++){
      System.out.println(Array[i]);


   }
}
}


