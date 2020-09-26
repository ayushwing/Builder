package com.builder.algo.random;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 25, 24, 25, 6, 4, 8, 1, 3 };
		new BubbleSort().bubbleSort(arr);
	}

	public void bubbleSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}

		}
		System.out.println("Sorted Array --> " + Arrays.toString(arr));
	}
}
