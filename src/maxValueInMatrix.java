
public class maxValueInMatrix {
    public static void main(String[] args){
        double[][] matrix={{1.5, 2, 3}, {4, 1, 6}};
        double max =matrix[0][0];
        int xM=0;
        int yM=0;
        for (int x=0; x <matrix.length;x++){
            for (int y=0;y <matrix[x].length;y++){
                if (matrix[x][y]> max){
                    max =matrix[x][y];
                    yM=y;
                    xM=x;


                }
                System.out.println(matrix[x][y]);
            }

            System.out.println(max +" "+ xM+" " +yM);
        }
    }
}
