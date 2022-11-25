import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        int n= scn.nextInt();
        int j =0;
        int k=1;
        for(int i=0;i<n;i++)
        {
            System.out.println(j);
            int l;
            l = k +j;
            j=k;
            k=l;
        }
    }
}
