package ds.hashmap

class HashMap<K, V>(private val initialCapacity: Int = 16) {
    private data class Entry<K, V>(val key: K, var value: V)

    private var table: Array<MutableList<Entry<K, V>>> = Array(initialCapacity) { mutableListOf() }
    private var size = 0

    // Put a key-value pair into the hashmap
    fun put(key: K, value: V) {
        // TODO: Implement the put logic
    }

    // Get the value for a given key
    fun get(key: K): V? {
        // TODO: Implement the get logic
        return null
    }

    // Remove a key-value pair by key
    fun remove(key: K) {
        // TODO: Implement the remove logic
    }

    // Check if the hashmap contains a key
    fun containsKey(key: K): Boolean {
        // TODO: Implement the containsKey logic
        return false
    }

    // Get the current size of the hashmap
    fun getSize(): Int {
        return size
    }

    // Clear the hashmap
    fun clear() {
        // TODO: Implement the clear logic
    }

    // Get all keys in the hashmap
    fun keys(): List<K> {
        // TODO: Implement the keys logic
        return emptyList()
    }

    // Get all values in the hashmap
    fun values(): List<V> {
        // TODO: Implement the values logic
        return emptyList()
    }

    // Display the hashmap
    fun display() {
        // TODO: Implement the display logic
    }

    // Rehash the hashmap if the load factor exceeds a certain threshold
    private fun rehash() {
        // TODO: Implement the rehashing logic
    }

    // DSA Practice Questions

    // 1. Check for duplicates in an array using a hashmap.
    // TODO: Implement logic to check if there are duplicates in an array.

    // 2. Count the frequency of elements in an array using a hashmap.
    // TODO: Implement logic to count the frequency of each element.

    // 3. Find the first non-repeating character in a string using a hashmap.
    // TODO: Implement logic to find the first non-repeating character in a string.

    // 4. Group anagrams from a list of strings using a hashmap.
    // TODO: Implement logic to group anagrams together.

    // 5. Find all pairs in an array that sum up to a specific target using a hashmap.
    // TODO: Implement logic to find pairs that sum up to a target value.

    // 6. Implement a LRU Cache using a hashmap and a doubly linked list.
    // TODO: Implement the LRU Cache logic.

    // 7. Given two strings, check if one is a permutation of the other using a hashmap.
    // TODO: Implement logic to check if one string is a permutation of another.

    // 8. Find all subarrays with a sum equal to zero using a hashmap.
    // TODO: Implement logic to find subarrays with a sum equal to zero.

    // 9. Find the longest substring without repeating characters using a hashmap.
    // TODO: Implement logic to find the longest substring without repeating characters.

    // 10. Find the intersection of two arrays using a hashmap.
    // TODO: Implement logic to find the intersection of two arrays.

    // 11. Find the maximum length of a substring with at most two distinct characters.
    // TODO: Implement logic to find the maximum length substring with at most two distinct characters.

    // 12. Check if two strings are anagrams of each other using a hashmap.
    // TODO: Implement logic to check if two strings are anagrams.

    // 13. Count the number of occurrences of each character in a string.
    // TODO: Implement logic to count character occurrences.

    // 14. Find the minimum window substring that contains all characters of another string.
    // TODO: Implement logic to find the minimum window substring.

    // 15. Check if a subarray with a given sum exists in an array.
    // TODO: Implement logic to check for the existence of a subarray with a specific sum.

    // 16. Find the longest palindromic substring using a hashmap.
    // TODO: Implement logic to find the longest palindromic substring.

    // 17. Count how many times each word appears in a document.
    // TODO: Implement logic to count word occurrences.

    // 18. Given a list of integers, find if there exist any three numbers which add up to zero.
    // TODO: Implement logic to find three numbers that sum to zero.

    // 19. Determine if two arrays have the same frequency of elements.
    // TODO: Implement logic to check if two arrays have the same frequency of elements.

    // 20. Find the maximum sum of a subarray of size k using a hashmap.
    // TODO: Implement logic to find the maximum sum of a subarray of size k.
}

fun main() {
    // Example usage of HashMap class
    val hashMap = HashMap<String, Int>()

    // TODO: Add example usage of the methods
}
