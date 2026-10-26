
import java.util.*;

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    private void traverse(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }

        for (Node child : root.children) {
            traverse(child, result);
        }

        result.add(root.val);
    }
}