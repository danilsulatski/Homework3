import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        invertOnesAndZeros();
        System.out.println();

        arrayLengthOneHundred();
        System.out.println();

        doubleArray();
        System.out.println();

        squareArray();
        System.out.println();

        int len = 5;
        int initialValue = 2;
        System.out.println(Arrays.toString(fixedArray(len, initialValue)));
        System.out.println();

        minAndMaxOfTheArray();
        System.out.println();

        int [] mass = { 1, 1, 8, 9, 1 };
        System.out.println(checkRightAndLeftSum(mass));

    }

    //задание 1
    public static void invertOnesAndZeros() {
        int [] arr1 = { 0, 1, 0, 1, 1, 0, 0, 1 };
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i ++) {
            if (arr1[i] == 0) {
                arr1 [i] = 1;
            } else {
                arr1 [i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }

    //задание 2
    public static void arrayLengthOneHundred() {
        int [] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i ++) {
            arr2 [i] = i + 1;
        }
        System.out.println(Arrays.toString(arr2));
    }

    //задание3
    public static void doubleArray () {
        int [] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr3.length; i ++) {
            if (arr3 [i] < 6) {
                arr3 [i] = 2 * arr3 [i];
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

    //задание 4
    public static void squareArray () {
        int [] [] table = new int [4] [4];
        for (int i = 0; i < 4; i ++) {
            for (int j = 0; j < 4; j ++) {
                if (i == j) {
                    table [i] [j] = 1;
                } else if (i + j == 3) {
                    table [i] [j] = 1;
                } else {
                    table [i] [j] = 0;
                }
                System.out.print(table [i] [j]);
            }
            System.out.println();
        }
    }

    //задание 5
    public static int [] fixedArray (int x, int y) {
        int [] arr4 = new int [x];
        for (int i = 0; i < x; i++) {
            arr4 [i] = y;
        }
        return arr4;
    }

    //задание 6
    public static void minAndMaxOfTheArray () {
        int [] arr5 = {12, 15, 122, 1, 1, 33, 6};
        int amax = arr5 [0];
        int amin = arr5 [0];
        for (int i = 0; i < arr5.length; i ++) {
            if (arr5 [i] < amin) {
                amin = arr5 [i];
            }
            if (arr5 [i] > amax) {
                amax = arr5 [i];
            }
        }
        System.out.println("Наименьший элемент массива: " + amin);
        System.out.println("Наибольший элемент массива: " + amax);
    }

    //задание 7
    public static boolean checkRightAndLeftSum (int [] arr6) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < (arr6.length - 1); i ++) {
            a = a + arr6 [i];
            b = 0;
            for (int j = i + 1; j < arr6.length; j ++) {
                b = b + arr6 [j];
            }
            if (a == b) {
                break;
            }
        }
        return (a == b);
    }

    //задание 8



}
