package BST;
/**
 * 
 */

/**
 * @author amchakra
 *
 */
public class BST_TestMain {

	/**
	 * @param args
	 */
	
//	public void start(int[] iparr) {
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputarr = new int[] {4,8,1,10,9,0,6,11,17,14,18,12,20}; //  3,8,1,4,6,2,10,9,20,25,15,16
//		new BST_TestMain().start(inputarr);
		BinarySearchTree bst = new BinarySearchTree();
		BSTNode rt = bst.createBST(inputarr);
		
		System.out.println("INORDER TRAVERSAL");
		bst.printInorderTraversal(rt);
//		// 1 2 3 4 6 8 9 10 15 16 20 25
//		
//		System.out.println("\n REVERSE INORDER TRAVERSAL");
//		bst.reverseInorderTraversal(rt);
//		
//		System.out.println("\n POST-ORDER TRAVERSAL");
//		bst.printPostOrderTraversal(rt);
//		System.out.println("\n PRE-ORDER TRAVERSAL");
//		bst.printPreOrderTraversal(rt);
//		
//		System.out.println("\n FIND NODE");
//		BSTNode fndNode = bst.search(10);
//		if (fndNode != null) {
//			System.out.println("NODE FOUND at Index :: "+fndNode.getNodeKey());
//		} else {
//			System.out.println("NODE NOT FOUND");
//		}
		
//		System.out.println("\n FIND LCA");
//		BSTNode foundLca = bst.findLCA(rt,0,8);
//		if (foundLca != null) {
//			System.out.println("LCA :: "+foundLca.getNodeData());
//		} else {
//			System.out.println("NO LCA FOUND");
//		}
		
		System.out.println("\n Length of SubTree");
		int lenSubTree = bst.numberofNodesinSubTree(rt.getRightNode(),0);
		System.out.println("SubTree Length :: "+lenSubTree);
		
		System.out.println("\n Node at Kth Place in INorder traversal");
		bst.findKthNodeInOrderTraversal(rt, 0, 1);
		
	}

}
