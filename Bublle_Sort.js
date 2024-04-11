// Bubble sort implementation 
let arr = [9,8,7,6,2]
let bool= false;                                     
for(let i=0;i<arr.length-1;i++){
  bool = false;
  for(let j=0;j<arr.length-i-1;j++){
    
    if(arr[j] > arr[j+1]){
      let tem = arr[j];
      arr[j] = arr[j+1];
      arr[j+1] = tem;
      bool = true;
    }
  }
  if(bool == false)
    break;
}

console.log(arr);
