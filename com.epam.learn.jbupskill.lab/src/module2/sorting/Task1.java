package module2.sorting;

//Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один массив,
// включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя дополнительный массив.

public class Task1 {
    public static void main(String[] args) {
        int naturalNumbersK = 3;
        int count = 0;
        int[] oneArrays = new int[]{1, 2, 3, 4, 5, 6};
        int[] twoArrays = new int[]{7, 8, 9, 0};

        int[] unitedArrays = new int[(oneArrays.length + twoArrays.length)];
        for (int i = 0; i < unitedArrays.length; i++) {
            if (naturalNumbersK > i) {
                unitedArrays[i] = oneArrays[i];
            } else if (count < naturalNumbersK) {
                unitedArrays[i] = twoArrays[count];
                count++;

            } else
                unitedArrays[i] = oneArrays[i - naturalNumbersK - 1];
        }
        for (int j : unitedArrays) {
            System.out.print(j + " ");
        }
    }
}



