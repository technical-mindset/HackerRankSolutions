# _Description_ :-
You are given a number of sticks of varying lengths. You will iteratively cut the sticks into smaller sticks, discarding the shortest pieces until there are none left. At each iteration you will determine the length of the shortest stick remaining, cut that length from each of the longer sticks and then discard all the pieces of that shortest length. When all the remaining sticks are the same length, they cannot be shortened so discard them.

Given the lengths of  sticks, print the number of sticks that are left before each iteration until there are none left.

## Example :-
`arr = [3, 2, 1]`
The shortest stick length is `1`, so cut that length from the longer two and discard the pieces of length `1`. Now the lengths are `arr = [2, 1, 0]`. Again, the shortest stick is of length `1`, so cut that amount from the longer stick and discard those pieces. There is only one stick left, `arr = [1, 0, 0]`, so discard that stick. The number of sticks at each iteration are `answer = arr = [3, 2, 1]`.

## Sample Input :-

    arr[] size n = 6\
    arr = [5, 4, 4, 2, 2, 8]

## Sample Output :-

    6, 4, 2, 1

## Explanation :-

| Sticks Length | Length of Cut | Sticks Cut |
|---------------|---------------|------------|
| 5 4 4 2 2 8   | 2             | 6          |
| 3 2 2 _ _ 6   | 2             | 4          |
| 1 _ _ _ _ 4   | 1             | 2          |
| _ _ _ _ _ 3   | 3             | 1          |
| _ _ _ _ _ _   | DONE          | DONE       |


