package Patterns;
import java.util.*;
public class Pattern18 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        //int n = scn.nextInt();
        //int sp1 = 0 ;
        //int sp2=n-4;
        //int st=3;
        //for(int i=1; i<=n; i++){
        //    if(i==1){
         //   for(int j=1;j<=n;j++)
        //    {
        //        System.out.print("*\t");
        //    }
        //   sp1++;
        //}
         //   //System.out.println();
        //    if(i>1 && i<=n/2){
         //       for(int j=1;j<=sp1;j++){
          //      System.out.print("\t");
         //   }
          //  System.out.print("*\t");
           // for(int j=0;j<sp2;j++){
           //   System.out.print("\t");
          //  }
           // System.out.print("*\t");
           // sp1++;
           // sp2-=2;
            //System.out.println();

        //}

        //if(i == (n/2)+1){
         //   for(int j=0;j<sp1;j++)
           // {
            //   System.out.print("\t");
            //}
            //System.out.print("*\t");
            //sp1--;
            //System.out.println();
        //}

        //if(i>(n/2)+1){
         //      for(int j=1;j<=sp1;j++){
           //     System.out.print("\t");
            //   }
              // for(int j=1;j<=st;j++){
               // System.out.print("*\t");
               //}
               //System.out.println();
               //sp1--;
               //st+=2;
       // }
        //System.out.println();
    //}
    int n = scn.nextInt();
    
    int nst = n;
    int nsp = 0;
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= nsp; j++){
            System.out.print("\t");
        }

        for(int j = 1; j <= nst; j++){
            if(i > 1 && i <= n / 2 && j > 1 && j < nst){
                System.out.print("\t");
            } else {
                System.out.print("*\t");
            } 
        }

        if(i <= n / 2){
            nst -= 2;
            nsp++;
        } else {
            nst += 2;
            nsp--;
        }

        System.out.println();
    }
    
    }
}
