package Patterns;
import java.util.*;
public class Pattern10 {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = (n/2)+1;
        int sp2 = -1;
        for(int i=0;i<n;i++)
        {
             for(int j=0 ; j<sp;j++)
             {
                System.out.print("\t");
             }
             System.out.print("*\t");
             for(int j=0;j<sp2;j++){
                System.out.print("\t");
             }
             if(i>0 && i<n-1){
             System.out.print("*\t");}
             System.out.println();
             if(i<n/2){
                sp--;
                sp2+=2;
             }
             else{
                sp++;
                sp2-=2;
             }
        }
    }
}
