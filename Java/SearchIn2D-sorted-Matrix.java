public class SearchIn2D-sortedMatrix {
    public static boolean main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        return searchMatrix(arr, 45);
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return true;
            }
            if(matrix[r][c] < target){
                r++;
            }
            else {   //(matrix[r][c] > target)
                c--;
            }
        }
        return false;

    }
}
