package ITCourses;

// Меняем значения переменных местами (Хороший вариант)
class ChangeTheValuesOfVariables {

    public static void main (String args[]) {

        int a = 1;
        int b = 2;

        System.out.println("До смены значений: ");
        System.out.println("a = " + a + ", " + "b = " + b + ";");

        int temp = a;
        a = b;
        b = temp;

        System.out.println();
        System.out.println("После смены значений: ");
        System.out.println("a = " + a + ", " + "b = " + b + ";");
    }
}
