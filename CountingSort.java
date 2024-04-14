// this is a couting Sort algorithm  

public class CoutingSort{
    
    static void  fun(int arr[]){
        int max =0;
        for(int i=0;i<arr.length;i++){
              max  = Math.max(max , arr[i]);
        }
        int newarr[] = new int[max+1];
        for(int i=0;i<arr.length;i++){
            newarr[arr[i]]++;
        }

        for(int i=1;i<=max;i++){
            newarr[i] += newarr[i-1];
            System.out.print(newarr[i]);
        }
        
        int output [] = new int[arr.length];
        for(int i= arr.length-1; i>=0; i--){
            output[newarr[arr[i]]-1] = arr[i];
            newarr[arr[i]]--;
        }
      
        for(int i=0;i<output.length;i++)
        System.out.print(output[i]+" ");
    }

     public static void main(String []args){
        // jay shree ram 
        int arr[] = {6,4,5};
        fun(arr);
        
     }
