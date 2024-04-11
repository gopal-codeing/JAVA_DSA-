// Selection Sort  impelemention

let arr = [9,8,7,6,2];
let index;
for(let i=0;i<arr.length-1;i++){
     index = i;   
  for(let j=i+1;j<arr.length;j++){
    // very time check this lowest index 
    if(arr[index] > arr[j]){  
      index = j; 
      // console.log(ind);
    }
  }
// swap this 
  let tem = arr[i];
    arr[i] = arr[index];
    arr[index] = tem;
}
console.log(arr)
