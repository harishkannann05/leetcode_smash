class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int temp=0;
        int target[]=new int[index.length];
        ArrayList<Integer> element=new ArrayList<>();
        for(int i=0;i<index.length;i++){
            temp=nums[index[i]];
            element.add(index[i],nums[i]);
        }
        for(int j=0;j<index.length;j++){
            target[j]=element.get(j);
        }

        return target;
    }
}