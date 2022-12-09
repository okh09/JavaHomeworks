public class Homework1 {

    public static void main(String[] args) {
        System.out.println(taskOne(6, 2));
        System.out.println(taskOne(5, 7));
        System.out.println();
        taskTwo(5);
        taskTwo(-3);
        System.out.println();
        System.out.println(taskThree(-3));
        System.out.println(taskThree(100));
        System.out.println();
        printWord("hello", 5);
        System.out.println();
        replaceValue();
        System.out.println();
        fillArr();
        System.out.println();
        changeArray();
        System.out.println();
        createArray(6, 10);
        System.out.println();
        minAndMax();
    }

    static boolean taskOne(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    static void taskTwo(int a) {
        if (a >= 0) {
            System.out.println("число " + a + " положительное");
        } else {
            System.out.println("число " + a + " отрицательное");
        }
    }

    static boolean taskThree(int a) {
        return a >= 0;
    }

    static void printWord (String s, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }

    static void replaceValue() {
        int[] arr = new int[]{0, 1, 1, 0, 0, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
    }

    static void fillArr() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }

    static void changeArray() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    static void createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");

        }
    }

    static void minAndMax() {
        int[] arr = new int[]{123, -74, 96, 7, -13, 199, 44, -177};
        int min = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

}
