/**
 * 
 */
package LinkedList;

/**
 * @author amit
 *
 */
public class LinkedListLibrary {
	
	private Node head = null;
	
	public LinkedListLibrary() {
		
	}
	
	public void  createaLikedList(int[] ipdata){
		
		int itrtn = 0;
		int ipdataLen = ipdata.length;
		Node prevNode = null;
		
		for (int i : ipdata) {
//			System.out.println(i);
			Node currNode = new Node(i, null);
			if (itrtn == 0) {
				
				head = currNode;
				prevNode = head;
				
			} else {
				
				prevNode.setNext(currNode);
				prevNode = currNode;
			}
			itrtn ++;
		}
	}
	
	public void printLinkedList() {
		Node itrNode = head;
		while(itrNode != null) {
			System.out.print(itrNode.getData()+" : ");
			itrNode = itrNode.getNext();
		}
	}
	
	public void reverseLinkedList() {
		Node curr = head;
		Node prev = null; // new Node();
//		prev.setNext(null);
		
		while(curr.getNext() != null) {
			Node next = curr.getNext();
			curr.setNext(prev==null ? null : prev);
			prev = curr;
			curr = next;
		}
//		System.out.println("2 :"+curr.getData());		
		head = curr;
		head.setNext(prev);
		
	}
	
	public void evenoddMergeLinkedList() {
		
		Node evenHead = null;
		Node evenTail = null;
		Node oddHead = null;
		Node oddTail = null;
		
		Node itrtnNode = head;
		int cnt = 0;
		while(itrtnNode != null) {
			if (cnt %2 == 0) { // EVEN NODE :: DO EVEN OPERATIONS
				if (evenHead == null && evenTail == null) {
					evenHead = itrtnNode;
					evenTail = itrtnNode;
				} else {
					evenTail.setNext(itrtnNode);
					evenTail = itrtnNode;
				}
			} else { // ODD NODE :: DO ODD OPERATIONS
				if (oddHead == null && oddTail == null) {
					oddHead = itrtnNode;
					oddTail = itrtnNode;
				} else {
					oddTail.setNext(itrtnNode);
					oddTail = itrtnNode;
				}
			}
			
			itrtnNode = itrtnNode.getNext();
			cnt++;
		}
		
		evenHead = head;
		evenTail.setNext(oddHead);
		oddTail.setNext(null);
		
	}
}
