package Revision;
import java.util.*;
import java.io.*;
public class revision13 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n =  scn.nextInt();
        int fn = printdecreasing(n);
        System.out.println(fn);
    }

    public static int  printdecreasing(int n){
        if (n == 0){
            return 1;
        }
        int fnm1 = printdecreasing(n-1);
        int fn = n*fnm1;
        return fn;
    }
}
