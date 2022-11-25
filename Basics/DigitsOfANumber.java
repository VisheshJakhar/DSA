import java.util.*;
public class DigitsOfANumber {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = n;
        int pow=1;
        while(m!=0)
        {
            m=m/10;
            pow = pow * 10;
        }
        pow = pow/10;
        while(n!=0)
        {
            int l = n / pow;
            n=n%pow;
            pow= pow/10;
            System.out.println(l);
        }
    }
}
