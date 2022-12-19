package Revision;
import java.util.*;
import java.io.*;
public class revision4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] =  new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] =scn.nextInt();
        }
        int j=0;
            for(int l=0; l<arr.length; l++){
                while(j < arr.length){
                for(int i=l;i<=j;i++){
                 System.out.print(arr[i]);
                }
                System.out.println();
                j++;
            }
            j=j%n;
            }
        }

    }
