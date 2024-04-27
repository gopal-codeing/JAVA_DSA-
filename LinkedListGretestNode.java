
  class Node{
      int data;
      Node next;
      
      Node(int data){
          this.data = data;
          this.next = null;
      }
  }

public class LinkedListGretestNode{
    Node head;
    Node tail;
        void insert(int value){
           Node obj = new Node(value);
           if(head ==  null){
              head = obj;
              tail = obj;
        }else{
            tail.next = obj;
            tail =  obj;
        }
}

void print(){
        Node current = head;
        while(current!= null){
            System.out.print(current.data + " ");
            current = current.next;
        }
}

void greaterElement(){
    Node current = head;
     int large = current.data;
     for( ; current!=null; current = current.next){
         if(current.data > large)
            large = current.data;
     }
     System.out.print(large);
}

     public static void main(String []args){
        System.out.println("Hello, World!");
        LinkedListGretestNode obj = new LinkedListGretestNode();
        
        obj.insert(10);
           obj.insert(100);
              obj.insert(10);
                 obj.insert(10);
                 obj.print();
            obj.greaterElement();
     }
}
