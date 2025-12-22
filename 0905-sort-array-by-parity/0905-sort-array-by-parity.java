class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i++){
                if(nums[i]%2!=0){
                    for(int j=i+1;j<nums.length;j++){
                    if(nums[j]%2==0){
                        temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        break;
                    }
                }
            }
        }return nums;
    }
}