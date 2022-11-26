package Recursion;
import java.util.*;
import java.io.*;
public class Factorial {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int f = factorial(n);
        System.out.println(f);
      }

      public static int factorial(int n) {
        if(n == 0){
          return 1;
        }

        int m = factorial(n - 1);
        int fn = m*n;
        return fn;


      }
}
