
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
  // insert of the stack
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
// peek of this stack
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
// pop of the stack 
  void pop(){
     if(head==null)
        throw new IllegalStateException("Stack is empty can not pop ");
         Node  tem = head.next;
              head = head.next;
              tem.next = null;
              
              System.out.print(tem.data);
}
  
     public static void main(String []args){
        
        Stack obj = new Stack();
        
        obj.insert(10);
        obj.insert(100);
            //   obj.insert(10);
                //  obj.insert(20);
        //          obj.print();
            obj.peek();
         obj.pop();
     }
}
