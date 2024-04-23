/* Online Java Compiler and Editor */

class Node {
     
     int data;
     Node next;
     Node(int data){
         this.data = data;
         this.next = next;
     }
}


public class UpdateLinkedList{
    
    Node head;
    Node tail;
    
    void insert(int value){
         
         Node obj = new Node(value);
         
         if(head == null){
             head =obj;
             tail =obj;
         }else{
             tail.next = obj;
             tail = obj;
         }
        
    }
    // Update at any Index 
    void update (int Index, int value){
         
         Node current = head; 
         int i=0;
         while (current!= null && i!=Index){
             i++;
             current =current.next;
         }
         current.data = value;
          
    }
      
      void print (){
           Node current = head;
           while(current!=null){
               System.out.print(current.data + " ");
               current = current.next;
           }
           System.out.println();
      }
      
     public static void main(String []args){
        UpdateLinkedList obj = new UpdateLinkedList();
        obj.insert(1);
          obj.insert(1);
          obj.insert(1);
        obj.print();
        obj.update(1,2);
         obj.update(0,1);
          obj.update(2,3);
          obj.print();
     }
}
