/* Online Java Compiler and Editor */

  abstract class parent{   // abstract class always inherete 
     abstract void fun();  // abstarct function always and declerration  
        void fun1(){
            // i am a reguler function
           //  reguler method always definition
           System.out.print("// i am a reguler function");
        } 
  } 
   
  class chaild extends parent{

       void fun(){
           System.out.print("Hello i am override ");
       }
  }  

   
public class Abstraction{
    
     public static void main(String []args){
        parent obj = new  chaild(); // abstract class can't create a object  
           obj.fun();
           obj.fun1();
     }
}
