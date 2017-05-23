package ITCourses.InvertOfArrays;

import java.util.Arrays;

class ArrayInverter {

    public static void invert(int[] data) {
        for (int k = 0; k < data.length / 2; k++) {
            int temp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = temp;
        }
    }

    public static void invertRec(int[] data, int k) {
        if(k < data.length / 2) {
            int temp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = temp;
            invertRec(data, k + 1);
        }
    }

    public static void labInvertFromMiddle(int[] data) {
        for (int k = data.length - 1; k > data.length/2 - 1; k--) {
            int temp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = temp;
        }
    }
}

class ArrayInverterTester {
    public static void main (String[] args) {
        testInvert(new int[]{});
        testInvert(new int[]{0});
        testInvert(new int[]{0, 1});
        testInvert(new int[]{0, 1, 2, 3, 4});
    }

    private static void testInvert(int[] arr) {
        System.out.print(Arrays.toString(arr) + " -> ");
        ArrayInverter.labInvertFromMiddle(arr);
        System.out.println(Arrays.toString(arr));
    }
}
