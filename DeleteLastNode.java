/* Online Java Compiler and Editor */

class Node{
    int data;
    Node next;
    Node(int data){
        this.data= data;
        next = null;
    }
}


public class DeleteLastNode{
      Node head;
      Node tail;
      
      void insert(int data){
          Node obj = new Node(data);
          if(head==null){
             head = obj;
             tail = obj;
          }else{
              tail.next = obj;
              tail= obj;
          }
      }
      
      void print(){
          Node current = head;
          while(current != null){
              System.out.print(current.data+" ");
              current = current.next;
          }
      }
      
      void delete_end(){
          Node current = head;
           while(current.next.next != null){
              current = current.next;
          }
          current.next = null;
          tail = current;
      }
      
     public static void main(String []args){
          HelloWorld  obj = new HelloWorld();
          obj.insert(10);
          obj.insert(10);
          obj.insert(10);
          obj.delete_end();
          obj.print();
     }
}
