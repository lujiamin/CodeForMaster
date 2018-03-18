## Coding For Master And Offer  
### leetcode  
| number | title |  
| - | - |  
| 001 | [Two Sum](src/com/leetcode/TwoSum.java) |
| 002 | [Add Two Numbers](src/com/leetcode/AddTwoNumbers.java) |
| 003 | [Longest Substring Without Repeating Characters](src/com/leetcode/LongestSubstringWithoutRepeatingCharacters.java) |
| 004 | [Median of Two Sorted Arrays](src/com/leetcode/MedianOfTwoSortedArrays.java) |
| 005 | [Longest Palindromic Substring](src/com/leetcode/LongestPalindromicSubstring.java) |  
| 006 | [ZigZag Conversion](src/com/leetcode/ZigZagConversion.java) |  
| 007 | [Reverse Integer](src/com/leetcode/ReverseInteger.java) |  
| 009 | [Palindrome Number](src/com/leetcode/PalindromeNumber.java) |  
| 011 | [Container  With Most Water](src/com/leetcode/ContainerWithMostWater.java) |  
| 012 | [Integer to Roman](src/com/leetcode/IntegerToRoman.java) |
| 013 | [Roman to Integer](src/com/leetcode/RomanToInteger.java) |  
| 014 | [Longest Common Prefix](src/com/leetcode/LongestCommonPrefix.java) |  
| 015 | [Three Sum](src/com/leetcode/ThreeSum.java) |
| 017 | [Letter Combinations of A Phone Number](src/com/leetcode/LetterCombinationsOfAPhoneNumber.java) |
| 019 | [Remove Nth Node From End of List](src/com/leetcode/RemoveNthNodeFromEndOfList.java) |  
| 020 | [Valid Parentheses](src/com/leetcode/ValidParentheses.java) |  
| 021 | [Merge Two Sorted Lists](src/com/leetcode/MergeTwoSortedLists.java) |  
| 022 | [Generate Parentheses](src/com/leetcode/GenerateParentheses.java) |  
| 026 | [Remove Duplicates from Sorted Array](src/com/leetcode/RemoveDuplicatesFromSortedArray.java) | 
| 027 | [Remove Element](src/com/leetcode/RemoveElement.java) |  
| 031 | [Next Permutation](src/com/leetcode/NextPermutation.java) |  
| 033 | [Search in Rotated Sorted Array](src/com/leetcode/SearchInRotatedSortedArray.java) |  
| 034 | [Search for a Range](src/com/leetcode/SearchForARange.java) |  
| 035 | [Search Insert Position](src/com/leetcode/SearchInsertPosition.java) |
| 039 | [Combination Sum](src/com/leetcode/CombinationSum.java````) |
| 043 | [Multiply Strings](src/com/leetcode/MultiplyStrings.java) |
| 053 | [Maximum Subarray](src/com/leetcode/MaximumSubArray.java) |  
| 058 | [Length of Last Word](src/com/leetcode/LengthOfLastWord.java) |
| 062 | [Unique Paths](src/com/leetcode/UniquePaths.java) |  
| 063 | [Unique Paths II](src/com/leetcode/UniquePathsII.java) |  
| 064 | [Minimum Path Sum](src/com/leetcode/MinimumPathSum.java) |  
| 066 | [Plus One](src/com/leetcode/PlusOne.java) |  
| 067 | [Add Binary](src/com/leetcode/AddBinary.java) |
| 070 | [Climbing Stairs](src/com/leetcode/ClimbingStairs.java) |  
| 072 | [Edit Distance](src/com/leetcode/EditDistance.java) |
| 088 | [Merge Sorted Array](src/com/leetcode/MergeSortedArray.java) |  
| 093 | [Restore IP Addresses](src/com/leetcode/RestoreIPAddresses.java) |
| 096 | [Unique Binary Search Trees](src/com/leetcode/UniqueBinarySearchTrees.java) |  
| 100 | [Same Tree](src/com/leetcode/SameTree.java) |
| 105 | [Construct Binary Tree from Preorder and Inorder Traversal](src/com/leetcode/ConstructBinaryTreefromPreorderandInorderTraversal.java) |
| 115 | [Distinct Subsequences](src/com/leetcode/DistinctSubsequences.java) |
| 118 | [Pascal's Triangle](src/com/leetcode/PascalTriangle.java) |
| 119 | [Pascal's Triangle II](src/com/leetcode/PascalTriangleII.java) |  
| 120 | [Triangle](src/com/leetcode/Triangle.java) |  
| 121 | [Best Time to Buy and Sell Stock](src/com/leetcode/BestTimeToBuyAndSellStock.java) |  
| 122 | [Best Time to Buy and Sell Stock II](src/com/leetcode/BestTimeToBuyAndSellStockII.java) |  
| 125 | [ValidPalindrome](src/com/leetcode/ValidPalindrome.java)|
| 128 | [Longest Consecutive Sequence](src/com/leetcode/LongestConsecutive.java) |
| 139 | [Word Break](src/com/leetcode/WordBreak.java) |
| 167 | [Two Sum II - Input array is sorted](src/com/leetcode/TwoSumII.java) |  
| 169 | [Majority Element](src/com/leetcode/MajorityElement.java) |  
| 189 | [Rotate Array](src/com/leetcode/RotateArray.java) |  
| 217 | [Contains Duplicate](src/com/leetcode/ContainsDuplicate.java) |  
| 219 | [Contains Duplicate II](src/com/leetcode/ContainsDuplicateII.java) |  
| 231 | [Pow of Two](src/com/leetcode/PowerOfTwo.java) |
| 258 | [Add Digits](src/com/leetcode/AddDigits.java) |
| 322 | [Coin Change](src/com/leetcode/CoinChange.java) |
| 338 | [Counting Bits](src/com/leetcode/CountingBits.java) |  
| 413 | [Arithmetic Slices](src/com/leetcode/ArithmeticSlices.java) |
| 687 | [Longest Univalue Path]() |
| 746 | [Min Cost Climbing Stairs](src/com/leetcode/MinCostClimbingStairs.java) |  


### 常见题型总结
#### 动态规划
- 最长公共子串
```java
// 子串必须连续
public class LongestSubstring {
    public int findLongest(String A, int n, String B, int m) {
        int dp[][] = new int[n + 1][m + 1];
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                if (ans < dp[i][j]) {
                    ans = dp[i][j];
                }
            }
        }
        return ans;
    }
}
```
- 最长公共子序列
```java
// 子序列不必连续
public class LongestSequence {
    public int findLCS(String A, int n, String B, int m) {
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[n][m];
    }
}
```
- [爬楼梯](src/com/leetcode/ClimbingStairs.java)
```java
// 每次只能爬一阶或两阶，问爬上n阶有多少种方法？
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 2];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
```
- [矩形路径数](src/com/leetcode/UniquePaths.java)
```java
// 从矩形左上角到右下角的不同路径数
class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
```
- [编辑步数](src/com/leetcode/EditDistance.java)
```java
// 字符串A经过插入，删除，修改三种操作变为字符串B的步骤数
class Solution {
    public int minDistance(String word1, String word2) {
        if (word1.equals(word2)) {
            return 0;
        }
        if (word1.length() == 0 || word2.length() == 0) {
            return Math.max(word1.length(), word2.length());
        }
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        int i, j;
        // 初始化，有一个单词长度为0时，则需要采取进行另一个单词的长度次操作
        for (i = 0; i <= word1.length(); i++) {
            dp[i][0] = i;
        }
        for (j = 0; j <= word2.length(); j++) {
            dp[0][j] = j;
        }
        for (i = 1; i <= word1.length(); i++) {
            for (j = 1; j <= word2.length(); j++) {
                // 刚好word1[i] == word2[j]时，下标从0开始，但是dp数组从1开始，dp[0][0]表示空串
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                    // 如果不等，可以通过修改或者删除最后一个字符，增加一次操作
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
```
- 找零问题
```java
public class GetMoney {
    public int countWays(int[] changes, int n, int x) {
        //抄袭的代码
        int[] dp = new int[x + 1];
        dp[0] = 1;
        for (int change : changes) {
            for (int i = 0; i + change <= x; i++) {
                dp[i + change] += dp[i];
            }
        }
        return dp[x];
    }
}
```