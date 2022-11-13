import java.util.*;
public class ReverseANumber {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int m=n;int pow=1;
        while(m!=0){
          m=m/10;
          pow = pow *10;
        }
        pow= pow/10;
        int digit = 0;
        while(n!=0)
        {
            int l = n % 10;
            digit = digit + (l * pow);
            pow = pow/10;
            n=n/10;
        }
        System.out.println(digit);
    }
}
