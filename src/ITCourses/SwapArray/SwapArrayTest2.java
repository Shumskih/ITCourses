package ITCourses.SwapArray;


import java.util.Arrays;

// Лабораторная. Перемещение самого маленького значения в массиве справа налево
class SwapArrayTest2 {
        public static void main(String[] args) {
            int[] array = {5, 1, 3, 4, 0, 8, 9, 7, 6, 2};
            System.out.println(Arrays.toString(array));
            for (int k = array.length - 1; k > 0; k--) {
                conditionalSwapTheSmallestNumberFromRightToLeft(array, k, k - 1);
            }
            System.out.println(Arrays.toString(array));
        }


        public static void conditionalSwapTheSmallestNumberFromRightToLeft(int[] array, int fst, int snd) {
        if (array[fst] < array[snd]) {
            int temp = array[fst];
            array[fst] = array[snd];
            array[snd] = temp;
        }
    }
}
