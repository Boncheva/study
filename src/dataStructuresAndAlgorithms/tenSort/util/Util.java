package dataStructuresAndAlgorithms.tenSort.util;

/**
 * @description:
 * @author: zouhao
 * @Date: 2020/11/12
 * @time: 15:34
 */
public class Util {

    private static int arrLength = 100;

    private static int[] arrOld = new int[arrLength];

    public static int[] getArr() {
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            int random = (int) (Math.random() * 100);
            arr[i] = random;
        }
        for (int i = 0; i < arr.length; i++) {
            arrOld[i] = arr[i];
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                System.out.println("错误");
                System.out.println(arrOld);
                return;
            }
        }
        System.out.println("正确");
    }
}
