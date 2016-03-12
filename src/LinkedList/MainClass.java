/**
 * 
 */
package LinkedList;

/**
 * @author amit
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iparray = new int[]{2,10,5,7,8,11};
		LinkedListLibrary lnkdlbr = new LinkedListLibrary();
		lnkdlbr.createaLikedList(iparray);
		lnkdlbr.printLinkedList();
		
//		System.out.println("\n REVERSING LIST ::");
//		lnkdlbr.reverseLinkedList();
//		lnkdlbr.printLinkedList();
		
		System.out.println("\n EVEN ODD MERGE LIST ::");
		lnkdlbr.evenoddMergeLinkedList();
		lnkdlbr.printLinkedList();
		
	}

}
