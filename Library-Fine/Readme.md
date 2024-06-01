# _Description_ :-

Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:

1. If the book is returned on or before the expected return date, no fine will be charged (i.e.: `fine = 0`).
2. If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, `fine = 15 Hackos x (the number of day late)`.
3. If the book is returned after the expected return month but still within the same calendar year as the expected return date, the `fine = 500 Hackos x (the number of month late)`.
4. If the book is returned after the calendar year in which it was expected, there is a fixed fine of `10,000 Hackos`.
Charges are based only on the least precise measure of lateness. For example, whether a book is due January 1, 2017 or December 31, 2017, if it is returned January 1, 2018, that is a year late and the fine would be `10,000 Hackos`.

## Example :-
> d1, m1, y1 = 14, 7, 2018
> d2, m2, y2 = 05, 7, 2018
The first values are the return date and the second are the due date. The years are the same and the months are the same. The book is `14 - 5 = 9` days late. Return `9 * 5 = 135'


## Sample Input :-
`9 6 2015`
`6 6 2015`

## Output :-
Sample Input
`45`
