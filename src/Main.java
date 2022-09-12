public class Main {
    public static void main(String[] args) {
//Задача 1 и 2
        System.out.println("Задача 1 и 2");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = {2, 4, 8, 16, 32, 64};
//Задача 2
        for (int i = 0; i < arr1.length; i++) {
            if (i < arr1.length - 1) {
                System.out.print(arr1[i] + ",");
            } else {
                System.out.print(arr1[i] + "\n");
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (i < arr2.length - 1) {
                System.out.print(arr2[i] + ",");
            } else {
                System.out.print(arr2[i] + "\n");
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ",");
            if (i == arr3.length - 1) {
                System.out.print(arr3[i] + "\n");
            }
        }
//Задача 3
        System.out.println("Задача 3");
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr1[i] + ",");
            } else {
                System.out.print(arr1[i] + "\n");
            }
        }
        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr2[i] + ",");
            } else {
                System.out.print(arr2[i] + "\n");
            }
        }
        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr3[i] + ",");
            } else {
                System.out.print(arr3[i] + "\n");
            }
        }
        //Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < arr1.length; i++) {
            if ((arr1[i]) % 2 != 0) {
                arr1[i] += 1;
            }
            if (i < arr1.length - 1) {
                System.out.print(arr1[i] + ",");
            } else {
                System.out.print(arr1[i] + "\n");
            }
        }
    }
}