import java.util.*;
import java.util.Random;


public class TexasLottery{

    public static void main(String[] args) {

     int max = 54;
     int min = 1;
     int userarr[] = new int[6+1];
     int num = 0;
      
     Random rand = new Random();
     Scanner in = new Scanner(System.in);
     System.out.println("Please enter 6 numbers in the range of 1-54: ");
     for (int i = 0; i < userarr.length-1; i++){
     num = in.nextInt();
     userarr[i] = num;

     }
     for (int i = 0; i < userarr.length-1; i++){
      System.out.println(userarr[i]);
     }
     int randarr[] = new int[6];
       
     for(int i = 0; i < 500; i++){
        randarr[i] = rand.nextInt(53 + 2);
     }

     
     in.close();



}
}