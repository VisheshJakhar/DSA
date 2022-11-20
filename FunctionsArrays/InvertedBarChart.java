package FunctionsArrays;
import java.util.*;
public class InvertedBarChart {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int max = Integer.MIN_VALUE;
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
        }
        for(int height = 1; height <= max; height++){
            for(int i=0; i < n; i++){
                if(arr[i] >= height){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
