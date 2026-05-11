
import java.util.Scanner;
public class addElement {
    public static void main(String[] args) {
        int soluong;
        int sophantu;
        int addnumeber;
        int index;
        Scanner input = new Scanner(System.in);
            do {
                System.out.print("nhap so luong phan tu cua mang muon tao: ");
                soluong = input.nextInt();
                if(soluong<=0) System.out.println("Vui long nhap so luong lon hon 0");
            }while(soluong<=0);
                do {
                    System.out.print("nhap so gia tri phan tu cua mang da co: ");
                    sophantu = input.nextInt();
                    if (sophantu > soluong || sophantu<0) System.out.println("Lỗi: Số phần tử hiện có không được lớn hơn tổng kích thước mảng!");
                    if (sophantu == soluong) {
                        System.out.println("Lỗi: Số phần tử hiện có ngang tổng kích thước mảng!;khong the them");
                    }
                }while (sophantu > soluong || sophantu<0);

        int[] arr=new int[soluong];
        for( int i =0; i <sophantu;i++){
            System.out.print("nhap gia tri thu "+(i+1)+" :");
            arr[i]= input.nextInt();
        }
        for(int i =0; i < sophantu;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        for(int j =0; j < sophantu;j++){
            System.out.print(j+"\t");
        }
        System.out.println();
        System.out.print("nhap so muon them vao: ");
        addnumeber=input.nextInt();
        System.out.print("Nhap index cua no: ");
        index=input.nextInt();
        if(index>sophantu && index<soluong){
            arr[index]=addnumeber ;
            for(int i =0; i <=index;i++){
                System.out.print(arr[i]+"\t");
            }
        }else if (index <= sophantu && index >= 0) {
            for (int i = sophantu; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = addnumeber;
            for(int i =0; i <=sophantu;i++){
                System.out.print(arr[i]+"\t");
            }
        } else {
            System.out.println("Lỗi: Index nằm ngoài phạm vi bộ nhớ của mảng!");
        }



    }
}
