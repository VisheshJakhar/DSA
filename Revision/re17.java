package Revision;
import java.util.*;
import java.io.*;
public class re17 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
              char ch = str.charAt(i);
              if(ch == ')' && st.size() != 0){
                while(st.peek() != '('){
                    st.pop();
                }
                st.pop();
              }

              else if(ch == '}' && st.size() != 0){
                while(st.peek() != '{'){
                    st.pop();
                }
                st.pop();
              }

              else if(ch == ']' && st.size() != 0){
                while(st.peek() != '['){
                    st.pop();
                }
                st.pop();
              }

              else{
                if(ch != ')' || ch != ']' || ch != '}')
                {st.push(ch);}
                else{
                }
              }
        }
        if(st.size() == 0){
           System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
