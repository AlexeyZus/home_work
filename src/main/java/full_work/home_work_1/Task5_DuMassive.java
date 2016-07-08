package full_work.home_work_1;

/**
 * Created by alexey on 13.06.16.
 */
public class Task5_DuMassive {

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int size = matrix[0].length-1;

        for(int i = 0; i < matrix.length; i++){
            matrix[i][i]=1;
            matrix[i][size-i]=1;
        }
        for (int[] local : matrix
             ) {
            for (int localVar : local
                 ) {
                System.out.print(localVar+" ");
            }
            System.out.println();
        }
    }




}
