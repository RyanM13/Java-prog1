import java.util.*;


public class TexasLottery{

    public static void main(String[] args) {

     int userarr[] = new int[6];
     int randarr[] = new int[6];
     int num = 0;
     int matches = 0;

     Random rand = new Random();

     Scanner in = new Scanner(System.in);
   
     heading();
     RandNums(rand, randarr);
     PlayerNums(userarr, num, in);
     matches = MatchCounter(userarr, randarr);
     
     System.out.println("There are " + matches + " in the lottery\n");


     PrintArr(userarr);

     System.out.print('\n');
     PrintArr(randarr);




    
     
     in.close();



   }



public static void heading(){
   //heading

   System.out.print("Name: Ryan Mathews\n\n");
   System.out.println("This program asks the user for 6 numbers and then uses those numbers");
   System.out.print("to enter the lottery, which is randomly generated. It checks to see");
   System.out.print("If there are any matches from users array to the random array.\n");
   System.out.println("---------------------------------------------\n");

}
public static void RandNums(Random rand, int randarr[]){

   int max = 54;
   int min = 1;
   for(int i = 0; i < randarr.length; i++){
      randarr[i] = rand.nextInt((max - min + 1)) + min;
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
      for(int j = 0; j < userarr.length; j++){
      if(userarr[i] == randarr[j]){
         counter++;
      }
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


