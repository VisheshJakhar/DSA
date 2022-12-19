package Revision;
import java.util.*;
import java.io.*;
public class revision1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int arr1[] = new int[m];
        int arr2[] = new int[n];
        for(int i=0; i<m;i++){
            arr1[i] = scn.nextInt();
        }
        for(int j=0; j<n; j++){
            arr2[j] = scn.nextInt();
        }
        int i = arr1.length-1;
        int j = arr2.length-1;
        int a1=0,a2=0;
        int dig =0, pow=1, d=0,c=0 ;
        while(i>=0 || j>=0){
            if(i>=0){
            a1 = arr1[i];}
            else{
                a1 = 0;
            }
            if(j>=0){
            a2 = arr2[j];
            }
            else{
                a2 = 0;
            }
            if(m>n){
                if(a1 > a2){
                    d = a1-a2-c;
                    dig = dig + d*pow;
                    pow = pow * 10;
                    c=0;
                }
                else{
                    d = a1-a2-c+10;
                    dig = dig + d * pow;
                    pow = pow * 10;
                    c=1;
                }
            }
            else{
                if(a2 > a1){
                    d = a2-a1-c;
                    dig = dig + d*pow;
                    pow = pow * 10;
                    c=0;
                }
                else{
                    d = a2-a1-c+10;
                    dig = dig + d * pow;
                    pow = pow * 10;
                    c=1;
                }
            }
            i--;
            j--;
        }
        System.out.println(dig);
    }
}
