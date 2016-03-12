/**
 * 
 */
package BST;

/**
 * @author amchakra
 *
 */
public class BSTNode {
	
	private int key = 0;
	private int data = 0;
	private BSTNode leftNode = null;
	private BSTNode rightNode = null;
	
	public BSTNode() {
	}
	
	public void setNodeKey(int k) {
		this.key = k;
	}
	public int getNodeKey() {
		return this.key;
	}
	
	public void setNodeData(int d) {
		this.data = d;
	}
	public int getNodeData() {
		return this.data;
	}
	
	public void setLeftNode(BSTNode nl) {
		this.leftNode = nl;
	}
	public BSTNode getLeftNode() {
		return this.leftNode;
	}
	
	public void setRightNode(BSTNode nr) {
		this.rightNode = nr;
	}
	public BSTNode getRightNode() {
		return this.rightNode;
	}
}
