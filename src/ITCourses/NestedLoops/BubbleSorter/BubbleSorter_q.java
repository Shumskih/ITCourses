package ITCourses.NestedLoops.BubbleSorter;

import java.util.Arrays;

class BubbleSorter_q {
    public static void sort (int[] arr) {
        for (int barrier = data.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (data[index] > data[index + 1]) {
                    int temp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = temp;
                }
            }
        }
    }
}

class BubbleSorterTest {
    public static void main (String[] args) {
        int[][] data = {
                {},
                {1},
                {0, 3, 2, 1},
                {4, 3, 2, 1, 0},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7}
        };

        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " -> ");
            BubbleSorter_q.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
