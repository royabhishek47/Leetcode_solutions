//Next permutations

class Solution {
public void nextPermutation(int[] nums) {
int n = nums.length;
int id1 = 0;
int id2 = 0;
int temp = 0;
int k = 0;
int p =0;
int count = 0;
int address = 0;
int id1add = 0;
int [] arr = new int[n];
for(int i = n-2;i>=0;i--){
if(nums[i]<nums[i+1]){
id1 = nums[i];
id1add = i;
count++;
break;
}
}
if(count==0){
Arrays.sort(nums);
System.out.println(nums);
}
else{
for(int i=0;i<n;i++){
arr[i] = nums[i];
}
Arrays.sort(arr,id1add+1,n);
for(int i=id1add+1;i<n;i++){
if(id1<arr[i]){
k = arr[i];
break;
}
}
for(int i=0;i<n;i++){
if(nums[i]==k){
p = i;
}
}

    temp = id1;
    id1 = nums[p];
    id2 = temp;
    
    
    for(int i = n-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            nums[i] = id1;
            nums[p] = id2;
            address = i+1;
            break;
        }
    }
    
    Arrays.sort(nums,address,n);
    System.out.println(nums);
    }
}
}