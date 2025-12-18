class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0,temp=0;
        for(int i=0;i<gain.length;i++){
            temp+=gain[i];
            if(sum<temp){
                sum=temp;
            }
        }
        return sum;
    }
}