package Solution.tree.vertical

import Solution.tree.TreeNode

fun main(args: Array<String>) {

}

fun verticalTraversal(root:TreeNode):List<List<Int>>?{
    return null;
}

fun frontTraversal(root: TreeNode?){
    if (root==null){
        return
    }
    print(root.value)
    frontTraversal(root.left)
    frontTraversal(root.right)
}