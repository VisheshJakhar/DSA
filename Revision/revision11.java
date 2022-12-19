package Revision;
import java.util.*;
import java.io.*;
public class revision11 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] =  scn.nextInt();
            }
        }
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=k;j<n;j++){
                System.out.println(arr[i][j]);
            }
            k++;
        }
    }
}
