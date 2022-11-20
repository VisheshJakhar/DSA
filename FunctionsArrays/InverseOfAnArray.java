package FunctionsArrays;
import java.util.*;
public class InverseOfAnArray {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val + "\n");
        }
        System.out.println(sb);
      }
    
      public static int[] inverse(int[] a){
        int[] inv = new int[a.length];
    
        for(int i = 0; i < a.length; i++){
          int val = a[i];
          inv[val] = i;
        }
    
        return inv;
      }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = scn.nextInt();
        }
    
        int[] inv = inverse(a);
        display(inv);
     }
    }
