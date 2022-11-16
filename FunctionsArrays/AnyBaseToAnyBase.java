package FunctionsArrays;
import java.util.*;
public class AnyBaseToAnyBase {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int sourceBase = scn.nextInt();
       int  destBase= scn.nextInt();
       int d = getValueIndecimal(n, sourceBase);
       int dn = getValueInBase(d, destBase);
       System.out.println(dn);
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

     public static int getValueInBase(int n, int b){
        int ot = 0;
        int pow = 1;
        while(n!=0){
            int m = n%b;
            ot += pow*m;
            n = n/b;
            pow = pow*10;
         }
         return ot;
     }
}
