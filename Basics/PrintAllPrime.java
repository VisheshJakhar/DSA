import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class PrintAllPrime {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t = scn.nextInt();
        for(int i=n; i<=t; i++){
            int count = 0;
            for(int j=2; j*j<=i;j++){
                if(i%j == 0)
                {
                   count++;
                }
            }
            if(count == 0){
                System.out.println(i + "  is "+ "Prime");}
            else
            {
              System.out.println(i+ " is 5" + "Not prime");
            }
        }
    }
}
