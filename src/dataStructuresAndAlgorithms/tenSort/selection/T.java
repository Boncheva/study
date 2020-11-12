package dataStructuresAndAlgorithms.tenSort.selection;

import dataStructuresAndAlgorithms.tenSort.util.Util;

/** 选择排序，每次外循环将最小的归位
 * @description:
 * @author: zouhao
 * @Date: 2020/11/12
 * @time: 11:55
 */
public class T {

    public static void main(String[] args) {
        int[] arr = Util.getArr();
        sort(arr);
    }

    public static void sort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    Util.swap(arr, i, j);
                }
            }
        }
        Util.print(arr);
    }


}
