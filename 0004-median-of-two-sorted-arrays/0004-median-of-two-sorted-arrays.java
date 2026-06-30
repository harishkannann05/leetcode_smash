class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index=nums1.length+nums2.length;
        int pos=0;
        int[] array=new int[index];
        System.arraycopy(nums1,0,array,0,nums1.length);
        System.arraycopy(nums2,0,array,nums1.length,nums2.length);
        Arrays.sort(array);
        if(index%2==0){
            int sum=(array[index/2]+array[(index/2)-1]);
                    System.out.println(sum);
                float a=(float)sum/2;
            return a;
        }
        return array[index/2];
    }
}