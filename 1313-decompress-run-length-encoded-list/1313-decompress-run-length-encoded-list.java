class Solution {
    public int[] decompressRLElist(int[] nums) {
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i=0;i<nums.length;i+=2){
           int freq=nums[i];
           int val=nums[i+1];
            for(int j=0;j<freq;j++){
                arr.add(val);
            }
        }
    return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}