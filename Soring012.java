  public static void sort012(int a[], int n)
    {
        // code here 
        // jay shree ram
        int low = 0,mid=0, hight = n-1;
        while (mid <= hight){
            if(a[mid]==0){
            int tem = a[low];
              a[low]= a[mid];
              a[mid]= tem;
              low++;
              mid++;
            }else if(a[mid]==1){
                mid++;
            }else{
                int tem = a[mid];
                a[mid] = a[hight];
                a[hight] = tem;
                hight--;
            }
        }
    }
