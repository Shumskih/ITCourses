package ITCourses;

// Меняем значения переменных местами (Хороший вариант)
// Обмен значениями переменных с использованием временной переменной
class ExChangeTheValuesOfVariables {

    public static void main (String args[]) {

        int a = 1;
        int b = 2;

        System.out.println("До обмена значениями: ");
        System.out.println("a = " + a + ", " + "b = " + b + ";");

        int temp = a;
        a = b;
        b = temp;

        System.out.println();
        System.out.println("После обмена значениями: ");
        System.out.println("a = " + a + ", " + "b = " + b + ";");
    }
}
