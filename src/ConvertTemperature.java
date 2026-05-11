import java.util.Scanner;
public class ConvertTemperature {
    public static void main(String[] args){
        double FSC;
        double CSF;
        int choice;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Menu: ");
            System.out.println("1. chuyen doi do F sang C");
            System.out.println("2. chuyen doi do c sang F");
            System.out.println("0.Exit");
            System.out.println("Nhap lua chon cua ban");
            choice = input.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Nhap nhiet do theo do F");
                    FSC =input.nextDouble();
                    System.out.println("nhiet do F dc chuyen thanh "+FSC(FSC)+" do C");
                    break;
                }
                case 2:{
                    System.out.println("Nhap nhiet do theo do C");
                    CSF =input.nextDouble();
                    System.out.println("nhiet do C dc chuyen thanh "+ CSF(CSF) +" do F");
                    break;
                }
                case 3:{
                    System.exit(0);
                }
            }
        }while(choice !=0);
    }
    public static double CSF(double doC) {
        double doF = (9.0 / 5) * doC + 32;
        return doF;
    }

    public static double FSC(double doF) {
        double doC = (5.0 / 9) * (doF - 32);
        return doC;
    }
}
