package project2;

import java.util.Arrays;

public class SortingApp {
	
	public static void main(String[] args) {

			permTestForN4();
			permTestForN6();
			permTestForN8();
	}
	
	private static void permTestForN8() {
		long startTime;
		long endTime;
		long startTime2;
		long endTime2;
		long startTime3;
		long endTime3;
		double duration;
		double duration2;
		double duration3;
		int i;
		getPermutationsRecursive permOf8 = new getPermutationsRecursive(8);
		int [] oldArray8 = permOf8.permutations();
		Integer[] testArrayNIs8  = new Integer[permOf8.combinations*8];
		i = 0;
		for (int value : oldArray8) {
			testArrayNIs8[i++] = Integer.valueOf(value);
		}
		
		Integer[] arrayNIs8Clone1 = testArrayNIs8.clone();
		Integer[] arrayNIs8Clone2 = testArrayNIs8.clone();
		Integer[] arrayNIs8Clone3 = testArrayNIs8.clone();
		
		startTime = System.nanoTime();
		MergeSort.sort(arrayNIs8Clone1);
		endTime = System.nanoTime();
		startTime2 = System.nanoTime();
		QuickSort.sort(arrayNIs8Clone2);
		endTime2 = System.nanoTime();
		startTime3 = System.nanoTime();
		HeapSort.sort(arrayNIs8Clone3);
		endTime3 = System.nanoTime();
		
		duration = (endTime - startTime) / 1000000000d;
		duration2 = (endTime2 - startTime2) / 1000000000d;
		duration3 = (endTime3 - startTime3) / 1000000000d;
		double ave = (duration + duration2 + duration3)/3.0;
		
		System.out.println("  Test's with n = 8");
		System.out.println("  Merge    Quick    Heap");
		System.out.printf("%7.3fs %7.3fs %7.3fs %n", duration ,duration2 ,duration3);
		System.out.printf("  Compares for each test-- %n  %d %8d %8d %n",MergeSort.comparesCount,
				QuickSort.comparesCount,HeapSort.comparesCount);
		System.out.printf("  The average of the tests %4.4fs  %n%n", ave);
	}

	private static void permTestForN6() {
		long startTime;
		long endTime;
		long startTime2;
		long endTime2;
		long startTime3;
		long endTime3;
		double duration;
		double duration2;
		double duration3;
		int i;
		
		getPermutationsRecursive permOf6 = new getPermutationsRecursive(6);
		int [] oldArray6 = permOf6.permutations();
		Integer[] testArrayNIs6  = new Integer[permOf6.combinations*6];
		i = 0;
		for (int value : oldArray6) {
			testArrayNIs6[i++] = Integer.valueOf(value);
		}
		
		Integer[] arrayNIs6Clone1 = testArrayNIs6.clone();
		Integer[] arrayNIs6Clone2 = testArrayNIs6.clone();
		Integer[] arrayNIs6Clone3 = testArrayNIs6.clone();
		
		startTime = System.nanoTime();
		MergeSort.sort(arrayNIs6Clone1);
		endTime = System.nanoTime();
		startTime2 = System.nanoTime();
		QuickSort.sort(arrayNIs6Clone2);
		endTime2 = System.nanoTime();
		startTime3 = System.nanoTime();
		HeapSort.sort(arrayNIs6Clone3);
		endTime3 = System.nanoTime();
		
		duration = (endTime - startTime) / 1000000000d;
		duration2 = (endTime2 - startTime2) / 1000000000d;
		duration3 = (endTime3 - startTime3) / 1000000000d;
		double ave = (duration + duration2 + duration3)/3.0;
		
		System.out.println("  Test's with n = 6");
		System.out.println("  Merge    Quick    Heap");
		System.out.printf("%7.3fs %7.3fs %7.3fs %n", duration ,duration2 ,duration3);
		System.out.printf("  Compares for each test-- %n  %d %8d %8d %n",MergeSort.comparesCount,
				QuickSort.comparesCount,HeapSort.comparesCount);
		System.out.printf("  The average of the tests %4.4fs  %n%n", ave);
	}

	private static void permTestForN4() {
		long startTime;
		long endTime;
		long startTime2;
		long endTime2;
		long startTime3;
		long endTime3;
		double duration;
		double duration2;
		double duration3;
		int i;
		
		getPermutationsRecursive permOf4 = new getPermutationsRecursive(4);
		int [] oldArray = permOf4.permutations();
		Integer[] testArrayNIs4  = new Integer[permOf4.combinations*4];
		i = 0;
		for (int value : oldArray) {
			testArrayNIs4[i++] = Integer.valueOf(value);
		}
		Integer[] arrayNIs4Clone1 = testArrayNIs4.clone();
		Integer[] arrayNIs4Clone2 = testArrayNIs4.clone();
		Integer[] arrayNIs4Clone3 = testArrayNIs4.clone();
		
		startTime = System.nanoTime();
		MergeSort.sort(arrayNIs4Clone1);
		endTime = System.nanoTime();
		startTime2 = System.nanoTime();
		QuickSort.sort(arrayNIs4Clone2);
		endTime2 = System.nanoTime();
		startTime3 = System.nanoTime();
		HeapSort.sort(arrayNIs4Clone3);
		endTime3 = System.nanoTime();
		
		duration = (endTime - startTime) / 1000000000d;
		duration2 = (endTime2 - startTime2) / 1000000000d;
		duration3 = (endTime3 - startTime3) / 1000000000d;
		double ave = (duration + duration2 + duration3)/3.0;
		
		System.out.println("  Test's with n = 4");
		System.out.println("  Merge    Quick    Heap");
		System.out.printf("%7.3fs %7.3fs %7.3fs %n", duration ,duration2 ,duration3);
		System.out.printf("  Compares for each test-- %n  %d %8d %8d %n",MergeSort.comparesCount,
				QuickSort.comparesCount,HeapSort.comparesCount);
		System.out.printf("  The average of the tests %4.4fs  %n%n", ave);
		
	}
}

