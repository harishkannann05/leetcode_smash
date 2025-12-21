class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] rowMins = new int[m];
        int[] colMax = new int[n];

        Arrays.fill(rowMins, Integer.MAX_VALUE);
        Arrays.fill(colMax, Integer.MIN_VALUE);

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                rowMins[i] = Math.min(rowMins[i], matrix[i][j]);
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }


        List<Integer> luckyNum = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == rowMins[i] && matrix[i][j] == colMax[j]){
                luckyNum.add(matrix[i][j]);
                }
                rowMins[i] = Math.min(rowMins[i], matrix[i][j]);
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }

        return luckyNum;
    }
}