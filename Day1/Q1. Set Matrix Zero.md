
## LeetCode 73. Set Matrix Zeroes ##

Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

Example 1:

![image](https://user-images.githubusercontent.com/46243069/174295264-0de10434-ea18-46b9-b398-c5b3545b7530.png)

Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]

Output: [[1,0,1],[0,0,0],[1,0,1]]

Example 2:

![image](https://user-images.githubusercontent.com/46243069/174295444-dee945b0-14f2-4149-afa9-3f906ca3652b.png)

Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]

Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 

### Solution 1 : Bruteforce Approach ###

i rows & j cols ;  has all values positive ;

1.Traverse the Array and wherever there is a Zero make corresponding row and col -1 {traverse the corresponding row and col to make it -1} ; NOTE: donot change 0 to -1

2.now again Traverse and make all -1 as 0

TimeComplexity : 
Traversing a matrix to find 0's  ---------------------------- (N x M)

traverse the corresponding row and col to make it -1--------- (N + M)

Traversing a matrix to replace -1 --------------------------- (N x M)

SpaceComplexity : O(1)

### Solution 2 : ###
1.take two index arrays row index and col wherever you find Zero set that as 0

2.Now traverse in the array and check if rowindex or colindex is 0; if yes then make the matrix value as 0

TimeComplexity : Two times linear traversing --> 2(N x M)

SpaceComplexity : O(n) + O(M)

### Solution 3 : ###
instead of taking separate index array use the first row and first column for the purpose

Tricky Part is the [0][0] index. its overlapping one so make use of a boolean variable ==> col0 is 1 by default

1.Traverse the array and check if any value in first col is zero; if yes make col0 as 0

2.now from second row if a[i][j] is zero then make the corresponding 1strow 1st col valur as 0

3.traverse from i=1 & j=1 ; I=j=0 is special case, 

4.if either row or col index is 0 make the value 0 (if(matrix[i][0] == 0 || matrix[0][j] == 0)then matrix[i][j]=0;)

**Special Case**

5.check if 0,0 is zero, if yes matlab originally 0,0 pe zero tha so we should make the whole row 0

6.check if col0 is toggled, if yes there was some row i of first column jo 0 tha so we need to make whole first column 0

TimeComplexity : Two times linear traversing --> 2(N x M)

SpaceComplexity : O(1)








