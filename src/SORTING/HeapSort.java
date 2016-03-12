/**
 * 
 */
package SORTING;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amit
 *
 */
public class HeapSort {

	private int heapSize = 0;
	
	public HeapSort() {
		
	}
	
	private int __left(int i) {
		return 2*i;
	}
	
	
	private int __right(int i) {
		return (2*i+1);
	}
	
	private int[] __exchange(int[] ipar, int indx1, int indx2) {
		
		int elem = ipar[indx1];
		ipar[indx1] = ipar[indx2];
		ipar[indx2] =  elem;
		return ipar;
	}
	
	public int[] __MaxHeapify(int[] ipar, int indx) {
		
		int lftI = __left(indx);
		int rghtI = __right(indx);
		int largestI = -1;
		if (lftI <= heapSize && ipar[lftI] >=  ipar[indx]) {
			largestI = lftI;
		} else {
			largestI = indx;
		}
		if (rghtI <= heapSize && ipar[rghtI] >=  ipar[largestI]) {
			largestI = rghtI;
		}
		
		if (largestI != indx) {
			ipar = __exchange(ipar, indx, largestI);
			ipar = __MaxHeapify(ipar, largestI);
		}
		
		return ipar;
	}
	
	private int[] _buildMaxHeap(int[] iparr) {
		heapSize = iparr.length-1;
		for(int i=(int)(heapSize/2); i >= 0; i--) {
			iparr = __MaxHeapify(iparr,i);
		}
		return iparr;
	}
	
	public List<Integer> Sort(int[] iparr) {
		iparr = _buildMaxHeap(iparr);
		List<Integer> sortedList = new  ArrayList<Integer>();
		
		while(heapSize != 0) {
			iparr = __exchange(iparr, 0, heapSize);
			sortedList.add(iparr[heapSize]);
			heapSize -= 1;
			iparr = __MaxHeapify(iparr,0);
		}
		sortedList.add(iparr[heapSize]);
		return sortedList;
	}
	
	public void printSortedList(List<Integer> sortedList) {
		
		for (int i : sortedList) {
			System.out.print(i+" , "); // sortedList.get(sortedList.size() - 1 - i)
		}
	}
}
