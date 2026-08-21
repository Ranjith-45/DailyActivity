package SortingAlgorithms;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 5, 2, 3, 7, 1 };
		boolean flag = false;
		int temp;
		int innerCount = 0;
		int outerCount = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
				innerCount++;
			}
			outerCount++;
			if (!flag) {
				break;
			}
		}
		System.out.println("Inner Count" + innerCount);
		System.out.println("Outer Count" + outerCount);
		System.out.println(Arrays.toString(arr));
	}

}
