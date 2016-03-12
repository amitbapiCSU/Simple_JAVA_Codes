/**
 * 
 */
package BST;

/**
 * @author amchakra
 *
 */
public class BinarySearchTree {
	
	private BSTNode root = null;
	private int BSTSize = 0;
	
	public BinarySearchTree() {
		
	}
	
	private void _insertIntoBST(BSTNode node, int val) {
		
		int currentNodeval = node.getNodeData();
		if (val <= currentNodeval) {
			
			if (node.getLeftNode() == null) {
				BSTNode toAddNode = new BSTNode();
				toAddNode.setNodeKey(BSTSize);
				toAddNode.setNodeData(val);
				node.setLeftNode(toAddNode);
			} else {
				_insertIntoBST(node.getLeftNode() ,val);
			}
		} else {
			
			if (node.getRightNode() == null) {
				BSTNode toAddNode = new BSTNode();
				toAddNode.setNodeKey(BSTSize);
				toAddNode.setNodeData(val);
				node.setRightNode(toAddNode);
			} else {
				_insertIntoBST(node.getRightNode() ,val);
			}
		}
		
	}
	
	public BSTNode createBST(int[] iparr) {
		
		for (int elem : iparr) {
			
			if (root == null) {
				root = new BSTNode();
				root.setNodeData(elem);
			} else {
				_insertIntoBST(root, elem);
			}
			BSTSize ++;
		}
		
		return root;
	}
	
	private BSTNode _find(BSTNode rt, int vl) {
		
		BSTNode node = null;
		
		if (rt != null) {
			if (rt.getNodeData() == vl) {
				node = rt;
			} else if (vl <= rt.getNodeData()) {
				return _find(rt.getLeftNode(), vl);
			} else {
				return _find(rt.getRightNode(), vl);
			}
		}
		return node;
		
	}
	
	public BSTNode search(int val) {
		
		BSTNode foundNode = _find(root,val);
		
		return foundNode;
		
	}
	
	public void printInorderTraversal(BSTNode rt) {
		if (rt == null) {
			
			return;
		
		} else {
			printInorderTraversal(rt.getLeftNode());
			System.out.print(rt.getNodeData()+",");
			printInorderTraversal(rt.getRightNode());
			
		}
	}
	
	public void reverseInorderTraversal(BSTNode rt) {
		if (rt == null) {
			
			return;
		
		} else {
			reverseInorderTraversal(rt.getRightNode());
			System.out.print(rt.getNodeData()+",");
			reverseInorderTraversal(rt.getLeftNode());
		}
	}
	
	public void printPreOrderTraversal(BSTNode rt) {
		
		if (rt == null) {
			
			return;
			
		} else {
			
			System.out.print(rt.getNodeData()+",");
			printPreOrderTraversal(rt.getLeftNode());
			printPreOrderTraversal(rt.getRightNode());
			
		}
	}
	
	public void printPostOrderTraversal(BSTNode rt) {
		
		if (rt == null) {
			
			return;
			
		} else {
			
			printPreOrderTraversal(rt.getLeftNode());
			printPreOrderTraversal(rt.getRightNode());
			System.out.print(rt.getNodeData()+",");
			
		}
	}
	
	public LCANode LCA (BSTNode rtelem, int no, int n1) {
		int lfthlfTrgtNds = 0; // leftHalf.getNumofTargetNodes();
		int rgthlfTrgtNds = 0; // rightHalf.getNumofTargetNodes();
		
		if (rtelem == null) {
			return null;
		} else {
			
			LCANode leftHalf = LCA(rtelem.getLeftNode(),no,n1);
			
			if (leftHalf != null) {
				lfthlfTrgtNds = leftHalf.getNumofTargetNodes();
				if (lfthlfTrgtNds == 2) {
					return leftHalf;
				}
			}
			
			LCANode rightHalf = LCA(rtelem.getRightNode(),no,n1);
			
			if (rightHalf != null) {
				rgthlfTrgtNds = rightHalf.getNumofTargetNodes();
				if (rgthlfTrgtNds == 2) {
					return rightHalf;
				}
			}
			
			int numfTrgtdNodes = (lfthlfTrgtNds+rgthlfTrgtNds) + (((rtelem.getNodeData() == no) || (rtelem.getNodeData() == n1)) ? 1 : 0);
			
			return new LCANode(numfTrgtdNodes, rtelem);
			
		}
	}
	
	public BSTNode findLCA(BSTNode rt, int no, int n1) {
		
		int rootData = rt.getNodeData();
		if ((no < rootData) && (n1 > rootData)) {
			return rt;
		} else if ((no == rootData) || (n1 == rootData)) {
			return rt;
		} else if ((no < rootData)) {
			return (LCA(rt.getLeftNode(),no,n1)).getSelf();
		} else {
			return (LCA(rt.getRightNode(),no,n1)).getSelf();
		}
	}
	
	public int numberofNodesinSubTree(BSTNode rt, int depth) {
		
		if (rt == null) {
			return depth;
		} else {
			int leftDepth = numberofNodesinSubTree(rt.getLeftNode(),(depth+1));
			int rightDepth = numberofNodesinSubTree(rt.getRightNode(),(depth+1));
			
			int retDepth = (leftDepth > rightDepth) ? leftDepth : rightDepth;
			
			return retDepth;
		}
	}
	
	public void findKthNodeInOrderTraversal(BSTNode rt, int depth, int K) {
		
		if (rt == null) {
			return;
		} else {
			findKthNodeInOrderTraversal(rt.getLeftNode(), (depth+1), K);
			if (depth == K) {
				System.out.println("NODE at Kth place :: "+rt.getNodeData());
			}
			findKthNodeInOrderTraversal(rt.getRightNode(), (depth+1), K);
		}
		
	}
}
