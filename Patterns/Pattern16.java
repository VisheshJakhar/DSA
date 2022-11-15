package Patterns;
import java.util.*;
public class Pattern16 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = (n*2)-3;
        for(int i=1; i<=n ; i++){
            if(i!=n)
            {for(int j=1; j<=i;j++)
            {System.out.print(j + "");}
            for(int j=1;j<=sp;j++)
            {System.out.print(" ");}
            for(int j=i;j>=1;j--){
             System.out.print(j+"");
            }
            sp-=2;
            System.out.println();}
            else{
                for(int j=1;j<=n;j++){
                       System.out.print(j);
                }
                for(int j=n-1; j>=1; j--){
                    System.out.print(j);
                }
                System.out.println();
        }
    }
}}
