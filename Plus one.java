//Plus one

class Solution {
    public int[] plusOne(int[] digits) {
        int flag =0;
        int sum=0;
        int carry=0;
        for(int i=digits.length-1;i>=0;i--){
            if(flag==0){ //This If runs only once
                flag=1;
                if(digits[i]<9){
                    digits[i]+=1;
                    return digits;
                }else{
                    digits[i]=0;
                    carry=1;
                }
            }else{
                //this runs if carry obtained in first try
                sum = digits[i]+carry; 
                if(sum>9){ //again if sum >9 carry on
                    digits[i]=0;
                    carry=1;
                }else{ //else terminate here
                    digits[i]=sum;
                    carry=0; //mark carry as 0
                    return digits;
                }
            }
        }
        //this runs for the cases 9,99,999,...
        if(carry>0){ 
            //create array of length+1 than digits
            int [] arr = new int [digits.length+1];
            arr[0]=carry;
            for(int i=1;i<arr.length;i++)
                arr[i]=digits[i-1];//to adjust diff of 1 bw lengths
            return arr;
        }
        return null; //failed case
    }
}