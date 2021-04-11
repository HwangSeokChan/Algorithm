[Diagonal Difference](https://www.hackerrank.com/challenges/diagonal-difference/problem?h_r=next-challenge&h_v=zen)

Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

```
1 2 3
4 5 6
9 8 9  
```

The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

|15 - 17| = 2

__Function description__

Complete the _Diagonal Difference_ function in the editor below.

diagonalDifference takes the following parameter:

int arr[n][m]: an array of integers

__Return__

int: the absolute diagonal difference

__Input Format__

The first line contains a single integer , _n_, the number of rows and columns in the square matrix _arr_ .  
Each of the next _n_ lines describes a row, _arr[i]_, and consists of _n_ space-separated integers _arr[i][j]_.

