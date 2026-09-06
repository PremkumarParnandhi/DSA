class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        int right=left+1;
        int temp=0;
        while(right<=nums.length-1){
 
            if(nums[left]==0 && nums[right]==0){
                right++;
            }
            else if(nums[left]==0 && nums[right]!=0){
                temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                right++;
                left++;
            }
            else{
            right++;
            left++;}
            
        }
    }
}