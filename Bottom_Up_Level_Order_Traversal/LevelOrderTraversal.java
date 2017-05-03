import java.util.*;

public class LevelOrderTraversal {
	
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    
        List<List<Integer>> traversed = new ArrayList<List<Integer>>();
        
        if (root == null) return traversed;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        List<Integer> subList;
        
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            subList = new ArrayList<Integer>();
            int numNodesOnLevel = queue.size();
            for (int i=0; i<numNodesOnLevel; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().val);
            }
            traversed.add(0, subList);
        }
        
        return traversed;
        
    }
}