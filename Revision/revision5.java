package Revision;
import java.util.*;
import java.io.*;
public class revision5 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        int limit=1;
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
            limit=limit*2;
        }

        for(int i=0;i<limit;i++){
            String str = "";
            int temp = i;
            for(int j=arr.length-1;j>=0;j--){
                int r = temp%2;
                temp = temp/2;
                if(r == 0){
                    str = "-\t"+str;
                }
                else{
                    str = arr[j] + "\t" + str;
                }
            }
            System.out.println(str);
        }

    }
}
