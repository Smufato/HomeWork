public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    private static void compareNumbers() {
        int a = 12;
        int b = 14;
        if (a>=b) {
            System.out.println("a >= b");
        }
        else { System.out.println("a < b");
        }
    }

    private static void printColor() {
        int value = 112;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <=  100) {
            System.out.println("Жёлтый");
        }
        if(value > 100) {
            System.out.println("Зелёный");
        }
    }

    private static void checkSumSign() {
        int a = 2;
        int b = -23;
        if (a + b > 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}
