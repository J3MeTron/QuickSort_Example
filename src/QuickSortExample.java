public class QuickSortExample {

    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            // 1. Выбор опорного элемента и получение его окончательной позиции в массиве
            int pivotIndex = partition(arr, left, right);

            // 2. Рекурсивная сортировка левой и правой подгрупп
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        // 1. Выбираем опорный элемент (в данном случае, правый элемент)
        int pivot = arr[right];

        // 2. Инициализируем индекс, который будет использоваться для перемещения элементов, меньших опорного, влево
        int i = left - 1;

        // 3. Проходим по подмассиву от left до right-1
        for (int j = left; j < right; j++) {
            // Если текущий элемент меньше или равен опорному
            if (arr[j] <= pivot) {
                // 4. Увеличиваем индекс i и меняем элементы местами
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // 5. Меняем опорный элемент с элементом, следующим за последним меньшим элементом
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        // 6. Возвращаем индекс опорного элемента, который теперь находится на своем окончательном месте
        return i + 1;
    }
}
