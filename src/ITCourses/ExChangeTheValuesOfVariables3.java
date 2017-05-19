package ITCourses;

// Обмен значениями переменных с помощью исключающего ИЛИ (XOR) (Плохой вариант,
// т.к. работает только с целыми числами)
class ExChangeTheValuesOfVariables3 {

    public static void main (String args[]) {

        int a = 1;
        int b = 2;

        System.out.println("До обмена значениями: ");
        System.out.println("a = " + a + ", b = " + b + ";");

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println();
        System.out.println("После обмена значениями: ");
        System.out.println("a = " + a + ", b = " + b + ";");
    }
}
