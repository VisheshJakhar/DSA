package Strings;
import java.util.*;
import java.io.*;
public class stringbuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        char ch = sb.charAt(0);//get
        System.out.println(ch);

        sb.setCharAt(0, 'd');//update
        System.out.println(sb);

        sb.insert(2, 'y');//insert
        System.out.println(sb);

        sb.deleteCharAt(2);//remove
        System.out.println(sb);

        sb.append('g');//append
        System.out.println(sb.length());
    }
}
