package Recursionarrays;
import java.util.*;
import java.io.*;
public class lastindex {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i]= scn.nextInt();
        }
        int m = lastIndex(arr, 0, x);
        System.out.println(m);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
         }
   
         int liisa = lastIndex(arr, idx + 1, x);
         if(liisa != -1){
            return liisa;
         } else if(arr[idx] == x){
            return idx;
         } else {
            return -1;
         }
      }
}
