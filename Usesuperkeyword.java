/* Online Java Compiler and Editor */

class  Super{
    int num=100;
         }

public class Usesuperkeyword extends Super{
     int num =10;
     void fun(){
    //   super.num;  invelid use variable
    //   super.fun(); // funtion this is a valide 
        System.out.println(super.num); // valide use varibale
         System.out.print(num); 
     }  
     public static void main(String []args){
         Usesuperkeyword obj= new Usesuperkeyword(); 
          obj.fun();
     }
}
