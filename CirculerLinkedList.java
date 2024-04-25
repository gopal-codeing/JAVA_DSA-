  class Node {
      int data;
      Node next;
      Node(int data){
          this.data = data;
          this.next = null;
      }
  }

public class CirculerLinkedList{
     Node head =null;
     Node tail =null;
     
     void insert(int value){
      Node obj = new Node(value);
         if(head== null){
             head = obj;
             tail =obj;
             tail.next = head;
         }else{
             tail.next = obj;
             tail = obj;
               tail.next = head;
         }
         
     }
     
     void print(){
         Node current = head;
         while(current!=null){
             System.out.print(current.data + " ");
             current = current.next;
         }
      if(tail!=null){
        System.out.print("Yes i am circuler LinkedList");
     }
     }
     
     public static void main(String []args){
        // System.out.println("Hello, World!");
        CirculerLinkedList obj = new CirculerLinkedList();
        obj.insert(1);
         obj.insert(1);
          obj.insert(1);
          obj.print();
     }
}
