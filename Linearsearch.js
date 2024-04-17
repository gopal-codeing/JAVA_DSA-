// this implementation of linear Search Algorithm  

const fun = (arr,target) =>{
  for(i=0;i<arr.length;i++){
        if(arr[i] == target)
          return i;
  }      
  return -1;
}


let arr = [8,6,7,5];
fun(arr,6);
