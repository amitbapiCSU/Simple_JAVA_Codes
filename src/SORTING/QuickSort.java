/**
 * 
 */
package SORTING;

/**
 * @author amit
 *
 */
public class QuickSort {
	
//	private int[] iparr = null;
	
	public QuickSort() {
	}
	
	private int[] __exchange(int[] ipar, int indx1, int indx2) {
		
		int elem = ipar[indx1];
		ipar[indx1] = ipar[indx2];
		ipar[indx2] =  elem;
		return ipar;
	}
	
	private int _partition(int[] ipar, int strti, int endi) {
		int prtindx = 0;
		int lastsmallindx = (strti-1);
		
		if (ipar.length != 0) {
			int pivotelem = ipar[endi];
			for (int i = strti; i <= endi-1; i++) {
				if (ipar[i] <= pivotelem) {
					lastsmallindx ++;
//					System.out.println("1");
					ipar = __exchange(ipar,lastsmallindx,i);
				}
			}
//			System.out.println("2 :: "+lastsmallindx+" :: "+endi);
			lastsmallindx++;
			ipar = __exchange(ipar,(lastsmallindx),endi);
		}
		prtindx = lastsmallindx;
		return prtindx;
	}
	
	
	private void printSortedArray(int[] arr) {
		for(int i : arr) {
			System.out.print(i+",");
		}
	}
	
	public int[] Sort(int[] iparr, int si, int ei) {
		
		if (si < ei) {
			int prti = _partition(iparr, si, ei);
			iparr = Sort(iparr, si, prti-1);
			iparr = Sort(iparr, prti+1, ei);
		}
//		System.out.println("SI :: "+ si + " :: EI :: "+ei+" :: OP :: ");
//		printSortedArray(iparr);
//		System.out.println(" :: ");
		return iparr;
	}
}
