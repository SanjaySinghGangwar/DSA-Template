package algorithm

// Definition for singly-linked list.
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

// Definition for a binary tree node.
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class LinkedList {
    var head: ListNode? = null

    // Constructor to initialize with a list of values
    constructor(values: List<Int>) {
        for (value in values) {
            append(value)
        }
    }

    constructor()

    // Append a value to the end of the list
    fun append(value: Int) {
        val newNode = ListNode(value)
        if (head == null) {
            head = newNode
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newNode
        }
    }

    // Display the list (useful for debugging)
    fun display(): String {
        val values = mutableListOf<Int>()
        var current = head
        while (current != null) {
            values.add(current.`val`)
            current = current.next
        }
        return values.joinToString(" -> ")
    }
}

