/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.

    public String serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        helperSerialize(root, list);

        // Join the list elements into a comma-separated string
        return String.join(",", list);
    }

    void helperSerialize(TreeNode node, List<String> strings) {
        if (node == null) {
            strings.add("null");
            return;
        }
        strings.add(String.valueOf(node.val));
        helperSerialize(node.left, strings);
        helperSerialize(node.right, strings);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        // Split the comma-separated string into an array
        String[] dataArray = data.split(",");
        // Convert the array to a list for easier manipulation
        List<String> dataList = new ArrayList<>(Arrays.asList(dataArray));

        return helperDeserialize(dataList);
    }

    TreeNode helperDeserialize(List<String> dataList) {
        if (dataList.get(0).equals("null")) {
            // Remove the "null" string and return null
            dataList.remove(0);
            return null;
        }

        // Convert the first element to an integer and remove it from the list
        int val = Integer.parseInt(dataList.remove(0));
        // Create a new TreeNode with the value
        TreeNode node = new TreeNode(val);
        // Recursively build the left and right subtrees
        node.left = helperDeserialize(dataList);
        node.right = helperDeserialize(dataList);

        return node;
    }
}


// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));