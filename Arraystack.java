
public class Arraystack{
     static int stack[] = new int[5];
     static int check = -1;
      
    static  void push(int data){
          if(check == stack.length-1){
              System.out.println("Stack is full can't push");
              return;
          }
          stack[++check]=data;
      }
      
      static  int  pop(){
         if(check==-1){
             System.out.print("can't pop");
         }
         return  stack[check--];
     }
      
      static void print (){
      for(int i=0;i<5;i++)
        System.out.print(stack[i]+ " ");
          return;
      }
      
      static int peek(){
          return stack[check];
      }
      
      static void isEmpty(){
          if(check==stack.length-1){
              System.out.print("Stack is Full cant push");
              return;
          }
          System.out.print("Can be fill");
      }
      
     public static void main(String []args){
       // jay shree ram
         push(10);
         push(12);
         push(113); 
         push(13);
         push(13);
         print();
        System.out.print(peek());
          isEmpty();
     }
}
