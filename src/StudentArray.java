import java.util.Scanner;
public class StudentArray {
    public static void main(String[] args){
        String[] students = {"hoc sinh so 1","hoc sinh so 2","hoc sinh so 3","hoc sinh so 4","hoc sinh so 5"};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten hoc sinh: ");
        String input_name = input.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i ++){
            if(students[i].equals(input_name)){
                System.out.println(input_name+"o vi tri thu " + (i+1));
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("ko tim thay hoc sinh '"+ input_name+"'");
        }
    }
}
