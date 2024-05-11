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
        System.out.print("Enter the tree data !");
        int data = sc.nextInt();
        root  = new Node(data);

        if(data == -1) {
            return null;
        }
        System.out.print("data insert left : " + data);
        System.out.println();
        root.left  = createTree(root.left);
        System.out.print("data insert right" + data);
         System.out.println();
        root.right  = createTree(root.right);
        return root;
    }

    public static void main(String []args) {
        Createtree call = new Createtree();
        Node root = null;

        call.createTree(root);
    }
}
