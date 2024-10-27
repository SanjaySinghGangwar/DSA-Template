package ds.set

class CustomSet {
    private val bucketArray: Array<MutableList<Int>?> = arrayOfNulls(16)
    private var size: Int = 0

    init {
        for (i in bucketArray.indices) {
            bucketArray[i] = mutableListOf()
        }
    }

    private fun hash(key: Int): Int {
        return key.hashCode() % bucketArray.size
    }

    // Add an element to the set
    fun add(value: Int) {
        // TODO: Implement the add logic
        // Question: What should happen if the value already exists in the set?
    }

    // Remove an element from the set
    fun remove(value: Int) {
        // TODO: Implement the remove logic
        // Question: How should you handle the case when the value is not found in the set?
    }

    // Check if the set contains an element
    fun contains(value: Int): Boolean {
        // TODO: Implement the contains logic
        // Question: How can you optimize the lookup time for the contains operation?
        return false
    }

    // Get the current size of the set
    fun getSize(): Int {
        // TODO: Implement the getSize logic
        // Question: Should the size be updated when an element is added or removed?
        return size
    }

    // Check if the set is empty
    fun isEmpty(): Boolean {
        // TODO: Implement the isEmpty logic
        // Question: Can you use the size property to determine if the set is empty?
        return size == 0
    }

    // Clear all elements from the set
    fun clear() {
        // TODO: Implement the clear logic
        // Question: What is the most efficient way to clear all elements from the set?
    }

    // Get all elements in the set as a list
    fun toList(): List<Int> {
        // TODO: Implement the toList logic
        // Question: How do you ensure that the returned list does not contain duplicates?
        return emptyList()
    }

    // Union of this set and another set
    fun union(other: CustomSet): CustomSet {
        // TODO: Implement the union logic
        // Question: What is the time complexity of this operation?
        return CustomSet()
    }

    // Intersection of this set and another set
    fun intersection(other: CustomSet): CustomSet {
        // TODO: Implement the intersection logic
        // Question: How can you avoid checking each element multiple times?
        return CustomSet()
    }

    // Difference of this set and another set
    fun difference(other: CustomSet): CustomSet {
        // TODO: Implement the difference logic
        // Question: What will happen if the other set is empty?
        return CustomSet()
    }

    // Display the set
    override fun toString(): String {
        val elements = mutableListOf<Int>()
        for (bucket in bucketArray) {
            if (bucket != null) {
                elements.addAll(bucket)
            }
        }
        return elements.toString()
    }
}

fun main() {
    val setA = CustomSet()
    val setB = CustomSet()

    // Sample operations to test CustomSet
    setA.add(1)
    setA.add(2)
    setA.add(3)
    setB.add(3)
    setB.add(4)
    setB.add(5)

    println("Set A: $setA")
    println("Set B: $setB")

    // Check if sets contain specific elements
    println("Set A contains 2? ${setA.contains(2)}")
    println("Set B contains 6? ${setB.contains(6)}")

    // Remove an element from setA
    setA.remove(2)
    println("Set A after removing 2: $setA")

    // Union, intersection, and difference
    val unionSet = setA.union(setB)
    println("Union of Set A and Set B: $unionSet")

    val intersectionSet = setA.intersection(setB)
    println("Intersection of Set A and Set B: $intersectionSet")

    val differenceSet = setA.difference(setB)
    println("Difference of Set A and Set B: $differenceSet")
}
