/**
 * 
 */
package LinkedList;

/**
 * @author amit
 *
 */
public class Node {
	private int data;
	private Node next;
	
	public Node() {
//		this.next=null;
	}
	
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	public void setData(int d) {
		this.data = d;
	}
	public int getData() {
		return this.data;
	}
	
	public void setNext(Node n) {
		this.next = n;
	}
	public Node getNext(){
		return this.next;
	}
	
}
