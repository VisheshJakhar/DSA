package Revision;
import java.util.*;
import java.io.*;
public class revision3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
          arr[i] = scn.nextInt();
            }
          d = d % n;
          if(d<0){
            d=d+n;
          }

          if(d%5 != 0){
          int i = arr.length - d;
          for(int j=i; j<arr.length;j++){
                System.out.print(arr[j]);
          }

          for(int j=0; j<=i-1; j++){
            System.out.print(arr[j]);
          }
        }
          else{
            int i=0;
            for(int j=0; j<arr.length;j++){
                System.out.print(arr[j]);
            }
          }
        }
}
