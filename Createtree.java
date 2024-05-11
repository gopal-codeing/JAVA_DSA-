/* Online Java Compiler and Editor */
import java.util.*;
class Node {
    int data;
    Node right;
    Node left;

    Node(int data) {
        this.data=  data;
        right = null;
        left  = null;
    }
}

public class Createtree {
    Scanner sc = new Scanner(System.in);
    Node createTree(Node root) {
         System.out.print("Enter the data : ");
      int data = sc.nextInt();
          root = new Node(data);
          if(data ==-1)
           return root;
          System.out.println("Enter the insert of the left of "+data);
          root.left = bildTree(root.left);
           System.out.println("Enter the insert of the right of "+data);
          root.right = bildTree(root.right);
          
         return root;
    }

    public static void main(String []args) {
        Createtree call = new Createtree();
        Node root = null;

        call.createTree(root);
    }
}
