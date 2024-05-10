/* Insert and Deletion at any index */
import java.util.*;
public class ArrayInsertandDeletion{
   
    static int[] arrinsert(int arr[],int index,int data){
          if(index >= arr.length)
          System.out.print("User please put the right index :");
           for(int i=arr.length-1;i>index;i--){
             arr[i] = arr[i-1];
           }
           arr[index] = data;
           
          return arr;
    }
      
      static int[] deleteIndex(int arr[] , int index){
          for(int i=index;i<arr.length-1;i++){
              arr[i] = arr[i+1];
          }
         
        return arr;
      }
   
     public static void main(String []args){
        int arr [] ={1,2,3,5,0};
         Scanner obj = new Scanner(System.in); 
        System.out.print("Enter the Insert value: ");
        int data = obj.nextInt();
        System.out.print("Enter the Index value: ");
        int Index = obj.nextInt();
        arr=arrinsert(arr,Index,data);
             for(int i=0;i<arr.length;i++){
               System.out.print(arr[i]+ " ");
           }
           System.out.println();
        System.out.print("Enter the deleting Index value: ");
        int postion = obj.nextInt();
       arr= deleteIndex(arr,postion);
        for(int i=0;i<arr.length-1;i++){
               System.out.print(arr[i]+ " ");
           }
     }
}
