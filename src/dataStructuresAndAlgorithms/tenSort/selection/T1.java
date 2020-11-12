package dataStructuresAndAlgorithms.tenSort.selection;

import dataStructuresAndAlgorithms.tenSort.util.Util;

/** 选择排序优化，每次外循环将最大的和最小的归位
 * @description:
 * @author: zouhao
 * @Date: 2020/11/12
 * @time: 16:28
 */
public class T1 {

    public static void main(String[] args) {
        int[] arr = Util.getArr();
        sort(arr);
    }

    public static void sort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            for (int j = i + 1; j <= length - i - 1; j++) {
                if (arr[i] > arr[j]) {
                    Util.swap(arr, i, j);
                }
                if (arr[j] > arr[length - 1 - i]) {
                    Util.swap(arr, j, length - 1 - i);
                    if (arr[i] > arr[j]) {
                        Util.swap(arr, i, j);
                    }
                }
            }
        }
        Util.print(arr);
    }
}
