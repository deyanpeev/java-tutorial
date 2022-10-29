public class Main {
    public static void main(String[] args) {
        printSemiPyramid();
    }

    public static void triggerTernaryOperation() {
        int a = 11;
        System.out.println(a > 10 ? "bigger" : "smaller");
    }

    public static void increment() {
        int a = 10;
        // a++
        // a += 1;
        // a = a + 1;

        // a+=5
        // a = a + 5

        int b = a++ * ++a;
        System.out.println();
    }

    public static void bitwise() {
        int a = 5;
        int b = 2;

        int binaryOr = b | a;
        System.out.println(Integer.toBinaryString(binaryOr) + "or that is: " + binaryOr);
    }

    public static void demoConditons() {
        int i = 11;
        if(i == 10) {
            System.out.println("Number is 10");
        } else if (i > 10) {
            System.out.println("Number is bigger than 10");
        } else {
            System.out.println("Number is smaller than 10");
        }
    }

    public static void demoForLoops() {
        for(int i = 0; i <= 10; i+=2) {
            System.out.println("Hello - " + i);
        }
    }

    public static void printSemiPyramid() {
        int a = 4;
        String charToRepeat = "*";
        for(int i = 0; i < a; i++) {
            //System.out.println(" ".repeat(a - i - 1) + charToRepeat.repeat(i + 1));
            System.out.println(customRepeat(" ", a - i - 1)
                    + customRepeat("*", (i * 2 + 1)));
        }
    }

    public static String customRepeat(String stringToRepeat, int count) {
        String result = "";
        for(int i = 0; i < count; i++) {
            result += stringToRepeat;
        }

        return result;
    }
}