package Revision;
import java.util.*;
import java.io.*;
public class revision6 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();//arr1
        int m = scn.nextInt();//arr1
        int o=scn.nextInt();//arr2
        int p = scn.nextInt();//arr2
        int arr1[][] = new int[n][m];
        int arr2[][] = new int[o][p];
        int arr3[][] = new int[n][p];
        for(int i=0; i<n; i++){
           for(int j=0; j<m; j++){
              arr1[i][j] = scn.nextInt();
           }
        }

        for(int i=0;i<o;i++){
            for(int j=0;j<p;j++){
                arr2[i][j] = scn.nextInt();
            }
        }

        if(m == o){
          for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                for(int k=0;k<m;k++){
                    //System.out.println(arr1[i][k] + "\t" + arr2[k][j]);
                    arr3[i][j] = arr3[i][j] + arr1[i][k] * arr2[k][j];
                }
            }
          }
        }
        else{
            System.out.println("Invalid Input");
        }

         for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
               System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
         }
    }
}
