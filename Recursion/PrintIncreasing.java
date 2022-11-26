package Recursion;
import java.io.*;
import java.util.*;
public class PrintIncreasing {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printDecreasing(n);
      }

      public static void printDecreasing(int n) {
        if(n == 0){
          return;
        }

        printDecreasing(n - 1);
        System.out.println(n);

      }
}
