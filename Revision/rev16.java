package Revision;

import java.util.*;
import java.io.*;
public class rev16 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
             char n = str.charAt(i);
             if(n == ')'){
                if(st.peek() == '('){
                    System.out.println("true");
                    return;
                }
                else{
                    while(st.peek() != '('){
                           st.pop();
                    }
                    st.pop();
                }
             }
             else{
                st.push(n);
             }

        }
        System.out.println(false);
    }
}