package ru.andreev;

/*
Есть отсортированный массив целых чисел int[],
но элементы сдвинуты на несколько позиций,
допустим [11, 12, 13, 14, 15, 16] сдвинут так,
что получается [14, 15, 16, 11, 12, 13].
Нужно найти минимальный элемент (язык Java).
*/

public class Main {
    public static void main(String[] args) {
        int[] rotatedArray = {14, 15, 16, 11, 12, 13};
        int minElement = findMin(rotatedArray);
        System.out.println("Минимальный элемент: " + minElement);
    }

    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return nums[low];
    }
}