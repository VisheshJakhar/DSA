package Stack;
import java.util.*;
import java.io.*;
public class intro {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);
        System.out.println(st.peek() + " " + st.size());
        st.pop();
        System.out.println(st.peek() + " " + st.size());
        st.pop();
        System.out.println(st.peek() + " " + st.size());
        //st.pop();
        //System.out.println(st.peek() + " " + st.size());//can not peak when value is o or null in the stack
        st.pop();
        System.out.println(st +" " +st.size());
    }
}
