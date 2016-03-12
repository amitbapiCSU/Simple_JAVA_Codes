/**
 * 
 */
package BST;

/**
 * @author amit
 *
 */
public class LCANode {

	private int numftargetNodes = 0;
	private BSTNode self = null;
	
	public LCANode (int numftargetNodes, BSTNode self) {
		this.numftargetNodes = numftargetNodes;
		this.self = self;
	}
	
	public int getNumofTargetNodes() {
		return this.numftargetNodes;
	}
	
	public BSTNode getSelf() {
		return this.self;
	}
}
