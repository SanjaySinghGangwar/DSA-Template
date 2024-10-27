package ds.list

class CustomList {
    private var elements: IntArray = IntArray(10) // Initial capacity
    private var size: Int = 0

    // Add an element to the list
    fun add(value: Int) {
        // TODO: Implement the add logic
        // Question: What should happen if the internal array is full?
    }

    // Add an element at a specific index
    fun addAt(index: Int, value: Int) {
        // TODO: Implement the addAt logic
        // Question: How do you handle cases where the index is out of bounds?
    }

    // Remove an element by value
    fun remove(value: Int): Boolean {
        // TODO: Implement the remove logic
        // Question: What should the function return if the value is not found?
        return false
    }

    // Remove an element at a specific index
    fun removeAt(index: Int): Int? {
        // TODO: Implement the removeAt logic
        // Question: How should you handle cases where the index is invalid?
        return null
    }

    // Get the element at a specific index
    fun get(index: Int): Int? {
        // TODO: Implement the get logic
        // Question: How should the function behave if the index is out of bounds?
        return null
    }

    // Find the index of a specific element
    fun indexOf(value: Int): Int {
        // TODO: Implement the indexOf logic
        // Question: What should the function return if the element is not found?
        return -1
    }

    // Check if the list contains an element
    fun contains(value: Int): Boolean {
        // TODO: Implement the contains logic
        // Question: Is it possible to optimize the search operation?
        return false
    }

    // Get the current size of the list
    fun getSize(): Int {
        return size
    }

    // Check if the list is empty
    fun isEmpty(): Boolean {
        // TODO: Implement the isEmpty logic
        // Question: Can this be determined using the size property?
        return size == 0
    }

    // Clear all elements from the list
    fun clear() {
        // TODO: Implement the clear logic
        // Question: What is the most efficient way to reset the list?
    }

    // Resize the internal array when it reaches capacity
    private fun resize() {
        // TODO: Implement the resize logic
        // Question: How much should you increase the size by each time?
    }

    // Convert the list to a formatted string for display
    override fun toString(): String {
        val displayList = mutableListOf<Int>()
        for (i in 0 until size) {
            displayList.add(elements[i])
        }
        return displayList.toString()
    }

    // Reverse the list
    fun reverse() {
        // TODO: Implement the reverse logic
        // Question: How can you swap elements without needing extra space?
    }

    // Sort the list in ascending order
    fun sort() {
        // TODO: Implement the sort logic
        // Question: Which sorting algorithm is most efficient here?
    }

    // Get the maximum element in the list
    fun maxElement(): Int? {
        // TODO: Implement the maxElement logic
        // Question: How can you optimize finding the max value?
        return null
    }

    // Get the minimum element in the list
    fun minElement(): Int? {
        // TODO: Implement the minElement logic
        // Question: What should be returned if the list is empty?
        return null
    }

    // Rotate the list to the right by k steps
    fun rotateRight(k: Int) {
        // TODO: Implement the rotateRight logic
        // Question: What edge cases do you need to handle for rotation?
    }
}

fun main() {
    val customList = CustomList()

    // Example usage of CustomList methods
    customList.add(5)
    customList.add(3)
    customList.add(8)
    customList.addAt(1, 10)

    println("List after adding elements: $customList")

    println("Element at index 2: ${customList.get(2)}")
    println("Index of element 10: ${customList.indexOf(10)}")

    customList.remove(3)
    println("List after removing element 3: $customList")

    customList.reverse()
    println("List after reversing: $customList")

    customList.sort()
    println("List after sorting: $customList")

    println("Max element: ${customList.maxElement()}")
    println("Min element: ${customList.minElement()}")

    customList.rotateRight(2)
    println("List after rotating right by 2: $customList")
}
