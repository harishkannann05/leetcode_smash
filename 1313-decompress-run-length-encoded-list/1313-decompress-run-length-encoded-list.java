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
    int[] array=new int[arr.size()];
    for(int k=0;k<arr.size();k++){         
        array[k]=arr.get(k);
        }
    // return arr.stream().mapToInt(Integer::intValue).toArray();  it consomus small overhead
    return array;
    }
}