package Generictree;
import java.io.*;
import java.util.*;

public class displaygeneric {
  private static class Node {
    int val;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = " ";
    str+= node.val;
    str+="->";
    for(int i=0;i<node.children.size();i++){
        str+=node.children.get(i).val;
        str+=",";
    }
    str+=".";
    System.out.println(str);
    for(int i=0;i<node.children.size();i++){
        display(node.children.get(i));
    }
  }

  public static void main(String[] args) throws Exception {
    Node root = new Node();
    root.val=1;
    Node a = new Node();
    a.val = 5;
    Node b = new Node();
    b.val =10;
    Node c = new Node();
    c.val = 15;
    Node d = new Node();
    d.val = 20;
    Node e = new Node();
    e.val = 25;
    Node f = new Node();
    f.val = 30;

    root.children.add(a);
    root.children.add(b);
    a.children.add(c);
    c.children.add(e);
    c.children.add(d);
    b.children.add(f);
    display(root);
  }
}