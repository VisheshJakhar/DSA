package Recursionarrays;
import java.io.*;
import java.util.*;
public class firstindex {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int x = scn.nextInt();
        for(int i = 0;i < arr.length; i++){
                    arr[i]=scn.nextInt();
        }
        int m = firstIndex(arr, 0, x);
        System.out.println(m);
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
         }
         int fiisa = firstIndex(arr, idx + 1, x);
         if(arr[idx] == x){
            return idx;
         } else {
            return fiisa;
         }
      }

}