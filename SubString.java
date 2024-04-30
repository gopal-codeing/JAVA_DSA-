public class SubString{
     public static void main(String []args){
          // write the sub string pattern
         String name= " aab";
          for(int i=0;i<name.length();i++){
              for(int j=0;j<=i;j++){
                  System.out.print(name.charAt(j)+" ");
              }
          }         
            
         System.out.println(name.substring(1) + " ");
     }
}
