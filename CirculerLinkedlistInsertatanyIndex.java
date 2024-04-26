
 class Node{
     int data;
     Node next;
     Node(int data){
         this.data =data;
         this.next = null;
     }
 }
 

public class CirculerLinkedlistInsertatanyIndex{
    
    Node head;
    Node tail;
     
     void insert (int value){
         Node obj = new Node(value);
         if(head == null){
           head = obj;
           tail = obj;
         tail.next = head;
         }else{
             tail.next = obj;
             tail = obj;
          tail.next = head;
         }
     }   
     
     
     void inertanyIndex(int pos ,int data){
        Node obj = new Node(data);
           
           if(pos == 1){
               obj.next=head;
               head = obj;
           }else{
               Node pre = head;
               for(int i=1;i < pos-1; i++){
                   pre  = pre.next;
               }
             obj.next =   pre.next ;
             pre.next = obj;
           }
          
     }
     
     
     void print(){
         Node current  = head;
         while(current!=null){
             System.out.print(current.data + " ");
             current= current.next;
         }
        if(tail!=null){
            System.out.println("yes this is curculer linkedlist");
        }
     }
     
    

     public static void main(String []args){
        // System.out.println("Hello, World!");
        CirculerLinkedlistInsertatanyIndex obj  = new CirculerLinkedlistInsertatanyIndex();
        obj.insert(1);
         obj.insert(1);
          obj.insert(1);
        //   obj.print();
           
          obj.inertanyIndex(2,10);
             obj.print();
           
     }
}
