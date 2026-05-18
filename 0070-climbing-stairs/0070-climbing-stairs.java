class Solution {
    public int climbStairs(int n) {
        int i=0,s1=0,s2=1,s3=0;
        while(i<n){
            s3=s1+s2;
            s1=s2;
            s2=s3;
            i++;
        }
        return s3;
    }
}