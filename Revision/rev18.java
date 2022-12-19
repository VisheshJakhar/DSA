package Revision;
import java.util.*;
import java.io.*;
public class rev18 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i] < arr[j]){
                    System.out.println(arr[i] + "->" + arr[j]);
                    i++;
                    count++;
                }
                count = 0;
        }
        if(count == 0){
            System.out.println(arr[i]+"->"+"-1");
        }
    }
}}
