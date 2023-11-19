# Designer PDF Viewer Problem :-

## *Description*: 
* When a contiguous block of text is selected in a PDF viewer, the selection is highlighted with a blue rectangle. In this PDF viewer, each word is highlighted independently. For example:
`"abc" "def" "ghi"`

* There is a list of `26` character heights aligned by index to their letters. For example, `'a'` is at index `0` and `'z'` is at index `25`. There will also be a string. Using the letter heights given, determine the area of the rectangle highlight in *`mm^2`* assuming all letters are `1mm` wide.
#### Example
high = [1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5]

word = 'zaba'
- The highest is `z` (ASCII) `z = 7` and there 4 letters (width = 4), so `3 * 4 = 12` 
