
public class minNumberArray {
    public static void main(String[] args){
        int[] arr ={12,21,43,53,46,23,5,2324,54,765};
        int index =minValue(arr);
        System.out.println("gia tri nho nhat cua mang la "+arr[index]);

    }
    public static int minValue(int[] array){
        int index =0;
        int min = array[0];
        for(int i =1;i < array.length;i++){
            if(array[i]<min){
                index=i;
            }

        }
        return index;

    }
}
