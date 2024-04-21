   class Node{
       int data;
       Node next;
       
       Node(int data){
           this.data = data;
           this.next = null;
       }
   }

public class LinkedlistDeleteNode{
    
    Node head=null;
    Node tail=null;
    
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
        
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current =current.next;
        }
        
    }
    
    void delete (int value){
        Node temp = head, prev = null; 
  
        // If head node itself holds the key to be deleted 
        if (temp != null && temp.data == value) { 
            head = temp.next; // Changed head 
            return; 
        } 
  
        // Search for the key to be deleted, keep track of 
        // the previous node as we need to change temp.next 
        while (temp != null && temp.data != value) { 
            prev = temp; 
            temp = temp.next; 
        } 
  
        // If key was not present in linked list 
        if (temp == null) 
            return; 
  
        // Unlink the node from linked list 
        prev.next = temp.next; 

    }
    
     public static void main(String []args){
        LinkedlistDeleteNode obj = new LinkedlistDeleteNode();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        
    obj.print();
      System.out.println();
     System.out.print("Deletes at Any number");
           System.out.println();
         obj.delete(2);
         obj.print();
         
     }
}
