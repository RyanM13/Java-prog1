//Ryan Mathews
//CMPS 4143 cont-prog
//Tina Johnson
//9/20/2024
//This program takes user input and creates an array, it also creates an
//array of random numbers to be the lottery. The user numbers get compared to the 
//random array and shows how many matches it got with the "lottery".

import java.util.*;

public class TexasLottery{

    public static void main(String[] args) {

   //Creating variables and arrays.
     int userarr[] = new int[6];
     int randarr[] = new int[6];
     int num = 0;
     int matches = 0;

     Random rand = new Random();

     Scanner in = new Scanner(System.in);
   
    //calling my functions
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



//prints a heading with name and explanation of what the code is doing
public static void heading(){
   //heading

   System.out.print("\nName: Ryan Mathews\n\n");
   System.out.println("This program asks the user for 6 numbers and then uses those numbers");
   System.out.print("to enter the lottery, which is randomly generated. It checks to see");
   System.out.print("If there are any matches from users array to the random array.\n");
   System.out.println("---------------------------------------------\n");

}

//creating my random array 
public static void RandNums(Random rand, int randarr[]){

   int max = 54;
   int min = 1;
   for(int i = 0; i < randarr.length; i++){
      randarr[i] = rand.nextInt((max - min + 1)) + min;
   }
}


//taking user numbers and storing in array
public static void PlayerNums(int userarr[], int num, Scanner in){
   System.out.println("Please enter 6 numbers in the range of 1-54: ");
     for (int i = 0; i < userarr.length; i++){
     num = in.nextInt();
     
     userarr[i] = num;

     }
}

//Counts the matches from the user array and random array
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


//Just prints the array that is in the parameter list
public static void PrintArr(int Array[]){
   //print
   for (int i = 0; i < Array.length; i++){
      System.out.println(Array[i]);


   }
}
}


