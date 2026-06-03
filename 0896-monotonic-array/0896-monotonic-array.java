class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean f=true;
        boolean r=true;;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                f= false;
                
            }
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
            r= false;
           
            }
        }
       return f||r;
    }
}