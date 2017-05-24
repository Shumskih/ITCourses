package ITCourses.SwapArray;

import java.util.Arrays;

class SwapArray {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 0, 8, 9, 7, 6, 2};
        System.out.println(Arrays.toString(array));
        for (int k = 0; k < array.length - 1; k++) {
            conditionalSwap(array, k, k + 1);
        }
        System.out.println(Arrays.toString(array));
    }

    // Сортировка значений в массиве от меньшего к большему
    public static void swap(int[] array, int fst, int snd) {
        int temp = array[fst];
        array[fst] = array[snd];
        array[snd] = temp;
    }

    // Сортировка. Перемещение самого большого значения в массиве слева направо
    public static void conditionalSwap(int[] array, int fst, int snd) {
        if (array[fst] > array[snd]) {
            int tmp = array[fst];
            array[fst] = array[snd];
            array[snd] = tmp;
        }
    }
}


