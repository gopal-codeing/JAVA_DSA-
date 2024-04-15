// this empelemention of mergesort
public class Mergesort{
    
      static void marge(int arr[], int low, int mid , int high ){
             int n1 = mid - low + 1;
             int n2 = high - mid;
             
             int left[] = new int[n1];
             int right[]= new int[n2];
             
             for(int i=0;i<n1;i++)
               left[i] = arr[low+i];
             
             for(int i=0;i<n2;i++)
              right[i] = arr[mid+i+1];
             
             
             int i=0,j=0;
             
        int k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
        
        }
    
    
       static void sort(int arr[] ,int low, int high){
             
             if(low < high){
                 int mid  = (low + high)/2;
                 
                 sort(arr, low , mid);
                 sort(arr, mid+1 , high);
                 
                 
                 marge(arr , low , mid, high);
             }
             
              
              
       }
    
     public static void main(String []args){
        // System.out.println("Ram Ram Sareyane");
      int arr[] ={1,5,6,5,4,3};
       
       sort(arr , 0 ,arr.length-1);
       for(int p=0;p<arr.length;p++)
         System.out.print( arr[p] + " ");
     }
}
