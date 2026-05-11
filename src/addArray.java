import java.util.Scanner;
public class addArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr1 ;
        int sl1;
        int sl2;
        int[] arr2;
        int[] arr3;
        System.out.println("nhap so phan tu cua mang 1");
        sl1=input.nextInt();
        arr1 = new int[sl1];
        for(int i =0; i < sl1;i++){
            System.out.println("nhap gia tri thu "+(i+1)+" cua mang 1: ");
            arr1[i]=input.nextInt();
        }
        System.out.println("nhap so phan tu cua mang 2");
        sl2=input.nextInt() ;
        arr2 = new int[sl2];
        for(int i =0; i < sl2;i++){
            System.out.println("nhap gia tri thu "+(i+1)+" cua mang 2: ");
            arr2[i]=input.nextInt();
        }
        for(int i =0; i<sl1;i++){
            System.out.print(arr1[i]);
        }
        System.out.println();
        for(int i =0; i<sl2;i++){
            System.out.print(arr2[i]);
        }
        System.out.println();
        arr3 =gopmang(arr1,arr2,sl1,sl2);
        for (int i=0;i< arr3.length;i++){
            System.out.print(arr3[i]+"\t");
        }

    }
    public static int[] gopmang(int[] arr1,int[] arr2,int sl1,int sl2){
        int [] arr3=new int[sl1+sl2];
        for(int i =0;i < sl1;i++){
            arr3[i]=arr1[i];
        }
        for(int i =sl1;i < sl2+sl1;i++){
            arr3[i]=arr2[i-sl1];
        }
        return arr3;
    }

}
