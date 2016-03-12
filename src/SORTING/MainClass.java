/**
 * 
 */
package SORTING;

import java.util.List;

/**
 * @author amit
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void printSortedArray(int[] arr) {
		for(int i : arr) {
			System.out.print(i+" , ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iparray = new int[]{2,10,5,7,8,11,0,18,20,16,19};
		
		QuickSort QSort = new QuickSort();
		int[] oparray = QSort.Sort(iparray, 0, (iparray.length-1));
		System.out.println("QUICK SORT OUTPUT ::");
		System.out.println(oparray.length);
		printSortedArray(oparray);
		
		HeapSort HSort = new HeapSort();
		List<Integer> oparr = HSort.Sort(iparray);
		System.out.println("\n HEAP SORT OUTPUT ::");
		HSort.printSortedList(oparr);
	}

}
