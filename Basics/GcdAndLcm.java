import java.util.*;
public class GcdAndLcm {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int tnum1 = n1;
            int tnum2 = n2;
            while(tnum1 % tnum2 != 0){
                int rem = tnum1 % tnum2;
                tnum1 = tnum2;
                tnum2 = rem;
            }
            int gcd = tnum2;
            System.out.println("Gcd is " + gcd);
        //lcm
        if(n1>n2)
        {
            for(int i=1; i<=n1; i++)
            { int m = n1 * i;
               if(m%n1 == 0 && m%n2==0)
               {
                System.out.println("LCM is " + m);
                break;
               }
               }
            }
        else{
            for(int i=1; i<=n2; i++){
                int m =n2 * i;
                if(m%n2 == 0 && m%n1==0){
                 System.out.println("Lcm is " + m);
                 break;
                }
            }
        }
        }
    }

