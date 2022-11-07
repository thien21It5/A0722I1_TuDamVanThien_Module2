package ss7_AbstractClassAndInterface.thucHanh.TITVInterface;

public class demo {
    public static void main(String[] args) {
        double[] arr ={1, 12, 43, 54, 23, 51, 16, 24};
        int n = arr.length;
        double key;
        int i, j;
        for (i = 0; i < n; i++) {
            key = arr[i];
            j = i - 1;
//Di chuyển các phần tử có giá trị lớn hơn giá trị key về
// sau 1 vị trí so với vị trí ban đầu
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[i];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Mảng là: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }

}
