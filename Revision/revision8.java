package Revision;
import java.util.*;
import java.io.*;
public class revision8 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] =  scn.nextInt();
            }
        }

        int tne = n*m;
        int cne = 0;
        int minr = 0;
        int maxr = n-1;
        int minc = 0;
        int maxc = m-1;
        while(cne<tne){
            for(int i=minr;i<=maxr && cne<tne;i++){
                System.out.println(i+"\t"+minc);
                //System.out.println(arr[i][minc]);
                cne++;
            }
            minc++;
            System.out.println();
            for(int i=minc;i<=maxc && cne<tne;i++){
                System.out.println(maxr+"\t"+i);
                cne++;
            }
            maxr--;
            System.out.println();
            
            for(int i=maxr;i>=minr && cne<tne;i--){
                System.out.println(i+"\t"+maxc);
                 //System.out.println(arr[i][maxc]);
                 cne++;
            }
            System.out.println();
            maxc--;

            for(int i=maxc;i>=minc && cne<tne; i--){
                System.out.print(minr+"\t"+i);
                //System.out.println(arr[minr][i]);
                cne++;
            }
            System.out.println();
            minr++;
        }
    }
}
