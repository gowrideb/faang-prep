# Time Complexity
- Time complexity is a mathematical function that describes how the number of operations an algorithm performs scales with respect to input size n.
- Time complexity is a mathematical function that describes how the number of operations an algorithm performs scales with input size n, expressed using Big O notation as  the worst-case upper bound — ignoring constants and lower-order terms.
- It matters because at scale, the wrong complexity can turn a 10ms operation into one that takes days. The hierarchy goes from O(1) constant time, through O(log n) logarithmic like binary search, O(n) linear, O(n log n) for optimal sorting, up to O(n²) for nested loops, and O(2ⁿ) for exponential problems.
- To calculate it: I drop constants, drop lower-order terms, add sequential blocks, and multiply nested blocks.
- Beyond Big O, there's also Omega for best case and Theta for average — but in practice we optimize for worst case since that determines real-world system behavior.

# Space Complexity
- The amount of memory (space) an algorithm uses as a function of the input size (n).
- Space complexity describes how much additional memory — specifically auxiliary space — an algorithm requires as input size grows, expressed in Big O notation.
- The key distinction I always make is: total space has two parts — input space and auxiliary space. We measure auxiliary space — the extra memory our algorithm allocates.
- The hierarchy goes from O(1) for in-place algorithms using fixed variables, O(log n) for recursive divide-and-conquer call stacks, O(n) for storing elements in arrays or hashmaps, to O(n²) for 2D DP tables.
- The biggest trap I watch for is recursion — every recursive call adds a stack frame. So recursive Fibonacci has O(2ⁿ) time but only O(n) space because the maximum stack depth at any moment is n.
- And there's always a time-space tradeoff — memoization trades O(n) space for dramatically faster time. My goal is always to find the optimal balance for the given constraints.