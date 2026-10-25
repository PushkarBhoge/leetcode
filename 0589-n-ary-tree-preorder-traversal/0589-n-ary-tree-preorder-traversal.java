
import java.util.*;

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    private void traverse(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }

        result.add(root.val);

        for (Node child : root.children) {
            traverse(child, result);
        }
    }
}