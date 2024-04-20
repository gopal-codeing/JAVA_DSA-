
public class Linkedlist{
 
     Node head=null;  // Empty head of Node 
     
     //  This is a Node of the linkedlist 
       static class Node{
             int num;  
             Node address;
             
             Node(int data){
                  num = data;
                  address = null;
             }
       }
       
          // this is a  insert function 
      static Linkedlist insert(Linkedlist list, int num){  
            
            Node obj  = new Node(num);
            
            if(list.head == null){
               list.head = obj;
            }
              else {
                  Node last = list.head;
                
                  while(last.address != null){
                        last = last.address;
                  }
                  last.address = obj;
              }
              
            return list;
       }
       
       
      static void print(Linkedlist list){
              Node current = list.head;
              
              while(current!=null){
                  System.out.print(current.num + " ");
                  current = current.address;
              }
              
       }

     public static void main(String []args){
    
        // jay shree ram
        
        Linkedlist obj = new Linkedlist(); // this is a Empty Object
         obj = insert(obj, 1); // create a fast Node 
         obj =insert(obj, 1);  // create a Second Node and object have a priveouse rifferince 
         obj = insert(obj, 1); // create a third Node and object have a priveouse  rifferince
        
        print(obj); // call  print function 
        
     }
}
