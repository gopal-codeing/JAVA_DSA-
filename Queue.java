class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data =data;
        this.next = null;
    }
}
public class Queue{
    
    Node head;
    Node tail;
    
    void insert(int value){
        Node obj = new Node(value);
        if(head == null){
            head = obj;
            tail = obj;
        }else{
            tail.next = obj;
            tail = obj;
        }
    }
    
    void print(){
        for(Node current = head; current!=null; current = current.next){
            System.out.print(current.data +" ");
        }
    }
    void pop(){
         if(head == null ){
             System.out.print("the queue is empty ");
             
         }else{
             System.out.print("the pop is " +  head.data);
         }
         System.out.println();
    }
    
     public static void main(String []args){
          Queue obj = new Queue();
          obj.insert(10);
          obj.insert(10);
          obj.insert(10);
          obj.print();
          obj.pop();
           obj.print();
          
     }
}
