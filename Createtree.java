/* Online Java Compiler and Editor */
  import java.util.*;
  class Node{
      int data;
      Node left;
      Node right;
      
      Node(int data){
          this.data = data;
          this.left = null;
          this.right = null;
      }
  }
  
public class Createtree{
    //    Level order traversal 
    Scanner sc = new Scanner(System.in);
    
    Node  bildTree(Node root){
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
    // Leveloder traversal 
    //  Leveloder traversal  ko hmm  brith fast search bhi bolte  hai 

   //   print Data  in  tree form
    // Level odertravesal
     void tree(Node root){
            
            if(root == null){
                return;
            }
            
              Queue<Node> q= new LinkedList<>();
              q.add(root);
               
             
              while(!q.isEmpty()){
                  Node tem = q.poll();
                  

                  if(tem.data != -1)
                  System.out.print(tem.data+" ");
                  
                  if(tem.left!=null){
                      q.add(tem.left);
                  }
                  
                  if(tem.right!=null){
                      q.add(tem.right);
                  }
              }
        }
    
     public static void main(String []args){
        // System.out.println("Level order trareval..!");
        Createtree obj = new Createtree();
        Node root = null ;
        root= obj.bildTree(root);
       // 1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1  this a input data;
        obj.tree(root);
        
        
        
     }
}
