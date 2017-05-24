package ITCourses.StringInvert;

class StringInverter {
    public static String invert(String arg) {
        char[] data = arg.toCharArray();
        for (int k = 0; k < data.length / 2; k++ ) {
            char temp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = temp;
        }
        return new String(data);
    }
}

class StringInverterTest {
    public static void main(String[] args) {
        System.out.print(StringInverter.invert("Привет, как дела?"));
    }
}
