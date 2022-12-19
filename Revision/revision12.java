package Revision;
import java.util.*;
import java.io.*;
public class revision12 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            arr[i][j] = scn.nextInt();
         }
      }
     System.out.println("-------------------------------------------------------");
      // diagonal traversal
      for(int g = 0; g < arr.length; g++){
         for(int i = 0, j = i + g; j < arr.length; i++, j++){
            System.out.print(arr[i][j] + " ");
         }
         System.out.println();
      }
   }
    }
