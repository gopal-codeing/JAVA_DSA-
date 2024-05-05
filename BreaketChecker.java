/* Online Java Compiler and Editor */
import java.util.*;
public class BreaketChecker{
  static boolean  fun(String name){
         Stack<Character> obj = new Stack<Character>();
         
         for(int i=0;i<name.length();i++){
             if(name.charAt(i) == '('){
                 obj.push('(');
             }else{
                 if(obj.isEmpty())
                     return false;
                 else if(name.charAt(i) == ')') {
                     obj.pop();
                 }
             }
         }
         return obj.isEmpty();
  }
     public static void main(String []args){
        // System.out.println("Ram Ram bhai Sreyane");
        System.out.print("Enter the String");
        Scanner sc=  new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        
         System.out.println(fun(name));
        
     }
}
