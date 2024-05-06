/*Next greater Element in Array */
public class HelloWorld{
   public static void  function(int arr[]){
       int demo[] = new int[arr.length];
         for(int i=0;i<arr.length-1;i++){
             int lar = arr[i];
             for(int j=i+1;j<arr.length;j++){
                 if(arr[j] > lar){
                      lar = arr[j];
                     demo[i] = lar;
                 }
             }
         }
         
         for(int i=0;i<demo.length;i++){
             if(demo[i] == 0)
                demo[i] = -1;
         }
         for(int i=0;i<demo.length;i++)
         System.out.print(demo[i]+ " ");
   }
     public static void main(String []args){
        // System.out.println("Ram Ram bhai Sareyane...!");
        
        int arr[] ={10,9,7,8,6};
      
        function(arr);
     }
}
