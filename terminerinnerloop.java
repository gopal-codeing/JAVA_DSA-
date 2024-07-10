class terminerinnerloop{
    public static void main(String org[]){

         out: // lebaling - this name is use to the out of the all loop  
         for(int i=0;i<5;i++){
            // inner: // this name is use to the out of the inner loop  
            for(int j=0;j<4;j++){
                for(int k=0; k<5;k++){
                if(k==2)
                break out; // use with break and lebaling name
                System.out.print(k+" ");
                }
            }
         }


    }
}
