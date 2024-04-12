// this impelemetion insertion sort
let key,Index;
for(let i=1;i<arr.length;i++){
    key = arr[i];
    index  = i-1;
   while (index >=0 && arr[index] > key ){
     arr[index+1] = arr[index];
     // console.log(arr)
     index--;
   }
  arr[index+1]= key;
}
console.log(arr)
