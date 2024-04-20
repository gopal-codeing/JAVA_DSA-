 class Node{
     
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Linkedlist{
 
    Node head;
    Node tail;
    
     void insert(int value){
           Node  newNode = new Node(value);
           
           if(head==null){
               head = newNode;
               tail = newNode;
           }else{
               tail.next = newNode;
               tail = newNode;
           }
    }
     
        void print(){
         Node current = head;
         
         while(current!=null){
             System.out.print(current.data+ " ");
             current =current.next;
         }
     }
      

     public static void main(String []args){
    
        // jay shree ram
        
        Linkedlist obj = new Linkedlist(); 
          obj.insert(1);
         obj.insert(1);
         obj.insert(1);
         obj.insert(1);
         obj.print();
     }
}
