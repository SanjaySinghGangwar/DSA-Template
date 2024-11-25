package algorithm.questions

import algorithm.LinkedList
import algorithm.ListNode
import algorithm.TreeNode
import org.junit.Assert.*
import org.junit.Test

class TestCase {

    private val twoPointer = TwoPointer()
    private val slidingWindow = SlidingWindow()
    private val binarySearch = BinarySearch()
    private val DFS_BFS = DFS_BFS()
    private val dynamicProgramming = DynamicProgramming()
    private val backtracking = Backtracking()
    private val greedyAlgorithms = GreedyAlgorithms()
    private val graphAlgorithms = GraphAlgorithms()
    private val sortingAndSearching = SortingAndSearching()
    private val unionFind = UnionFind()
    private val topologicalSort = TopologicalSort()
    private val heap_PriorityQueue = Heap_PriorityQueue()
    private val hashing = Hashing()
    private val bitManipulation = BitManipulation()
    private val fastAndSlowPointers = FastAndSlowPointers()
    private val treeTraversals = TreeTraversals()

    // Two Pointers
    @Test
    fun testMergeArrays() {
        val result = twoPointer.mergeArrays(intArrayOf(1, 3, 5), intArrayOf(2, 4, 6))
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6), result)
    }

    @Test
    fun testPalindromeCheck() {
        assertTrue(twoPointer.isPalindrome("racecar"))
        assertFalse(twoPointer.isPalindrome("hello"))
    }

    @Test
    fun testSumPairs() {
        val result = twoPointer.sumPairs(intArrayOf(1, 2, 3, 4, 5), 6)
        assertEquals(listOf(Pair(1, 5), Pair(2, 4)), result)
    }

    @Test
    fun testRemoveDuplicates() {
        val result = twoPointer.removeDuplicates(intArrayOf(1, 2, 2, 3, 4, 4, 5))
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), result)
    }

    // Sliding Window
    @Test
    fun testMaxSumSubarray() {
        val result = slidingWindow.maxSumSubarray(intArrayOf(1, 2, 3, 4, 5), 3)
        assertEquals(12, result)
    }

    @Test
    fun testMinWindowSubstring() {
        val result = slidingWindow.minWindowSubstring("ADOBECODEBANC", "ABC")
        assertEquals("BANC", result)
    }

    @Test
    fun testLongestSubstringWithoutRepeating() {
        val result = slidingWindow.longestSubstringWithoutRepeating("abcabcbb")
        assertEquals(3, result)
    }

    // Binary Search
    @Test
    fun testBinarySearch() {
        val result = binarySearch.binarySearch(intArrayOf(1, 2, 3, 4, 5), 3)
        assertEquals(2, result)
    }

    // Searching in Rotated Sorted Array
    @Test
    fun testSearchInRotatedArray() {
        val result = binarySearch.searchInRotatedArray(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0)
        assertEquals(4, result)
    }

    @Test
    fun testFindPeakElement() {
        val result = binarySearch.findPeakElement(intArrayOf(1, 2, 3, 1))
        assertEquals(2, result)
    }


    @Test
    fun testSearchInRange() {
        val result = binarySearch.searchInRange(intArrayOf(1, 3, 5, 7, 9, 11), 7, 0, 5)
        assertEquals(3, result)
    }

    // DFS & BFS
    @Test
    fun testDFS() {
        val graph = mapOf(1 to listOf(2, 3), 2 to listOf(4), 3 to listOf(5), 4 to emptyList(), 5 to emptyList())
        val result = DFS_BFS.dfs(graph, 1)
        assertEquals(listOf(1, 2, 4, 3, 5), result)
    }

    @Test
    fun testBFS() {
        val graph = mapOf(1 to listOf(2, 3), 2 to listOf(4), 3 to listOf(5), 4 to emptyList(), 5 to emptyList())
        val result = DFS_BFS.bfs(graph, 1)
        assertEquals(listOf(1, 2, 3, 4, 5), result)
    }

    // Maze Navigation
    @Test
    fun testNavigateMaze() {
        val maze = arrayOf(
            intArrayOf(0, 0, 0, 1, 0),
            intArrayOf(0, 1, 0, 1, 0),
            intArrayOf(0, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 1, 0),
            intArrayOf(0, 0, 0, 0, 0)
        )
        val result = DFS_BFS.navigateMaze(maze, 0, 0, 4, 4)
        assertEquals(
            listOf(
                Pair(0, 0),
                Pair(0, 1),
                Pair(0, 2),
                Pair(1, 2),
                Pair(2, 2),
                Pair(3, 2),
                Pair(4, 2),
                Pair(4, 3),
                Pair(4, 4)
            ), result
        )
    }

    // Shortest Path
    @Test
    fun testShortestPath() {
        val grid = arrayOf(
            intArrayOf(0, 0, 0, 1), intArrayOf(0, 1, 0, 0), intArrayOf(0, 0, 0, 0), intArrayOf(0, 1, 1, 0)
        )
        val result = DFS_BFS.shortestPath(grid, 0, 0, 2, 3)
        assertEquals(6, result)
    }

    // Island Counting
    @Test
    fun testCountIslands() {
        val grid = arrayOf(
            intArrayOf(1, 1, 0, 0, 0), intArrayOf(1, 1, 0, 0, 0), intArrayOf(0, 0, 1, 0, 0), intArrayOf(0, 0, 0, 1, 1)
        )
        val result = DFS_BFS.countIslands(grid)
        assertEquals(3, result)
    }

    // Dynamic Programming
    @Test
    fun testFibonacci() {
        assertEquals(8, dynamicProgramming.fibonacci(6))
    }

    @Test
    fun testKnapsack() {
        val result = dynamicProgramming.knapsack(intArrayOf(2, 3, 4, 5), intArrayOf(3, 4, 5, 6), 5)
        assertEquals(7, result)
    }

    @Test
    fun testLongestCommonSubsequence() {
        val result = dynamicProgramming.longestCommonSubsequence("abcde", "ace")
        assertEquals(3, result)
    }

    @Test
    fun testCoinChange() {
        val result = dynamicProgramming.coinChange(intArrayOf(1, 2, 5), 11)
        assertEquals(3, result)
    }

    // Backtracking
    @Test
    fun testSolveNQueens() {
        val result = backtracking.solveNQueens(4)
        assertEquals(2, result.size)
    }

    @Test
    fun testSolveSudoku() {
        val board = arrayOf(
            charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
            charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            charArrayOf('4', '.', '9', '8', '.', '3', '.', '.', '1'),
            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
        )
        assertTrue(backtracking.solveSudoku(board))
    }

    // Greedy Algorithms
    @Test
    fun testActivitySelection() {
        val result = greedyAlgorithms.activitySelection(intArrayOf(1, 3, 0, 5, 8), intArrayOf(2, 4, 6, 7, 9))
        assertEquals(listOf(0, 1, 3), result)
    }

    @Test
    fun testMinimumCoins() {
        val result = greedyAlgorithms.minimumCoins(intArrayOf(1, 2, 5), 11)
        assertEquals(3, result)
    }

    @Test
    fun testIntervalScheduling() {
        val result = greedyAlgorithms.intervalScheduling(arrayOf(intArrayOf(1, 3), intArrayOf(2, 4), intArrayOf(3, 5)))
        assertEquals(listOf(intArrayOf(1, 3), intArrayOf(3, 5)), result)
    }

    @Test
    fun testFractionalKnapsack() {
        val result = greedyAlgorithms.fractionalKnapsack(intArrayOf(60, 100, 120), intArrayOf(10, 20, 30), 50)
        assertEquals(240.0, result, 0.0)
    }

    // Graph Algorithms
    @Test
    fun testCycleDetectionGraph() {
        val graph = mapOf(1 to listOf(2), 2 to listOf(3), 3 to listOf(1))
        assertTrue(graphAlgorithms.cycleDetection(graph))
    }

    @Test
    fun testConnectedComponentsGraph() {
        val graph = mapOf(1 to listOf(2), 2 to listOf(3), 4 to listOf(5))
        assertEquals(2, graphAlgorithms.connectedComponents(graph))
    }

    @Test
    fun testShortestPathDijkstra() {
        val graph = mapOf(
            0 to listOf(Pair(1, 1), Pair(2, 4)),
            1 to listOf(Pair(2, 2), Pair(3, 5)),
            2 to listOf(Pair(3, 1)),
            3 to emptyList()
        )

        val distances = graphAlgorithms.dijkstra(graph, 0)
        assertEquals(3, distances[3]) // Shortest distance from node 0 to node 3 is 3
    }

    // Sorting and Searching
    @Test
    fun testMergeSort() {
        val result = sortingAndSearching.mergeSort(intArrayOf(5, 2, 9, 1, 5, 6))
        assertArrayEquals(intArrayOf(1, 2, 5, 5, 6, 9), result)
    }

    @Test
    fun testQuickSort() {
        val result = sortingAndSearching.quickSort(intArrayOf(5, 2, 9, 1, 5, 6))
        assertArrayEquals(intArrayOf(1, 2, 5, 5, 6, 9), result)
    }

    @Test
    fun testCountingInversions() {
        val result = sortingAndSearching.countingInversions(intArrayOf(5, 2, 9, 1, 5, 6))
        assertEquals(6, result)
    }


    // Bit Manipulation
    @Test
    fun testSingleNumber() {
        val result = bitManipulation.findSingleNumber(intArrayOf(2, 2, 1))
        assertEquals(1, result)
    }

    @Test
    fun testBitwiseAndOr() {
        val result = bitManipulation.bitwiseAndOr(intArrayOf(1, 2, 3, 4))
        assertEquals(0, result)
    }

    @Test
    fun testCountSetBits() {
        val result = bitManipulation.countSetBits(15)
        assertEquals(4, result)
    }

    @Test
    fun testPreorderTraversal() {
        val root = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3).apply {
                left = TreeNode(4)
                right = TreeNode(5)
            }
        }
        val result = treeTraversals.preorderTraversal(root)
        assertEquals(listOf(1, 2, 3, 4, 5), result)
    }

    @Test
    fun testInorderTraversal() {
        val root = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3).apply {
                left = TreeNode(4)
                right = TreeNode(5)
            }
        }
        val result = treeTraversals.inorderTraversal(root)
        assertEquals(listOf(2, 1, 4, 3, 5), result)
    }

    @Test
    fun testPostorderTraversal() {
        val root = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3).apply {
                left = TreeNode(4)
                right = TreeNode(5)
            }
        }
        val result = treeTraversals.postorderTraversal(root)
        assertEquals(listOf(2, 4, 5, 3, 1), result)
    }

    @Test
    fun testFindLowestCommonAncestor() {
        val root = TreeNode(3).apply {
            left = TreeNode(5).apply {
                left = TreeNode(6)
                right = TreeNode(2).apply {
                    left = TreeNode(7)
                    right = TreeNode(4)
                }
            }
            right = TreeNode(1).apply {
                left = TreeNode(0)
                right = TreeNode(8)
            }
        }
        val p = root.left?.left  // Node 6
        val q = root.left?.right?.right  // Node 4
        val lca = treeTraversals.findLowestCommonAncestor(root, p, q)
        assertEquals(5, lca?.`val`)
    }

    @Test
    fun testBinaryTreePaths() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                right = TreeNode(5)
            }
            right = TreeNode(3)
        }
        val result = treeTraversals.binaryTreePaths(root)
        assertEquals(listOf("1->2->5", "1->3"), result)
    }

    // Hashing
    @Test
    fun testAnagrams() {
        val strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
        val result = hashing.anagrams(strs)
        assertEquals(listOf(listOf("eat", "tea", "ate"), listOf("tan", "nat"), listOf("bat")), result)
    }

    @Test
    fun testTwoSum() {
        val result = hashing.twoSum(intArrayOf(2, 7, 11, 15), 9)
        assertEquals(listOf(0, 1), result)
    }

    @Test
    fun testGroupElementsByFrequency() {
        val result = hashing.groupElementsByFrequency(intArrayOf(1, 1, 2, 2, 3, 3, 3))
        assertEquals(mapOf(1 to 2, 2 to 2, 3 to 3), result)
    }

    @Test
    fun testLongestConsecutiveSequence() {
        val result = hashing.longestConsecutiveSequence(intArrayOf(100, 4, 200, 1, 3, 2))
        assertEquals(4, result)
    }

    // Heap/Priority Queue
    @Test
    fun testKthLargestElement() {
        val result = heap_PriorityQueue.kthLargestElement(intArrayOf(3, 2, 1, 5, 6, 4), 2)
        assertEquals(5, result)
    }

    @Test
    fun testMedianInStream() {
        val result = heap_PriorityQueue.medianInStream(intArrayOf(1, 2, 3, 4, 5))
        assertEquals(3.0, result)
    }

    @Test
    fun testMergeKSortedLists() {
        val list1 = ListNode(1).apply { next = ListNode(4).apply { next = ListNode(5) } }
        val list2 = ListNode(1).apply { next = ListNode(3).apply { next = ListNode(4) } }
        val list3 = ListNode(2).apply { next = ListNode(6) }
        val result = heap_PriorityQueue.mergeKSortedLists(listOf(list1, list2, list3))
        val expected = ListNode(1).apply {
            next = ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3).apply {
                        next = ListNode(4).apply {
                            next = ListNode(4).apply {
                                next = ListNode(5).apply {
                                    next = ListNode(6)
                                }
                            }
                        }
                    }
                }
            }
        }
        assertEquals(expected, result)
    }

    @Test
    fun testScheduleTasks() {
        val result = heap_PriorityQueue.scheduleTasks(listOf("Task1", "Task2", "Task3"), listOf(3, 1, 2))
        assertEquals(listOf("Task2", "Task3", "Task1"), result)
    }

    // Topological Sort
    @Test
    fun testCourseSchedule() {
        val result = topologicalSort.courseSchedule(2, arrayOf(intArrayOf(1, 0)))
        assertTrue(result)
    }

    @Test
    fun testProjectBuildOrder() {
        val result = topologicalSort.projectBuildOrder(4, arrayOf(intArrayOf(2, 0), intArrayOf(2, 1), intArrayOf(3, 1)))
        assertEquals(listOf(0, 1, 2, 3), result)
    }

    @Test
    fun testStockSellingBuying() {
        val result = topologicalSort.stockSellingBuying(intArrayOf(7, 1, 5, 3, 6, 4))
        assertEquals(5, result)
    }

    @Test
    fun testCycleDetectionInGraphs() {
        val parent = IntArray(5) { it }
        parent[1] = 0 // Union(0, 1)
        parent[2] = 1 // Union(1, 2)
        parent[4] = 3 // Union(3, 4)

        assertFalse(unionFind.cycleDetectionInGraphs(parent)) // No cycle exists
    }

    @Test
    fun testConnectedComponentsInGraphs() {
        val parent = IntArray(5) { it }
        parent[1] = 0 // Union(0, 1)
        parent[2] = 1 // Union(1, 2)
        parent[4] = 3 // Union(3, 4)

        val expected = listOf(
            listOf(0, 1, 2),
            listOf(3, 4)
        )
        assertEquals(expected, unionFind.connectedComponentsInGraphs(parent))
    }

    @Test
    fun testSocialNetworkConnectivity() {
        val parent = IntArray(5) { it }
        parent[1] = 0 // Union(0, 1)
        parent[2] = 1 // Union(1, 2)
        parent[4] = 3 // Union(3, 4)

        assertFalse(unionFind.socialNetworkConnectivity(parent)) // Not all nodes are connected
    }

    @Test
    fun testCycleDetectionInLinkedList() {
        val list = LinkedList() // Create a linked list
        list.append(1)
        list.append(2)
        list.append(3)
        list.append(4)

        // Create a cycle: last node points to the second node
        list.head?.next?.next?.next?.next = list.head?.next

        assertTrue(fastAndSlowPointers.cycleDetectionInLinkedList(list.head)) // Expected: true (cycle exists)
    }

    @Test
    fun testPalindromeInLinkedList() {
        val list = LinkedList()
        list.append(1)
        list.append(2)
        list.append(2)
        list.append(1)

        assertTrue(fastAndSlowPointers.palindromeInLinkedList(list.head)) // Expected: true (is a palindrome)

        val nonPalindromeList = LinkedList()
        nonPalindromeList.append(1)
        nonPalindromeList.append(2)
        nonPalindromeList.append(3)

        assertFalse(fastAndSlowPointers.palindromeInLinkedList(nonPalindromeList.head)) // Expected: false (not a palindrome)
    }

    @Test
    fun testFindMiddleOfLinkedList() {
        val list = LinkedList()
        list.append(1)
        list.append(2)
        list.append(3)
        list.append(4)
        list.append(5)

        val middleNode = fastAndSlowPointers.findMiddleOfLinkedList(list.head)
        assertEquals(3, middleNode?.`val`) // Expected: 3 (middle of the list)

        val evenList = LinkedList()
        evenList.append(1)
        evenList.append(2)
        evenList.append(3)
        evenList.append(4)

        val evenMiddleNode = fastAndSlowPointers.findMiddleOfLinkedList(evenList.head)
        assertEquals(3, evenMiddleNode?.`val`) // Expected: 3 (middle is the second of the two middle nodes)
    }
}