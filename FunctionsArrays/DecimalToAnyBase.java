package FunctionsArrays;
import java.util.*;
public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
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
