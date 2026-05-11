import java.util.Scanner;
public class RemoveElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index =0;
        int[] arr = {9, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.print("Ham ban dau: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
        System.out.print("index mang:  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("");
        System.out.print("nhap so ban muon xoa: ");
        int elm_del = input.nextInt();
        for(int i =0;i < arr.length;i++) {
            if (elm_del == arr[i]) {
                index = i;
                break;
            }
        }
        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1]=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +"\t");
        }

    }
}


