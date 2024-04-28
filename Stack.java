/* Online Java Compiler and Editor */


  class Node{
      int data;
      Node next;
      
      Node(int data){
          this.data = data;
          this.next = null;
      }
  }

public class Stack{
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
       for(Node current = head; current!=null; current = current.next)
            System.out.print(current.data + " ");
}

void peek(){
       Node current=head;
       int peeknumber = -1;
       while (current!=null){
           peeknumber  = current.data;
           current = current.next;
       }
      if(peeknumber != -1){
         System.out.println(peeknumber);
      }
}

     public static void main(String []args){
        
        Stack obj = new Stack();
        
        obj.insert(10);
        obj.insert(100);
            //   obj.insert(10);
                //  obj.insert(20);
        //          obj.print();
            obj.peek();
     }
}
