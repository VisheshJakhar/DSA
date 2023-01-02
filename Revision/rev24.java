package Revision;
import java.util.*;
import java.io.*;
public class rev24 {
    public static class Node{
        int val;
        Node next;
    }
    public static void main(String[] args){
        Node head = new Node();
        head.val = 100;
        Node node1 = new Node();
        node1.val = 200;
        Node node2 = new Node();
        node2.val=500;

        head.next = node1;
        node1.next = node2;

        Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
