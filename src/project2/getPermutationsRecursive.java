package project2;

import java.util.*;
import java.io.*;

public class getPermutationsRecursive{
	
	private int[] a;
	public int[] finArray;
	public int combinations = 1;
	public ArrayList<int[]> ret = new ArrayList<int[]>();

	getPermutationsRecursive(int n) {
		for (int i = 1; i <= n; i++) {
			combinations *= i;
		}
		finArray = new int[combinations*n];
		a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = i + 1;

	}

	int[] permutations() {
		permutation(a, 0, ret);
		return getArray(ret);
	}

	int[] getArray(ArrayList<int[]> ret) {
		for (int i = 0; i < ret.size(); i++) {
			int[] temp = ret.get(i);
			for (int j = 0; j < temp.length; j++) {
				finArray[i * temp.length + j] = temp[j];
			}
		}
		return finArray;
	}

	public static void permutation(int[] arr, int pos, ArrayList<int[]> list) {
		if (arr.length - pos == 1)
			list.add(arr.clone());
		else
			for (int i = pos; i < arr.length; i++) {
				swap(arr, pos, i);
				permutation(arr, pos + 1, list);
				swap(arr, pos, i);
			}
	}

	public static void swap(int[] arr, int pos1, int pos2) {
		int h = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = h;
	}
}