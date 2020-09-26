package com.builder.algo.random;

import java.util.Arrays;

public class CountOccurrence {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 5, 6, 7, 7, 7, 7, 7 };
		int findFor = 2;
		System.out.println("Using linear --> " + new CountOccurrence().usingLinearSearch(arr, findFor));
		System.out.println("Using binary --> " + new CountOccurrence().usingBinarySearch(arr, findFor));
	}

	long usingLinearSearch(int arr[], int findFor) {
		return Arrays.stream(arr)
					 .filter(a -> findFor == a)
					 .count();
	}

	int usingBinarySearch(int arr[], int findFor) {

		int searchIndex = binarySearch(arr, 0, arr.length - 1, findFor);
		if (searchIndex >= 0) {
			int count = 1;
			int left = searchIndex - 1;
			while (arr[searchIndex] == arr[left] && left >= 0) {
				count++;
				left--;
			}

			int right = searchIndex + 1;
			while (arr[searchIndex] == arr[right] && left < arr.length) {
				count++;
				right++;
			}
			return count;
		}
		return -1;
	}

	int binarySearch(int arr[], int low, int high, int value) {

		int mid = (low + high) / 2;

		if (low == high) {
			return -1;
		}

		if (value == arr[mid])
			return mid;

		if (value > arr[mid]) {
			return binarySearch(arr, mid + 1, high, value);
		} else {
			return binarySearch(arr, low, mid - 1, value);
		}
	}

}
