class NodeTree(var value: Int) {
    var left: NodeTree? = null
    var right: NodeTree? = null
}


class BinarySearchTree {
    var root: NodeTree? = null


    fun isEmpty(): Boolean {
        return root == null
    }


    fun insert(value: Int) {
        val newNode = NodeTree(value)
        if (isEmpty()) {
            root = newNode
        } else {
            insertNode(root, newNode)
        }
    }
    private fun insertNode(root: NodeTree?, newNode: NodeTree) {
        if (newNode.value < root!!.value) {
            if (root.left == null) {
                root.left = newNode
            } else {
                insertNode(root.left, newNode)
            }
        } else {
            if (root.right == null) {
                root.right = newNode
            } else {
                insertNode(root.right, newNode)
            }
        }
    }


    fun search(root: NodeTree?, value: Int): Boolean {
        if (root == null) {
            return false
        }
        if (root.value == value) {
            return true
        } else if (value < root.value) {
            return search(root.left, value)
        } else {
            return search(root.right, value)
        }
    }


    fun min(root: NodeTree?): Int {
        return if (root?.left == null) {
            root!!.value
        } else {
            min(root.left)
        }
    }


    fun max(root: NodeTree?): Int {
        return if (root?.right == null) {
            root!!.value
        } else {
            max(root.right)
        }
    }
    fun delete(value: Int) {
        root = deleteNode(root, value)
    }
    private fun deleteNode(root: NodeTree?, value: Int): NodeTree? {
        if (root == null) {
            return root
        }
        if (value < root.value) {
            root.left = deleteNode(root.left, value)
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value)
        } else {
            if (root.left == null && root.right == null) {
                return null
            }
            if (root.left == null) {
                return root.right
            } else if (root.right == null) {
                return root.left
            }
            root.value = min(root.right)
            root.right = deleteNode(root.right, root.value)
        }
        return root
    }
    fun inOrder(root: NodeTree?) {
        if (root != null) {
            inOrder(root.left)
            println(root.value)
            inOrder(root.right)
        }
    }


    fun preOrder(root: NodeTree?) {
        if (root != null) {
            println(root.value)
            preOrder(root.left)
            preOrder(root.right)
        }
    }
    fun postOrder(root: NodeTree?) {
        if (root != null) {
            postOrder(root.left)
            postOrder(root.right)
            println(root.value)
        }
    }
    fun levelOrder() {
        val queue = mutableListOf<NodeTree?>()
        queue.add(root)
        while (queue.isNotEmpty()) {
            val curr = queue.removeAt(0)
            println(curr?.value)
            if (curr?.left != null) {
                queue.add(curr.left)
            }
            if (curr?.right != null) {
                queue.add(curr.right)
            }
        }
    }


    fun height(node: NodeTree?): Int {
        if (node == null) {
            return 0
        } else {
            val leftHeight = height(node.left)
            val rightHeight = height(node.right)
            return if (leftHeight > rightHeight) leftHeight + 1 else rightHeight + 1
        }
    }


    fun printLevel(node: NodeTree?, level: Int) {
        if (node == null) {
            return
        }
        if (level == 1) {
            println("${node.value} ")
        } else if (level > 1) {
            printLevel(node.left, level - 1)
            printLevel(node.right, level - 1)
        }
    }


    fun isBST(node: NodeTree?, min: Int, max: Int): Boolean {
        if (node == null) {
            return true
        }
        if (node.value < min || node.value > max) {
            return false
        }
        return isBST(node.left, min, node.value) && isBST(node.right, node.value, max)
    }
}


fun main() {
    val bst = BinarySearchTree()
    println(bst.isEmpty())
    bst.insert(10)
    bst.insert(5)
    bst.insert(15)
    bst.insert(3)
    bst.insert(7)
    bst.insert(13)
    bst.insert(17)
    bst.insert(2)
    println(bst.search(bst.root, 10))
    println(bst.search(bst.root, 7))
    bst.inOrder(bst.root)
    bst.preOrder(bst.root)
    bst.postOrder(bst.root)
    bst.levelOrder()
    bst.printLevel(bst.root, 3)
    println(bst.min(bst.root))
    println(bst.max(bst.root))
    println(bst.height(bst.root))
}
