package FunctionsArrays;
import java.util.*;
public class AnyBaseToDecimal {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      int pow = 1;
      int f = 0;
      while(n!=0){
        int m = n%10;
        f+= pow*m;
        n=n/10;
        pow=b*pow;
      }
     return f;
   }
    }

