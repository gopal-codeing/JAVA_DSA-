// Arrays sum of element
function  call (arr){
  let i=0,j=arr.length-1,sum=0;
     while (i<j){
       sum += (arr[i]+arr[j]);
       i++;
       j--;
     }
  if(arr.length%2==1){
    sum+=arr[Math.floor(arr.length/2)]
  }
  return sum;
}

let arr=[1,2,3,4,5];
console.log(call(arr));
