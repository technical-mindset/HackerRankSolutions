# _Description_ :-
You have two strings of lowercase English letters. You can perform two types of operations on the first string:

1. Append a lowercase English letter to the end of the string.
2. Delete the last character of the string. Performing this operation on an empty string results in an empty string.
Given an integer, `k`, and two strings, `s` and `t`, determine whether or not you can convert `s` to `t` by performing exactly `k` of the above operations on `s`. If it's possible, print Yes. Otherwise, print No.

## Example :-
- > `s = [a, b, c, d]`
- > `t = [e, f, g, h]`
- > `k = 6`

To convert `s` to `t`, we first delete all characters in `4` moves. Next we add each of the characters of `t` in order. On the `8-th` move, you will have the matching string. Return `Yes`.
If there were more moves available, they could have been eliminated by performing multiple deletions on an empty string. If there were fewer than `8` moves, we would not have succeeded in creating the new string.

### Sample Input :-
>`hackerhappy`\
`hackerrank`\
`9`
### Outout :-
>`Yes`