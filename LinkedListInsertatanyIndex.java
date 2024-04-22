

 class Node{
     int data;
     Node next;
     Node(int data){
         this.data =data;
         this.next = null;
     }
 }
 

public class HelloWorld{
    
    Node head;
    Node tail;
     
     void insert (int value){
         Node obj = new Node(value);
         if(head == null){
           head = obj;
           tail = obj;
         }else{
             tail.next = obj;
             tail = obj;
         }
     }   
     
     
     void inertanyIndex(int pos ,int data){
       Node new_node = new Node(data);
    if (pos == 1) {
      new_node.next = head;
      head = new_node;
    } else {
      Node previous = head;
      for (int i = 1; i < pos - 1; i++) {
        previous = previous.next;
      }
      new_node.next = previous.next;
      previous.next = new_node;
    }
     }
     
     
     void print(){
         Node current  = head;
         while(current!=null){
             System.out.print(current.data + " ");
             current= current.next;
         }
     }
     
    

     public static void main(String []args){
        // System.out.println("Hello, World!");
        HelloWorld obj  = new HelloWorld();
        obj.insert(1);
         obj.insert(1);
          obj.insert(1);
        //   obj.print();
           
           obj.inertanyIndex(2,10);
             obj.print();
           
     }
}
