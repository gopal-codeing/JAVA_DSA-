
 class DoublyLinkedList{
      int data;
      DoublyLinkedList next;
      DoublyLinkedList previous;
      
      DoublyLinkedList(int data){
          this.data = data;
      }
 }
   
public class HelloWorld{
      DoublyLinkedList head;
        DoublyLinkedList tail;
        
 void insert (int value){
      
       DoublyLinkedList obj = new DoublyLinkedList(value);
       if(head == null){
           head = obj;
           tail = obj; 
       }else{
           tail.next = obj;
           tail.previous = obj;
           tail = obj;
       }
   }
   
   void  print(){
       
       DoublyLinkedList current = head;
       while(current!=null){
           System.out.print(current.data+" ");
           current = current.next;
       }
   }
   
     public static void main(String []args){
        // System.out.println("Hello, World!");
        HelloWorld obj= new HelloWorld();
        obj.insert(1);
           obj.insert(1);
              obj.insert(1);
                 obj.print();
     }
}
