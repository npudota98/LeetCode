# LeetCode Solutions

A collection of my solutions to [LeetCode](https://leetcode.com) problems, organized by topic. Each solution includes the approach, time/space complexity, and notes on trade-offs where relevant.

## Structure

```
.
├── arrays/
├── strings/
├── hashmaps/
├── two-pointers/
├── sliding-window/
├── linked-lists/
├── trees/
├── graphs/
├── dynamic-programming/
├── heaps/
├── sorting/
└── backtracking/
```

Each problem lives in its own file, named after the problem (e.g. `TopKFrequentElements.java`), with the LeetCode problem number and title in a comment at the top.

## Format

Every solution follows this template:

```java
/**
 * LeetCode 347 - Top K Frequent Elements
 * https://leetcode.com/problems/top-k-frequent-elements/
 *
 * Approach: Bucket sort by frequency
 * Time: O(n)
 * Space: O(n)
 */
public int[] topKFrequent(int[] nums, int k) {
    // solution
}
```

## Conventions

- **Language:** Java
- Solutions favor optimal time/space complexity first, readability second.
- Brute-force approaches are occasionally included alongside the optimal one for comparison, clearly labeled.
- Each file is self-contained and can be dropped directly into LeetCode's editor.

## License

MIT — feel free to use these as a reference, but try solving problems yourself first!