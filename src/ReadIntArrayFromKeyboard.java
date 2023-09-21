import java.util.Scanner;

public class ReadIntArrayFromKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запросите у пользователя размер массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Создайте массив указанного размера
        int[] array = new int[size];

        // Запросите у пользователя элементы массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Закрыть Scanner после использования
        scanner.close();

        // Вывести введенный массив на экран
        System.out.println("Вы ввели следующий массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static int[] readAndPrintIntArray() {
        Scanner scanner = new Scanner(System.in);

        // Запросите у пользователя размер массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Создайте массив указанного размера
        int[] array = new int[size];

        // Запросите у пользователя элементы массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Закрыть Scanner после использования
        scanner.close();

        // Вывести введенный массив на экран
        System.out.println("Вы ввели следующий массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        return array;
    }

}
