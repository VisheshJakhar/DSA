package Revision;
import java.util.*;
import java.io.*;
public class rev22 {
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        int n =  scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        Stack<Integer> st=new Stack<>();
        int rb[] = new int[arr.length];
        rb[arr.length-1] = arr.length;
        st.push(arr.length-1);
        for(int i = arr.length-2;i>=0;i--)
        {
            while(st.size()>0 && arr[i]<=arr[st.peek()]){
                 st.pop();
            }
            if(st.size() == 0){
                rb[i] = arr.length;
            }
            else{
                rb[i] = st.peek();
            }
            st.push(i);
        }

        int lb[] = new int[arr.length];
        st = new Stack<>();
        lb[0] = -1;
        st.push(0);
        for(int i=1;i<arr.length;i++){
                while(st.size()>0 && arr[i]<=arr[st.peek()]){
                    st.pop();
                }
                if(st.size() == 0){
                    lb[i] = -1;
                }
                else{
                    lb[i] = st.peek();
                }
                st.push(i);
        }

        int max=0;
        for(int i=0;i<arr.length;i++){
            int width = rb[i]-lb[i]-1;
            int area = width*arr[i];
            if(area > max)
            {
                max= area;
            }
        }
        System.out.println(max);
    }
}
