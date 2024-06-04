/* Online Java Compiler and Editor */

 interface Cal{
     String  Service(int x,int y);
 }

  class Add implements Cal{
    public String  Service(int x, int y){
         return "Add of to number :"+(x+y);
     }
 }
 
  class Subtract implements Cal{
     
    public  String  Service(int x, int y){
         return "Subtrction of to number :"+(x-y);
     }
 }
 
 class Division implements Cal{
     public String Service(int x, int y){
         return "Division "+(x/y);
     }
 }
 
 class Multiplication implements Cal{
     public String Service(int x,int y){
         return "Multipletion "+(x*y);
     }
 }
 
 
class Error1 implements Cal{
      public   String  Service(int x, int y){
         return "Error:";
        }   
     }
 


  class Factery {
      Cal opfuntion(char operation){
          if(operation=='+')
              return new Add();
          if(operation=='-')
               return new Subtract();
          if(operation=='/')
               return new Division();
          if(operation=='*')
               return new Multiplication();
          else
              return new Error1();
      }
  }


public class Calculator{

     public static void main(String []args){
        Factery obj= new Factery();
        Cal calclass = obj.opfuntion('/'); // Cal class hold classrefrence other class reffrence
       System.out.println(calclass.getClass()); // this function check who is call class getClass in inbulide funtion Class
         String result = calclass.Service(2,3);
         System.out.println(result);
     
        
        
     }
}
