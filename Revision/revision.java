package Revision;
import java.util.*;
import java.io.*;
public class revision {
    public static void main(String[] args){
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int c=0;
        int d =0, pow =1, dig=0;
        int arr1 [] = new int[n];
        int arr2 [] = new int[m];
        for(int i=0;i<n;i++){
            arr1[i] = scn.nextInt();
        }
        for(int j=0;j<m;j++){
            arr2[j] = scn.nextInt();
        }


        int i=arr1.length-1,j=arr2.length-1;
        while(i>=0 || j>=0){
            if( i >=0){
                d = d + arr1[i];}
                if(j>=0){
                d = d + arr2[j];}
                d= (d+c);
            if(d >= 10){
                d=d%10;
                dig = dig + d * pow;
                pow = pow *10;
                c=1;
            }
            else{
                dig = dig + d * pow;
                pow = pow *10;
                c=0;
            }
            i--;
            j--;
            d=0;
        }
        if(c == 1){
        System.out.print(pow + dig);}
    else{
        System.out.print(dig);}
    }
}