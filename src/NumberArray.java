import java.util.Scanner;
public class NumberArray {
    public static void main(String[] args){
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("nhap so phan tu cua mang: ");
            size=input.nextInt();
            if( size >20){
                System.out.println("so phan tu ko dc qua 20");
            }
        }while(size >20);
        array = new int[size];
        int i =0;
        while (i < array.length){
            System.out.print("vui long nhap phan tu thu " +(i+1)+ ":");
            array[i] =input.nextInt();
            i++;
        }
        System.out.println("phan tu cua mnag gom: ");
        for ( int j =0; j < array.length;j++){
            System.out.print(array[j]+"\t");
        }
        int max =array[0];
        int index =1;
        int length = array.length;
        for (int j=1; j < length;j++){
            if(array[j]>max){
                max = array[j];
                index=j+1;
            }
        }
        System.out.println("gia tri lon nhat trong mang la " + max + " ,index " + index);

    }
}
