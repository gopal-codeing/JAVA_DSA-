// this is Binary search algorithm
const call = (arr,start,last,target) =>{
   let mid;
     while (start <=last){
         mid =  start + (last - start) /2;
         if(arr[mid] == target){
          return mid; 
         }if(arr[mid] < target){
           start =  mid++;
         }else{
           last = mid--;
         }
     }
  return -1;
}

const arr=[1,2,3,4,5];
  console.log(call(arr,0,arr.length-1,4));
