package Revision;
import java.util.*;
import java.io.*;
public class rev14 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n =  scn.nextInt();
        int m=pow(x,n);
        System.out.println(m);
    }
   public static int pow(int x, int n){
    if(n==0){
        return 1;
    }
    int power = pow(x,n-1);
    int pw = x*power;
    return pw;
   }
}
