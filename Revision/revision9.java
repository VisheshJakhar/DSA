package Revision;
import java.util.*;
import java.io.*;
public class revision9 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new  int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
            arr[i][j] = scn.nextInt();
        }}
        int i =0;
        int j=0;
        int dir = 0;
        while(true){
            dir = dir + arr[i][j];
            dir = dir%4;
            if(dir == 0){
                j++;
            }
            if(dir == 1){
                i++;
            }
            if(dir == 2)
            {
                j--;
            }
            if(dir == 3)
            {
                i--;
            }
        if(i<0){
            i++;
            break;
        }
        if(j<0){
            j++;
            break;
        }
        if(i == n){
            i--;
            break;
        }
        if(j == m){
            j--;
            break;
        }
        }

        System.out.print(i);
        System.out.print(j);
    }
}
