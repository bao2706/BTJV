
//Bài 1
//public class maxValueInMatrix {
//    public static void main(String[] args){
//        double[][] matrix={{1.5, 2, 3}, {4, 1, 6}};
//        double max =matrix[0][0];
//        int xM=0;
//        int yM=0;
//        for (int x=0; x <matrix.length;x++){
//            for (int y=0;y <matrix[x].length;y++){
//                if (matrix[x][y]> max){
//                    max =matrix[x][y];
//                    yM=y;
//                    xM=x;
//
//
//                }
//                System.out.println(matrix[x][y]);
//            }
//
//            System.out.println(max +" "+ xM+" " +yM);
//        }
//    }
//}


//Bài 2
import java.util.Scanner;
public class maxValueInMatrix {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);

        int x;
        int y;
        int rows;
        int cols;
        System.out.print("nhap so cot: ");
        rows =input.nextInt();
        System.out.print("nhap so dong: ");
        cols =input.nextInt();
        double[][] matrix = new double[rows][cols];
        for (x =0; x <rows;x++){
            for ( y=0;y <cols;y++){
                System.out.print("nhap gia tri toa do ["+x+"]"+"["+y+"]:  ");
                matrix[x][y]=input.nextDouble();
                }
            }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();

        }

    }

    }
