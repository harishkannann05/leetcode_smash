class Solution {
    public int[] replaceElements(int[] arr) {
        int[] array=new int[arr.length];
        int great=0;
        for(int i=1;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(great<arr[j]){
                    great=arr[j];
                }
            }
            array[i-1]=great;
            great=0;
        }
        array[array.length-1]=-1;
        return array;
    }
}