package Revision;
import java.util.*;
import java.io.*;
public class revision10 {
    public static void main(String[] args)
    {Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    int arr[][] =new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            arr[i][j] = scn.nextInt();
        }
    }

    for(int i=0;i<n;i++){
        for(int j=n-1;j>=0;j--){
            System.out.print(arr[j][i] + "\t");
        }
        System.out.println();
    }
}
}
