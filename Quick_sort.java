public class Quick{
      // this function swap every index 
      static void swap (int arr[], int i, int j){
          
          int tem = arr[i];
          arr[i]  = arr[j];
          arr[j]  = tem; 
         
      }
      
      // this function partion of the array
      static int  partion(int arr[], int low , int high){
            
            int value  = arr[high];
            int i = low-1;
            
            for(int j=low; j <= high-1; j++ ){
                  if(arr[j] < value){
                      i++;
                      swap(arr, i, j);
                  }
            }

             swap(arr , i+1, high);
             return i+1;
      }
       
       static void quick(int arr[], int low,int high){
        
           if(low < high){
        int pi =   partion(arr,  low ,high);
           
           // this is recrsive call 
           quick(arr, low, pi-1);
            quick(arr, pi + 1, high);
            }
       }
     
     
       

     public static void main(String []args){
         int arr[] = {9,9,8,5,9,6};
            quick(arr,0,arr.length-1);
            
          for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    
     }
}
