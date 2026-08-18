# Java Practice Questions (Easy Level) — 130 Questions

A complete topic-wise list to build strong Java fundamentals before starting DSA.
Work through each section in order — don't skip Loops, Arrays, and Strings, since DSA depends heavily on them.

---

## 1. Basics: Variables, Data Types, Operators (10)
1. Write a program to print "Hello, World!".
2. Declare variables of all primitive types (int, double, char, boolean, long, float, byte, short) and print them.
3. Swap two numbers without using a third variable.
4. Find the sum, difference, product, quotient, and remainder of two numbers.
5. Convert Celsius to Fahrenheit and vice versa.
6. Check if a number is even or odd using the modulus operator.
7. Calculate the area and perimeter of a rectangle and a circle.
8. Take user input using `Scanner` and print it back.
9. Demonstrate implicit and explicit type casting with examples.
10. Find the ASCII value of a character and vice versa.

## 2. Conditional Statements (10)
11. Find the largest of two numbers.
12. Find the largest of three numbers using nested if-else.
13. Check if a number is positive, negative, or zero.
14. Check if a year is a leap year.
15. Check if a given number is a multiple of both 3 and 5.
16. Grade a student based on marks using if-else-if.
17. Simple calculator using switch-case (+, -, *, /).
18. Check if a character is a vowel or consonant.
19. Check if a triangle is valid given three angles.
20. Determine the quadrant of a point (x, y) on a graph.

## 3. Loops (15)
21. Print numbers from 1 to N using for, while, and do-while loops.
22. Print the multiplication table of a given number.
23. Calculate the factorial of a number.
24. Print the Fibonacci series up to N terms.
25. Check if a number is prime.
26. Print all prime numbers between 1 and N.
27. Check if a number is a palindrome. 
28. Reverse a number.
29. Sum of digits of a number.
30. Check if a number is an Armstrong number.
31. Print the sum of natural numbers from 1 to N.
32. Print a right-angled triangle pattern of stars.
33. Print a pyramid pattern of numbers/stars.
34. Print the Pascal's Triangle.
35. Find the GCD and LCM of two numbers.

## 4. Arrays (1D & 2D) (20)
36. Declare an array, take input, and print all elements.
37. Find the largest and smallest element in an array.
38. Find the sum and average of array elements.
39. Reverse an array (in-place).
40. Count even and odd numbers in an array.
41. Find the second largest element in an array.
42. Linear search on an array.
43. Binary search on a sorted array.
44. Sort an array using Bubble Sort.
45. Sort an array using Selection Sort.
46. Sort an array using Insertion Sort.
47. Remove duplicate elements from an array.
48. Merge two arrays into a third array.
49. Find the frequency of each element in an array.
50. Check if an array is sorted.
51. Left rotate an array by one position.
52. Find the missing number in an array of 1 to N.
53. Add two matrices (2D array).
54. Multiply two matrices.
55. Find the transpose of a matrix.

## 5. Strings (15)
56. Find the length of a string without using `.length()`.
57. Reverse a string.
58. Check if a string is a palindrome.
59. Count vowels and consonants in a string.
60. Count the number of words in a sentence.
61. Check if two strings are anagrams.
62. Convert a string to uppercase/lowercase manually.
63. Remove all whitespaces from a string.
64. Find the frequency of each character in a string.
65. Check if a string contains only digits.
66. Concatenate two strings without using `+` or `.concat()`.
67. Find the first non-repeating character in a string.
68. Sort the characters of a string alphabetically.
69. Compare two strings using `.equals()` vs `==`.
70. Use `StringBuilder` to build a string efficiently in a loop.

## 6. Methods / Functions (10)
71. Write a method to check if a number is prime and call it from main.
72. Write an overloaded method `add()` that works for int, double, and three integers.
73. Write a recursive method to calculate factorial.
74. Write a recursive method to calculate Fibonacci of N.
75. Write a method that returns multiple values using an array.
76. Demonstrate call by value in Java with an example.
77. Write a method with variable arguments (varargs) to find the sum.
78. Write a static method vs an instance method and explain the difference practically.
79. Write a recursive method to find GCD of two numbers.
80. Write a method to check if a string is a palindrome using recursion.

## 7. Classes & Objects (OOP Basics) (15)
81. Create a `Student` class with fields (name, age, marks) and a method to display details.
82. Create a class with a constructor and demonstrate constructor overloading.
83. Demonstrate the `this` keyword to resolve variable shadowing.
84. Create a `BankAccount` class with deposit() and withdraw() methods.
85. Create a `Rectangle` class with methods to calculate area and perimeter.
86. Demonstrate static variables vs instance variables using a counter example (e.g., count objects created).
87. Create a class with a static block and instance block, and explain execution order.
88. Demonstrate encapsulation using private fields and public getters/setters.
89. Create an array of objects (e.g., 5 `Student` objects) and print details of all.
90. Create a `Book` class implementing `Comparable` to sort books by price.

## 8. Inheritance, Polymorphism, Abstraction (15)
91. Demonstrate single inheritance: `Animal` → `Dog`.
92. Demonstrate multilevel inheritance: `Animal` → `Dog` → `Puppy`.
93. Demonstrate method overriding with `@Override`.
94. Demonstrate `super` keyword to call parent constructor and methods.
95. Demonstrate runtime polymorphism using overridden methods.
96. Demonstrate compile-time polymorphism using method overloading.
97. Create an abstract class `Shape` with an abstract method `area()`, implemented by `Circle` and `Square`.
98. Create an interface `Drawable` with a method `draw()` implemented by two classes.
99. Demonstrate multiple inheritance using interfaces.
100. Demonstrate the difference between abstract class and interface with a practical example.
101. Create a class hierarchy: `Vehicle` → `Car`/`Bike`, each overriding a `start()` method.
102. Demonstrate `instanceof` operator to check object types.
103. Demonstrate upcasting and downcasting with a parent-child class example.
104. Create a final class and explain why it cannot be extended.
105. Create a class with a final method and explain why it cannot be overridden.

## 9. Exception Handling (10)
106. Handle `ArithmeticException` when dividing by zero.
107. Handle `ArrayIndexOutOfBoundsException` when accessing an invalid index.
108. Demonstrate try-catch-finally and explain when `finally` runs.
109. Create and throw a custom exception (e.g., `InvalidAgeException`).
110. Demonstrate multiple catch blocks for different exception types.
111. Demonstrate `throw` vs `throws` keyword with an example.
112. Handle `NumberFormatException` while parsing a string to an integer.
113. Demonstrate try-with-resources for closing a resource automatically.
114. Write a method that validates user input (e.g., age > 0) and throws an exception otherwise.
115. Demonstrate nested try-catch blocks.

## 10. File Handling (10)
116. Create a new file using `File` class and check if it exists.
117. Write text to a file using `FileWriter`.
118. Read text from a file using `FileReader`/`BufferedReader`.
119. Append data to an existing file.
120. Count the number of lines/words/characters in a text file.
121. Copy the contents of one file into another.
122. Delete a file using Java.
123. List all files in a directory.
124. Read a file line by line and print only lines containing a specific word.
125. Handle `FileNotFoundException` and `IOException` while reading a file.

## 11. Collections Basics (DSA Bridge) (5)
126. Store and print elements using an `ArrayList`.
127. Add, remove, and search elements in an `ArrayList`.
128. Store key-value pairs using a `HashMap` and iterate over them.
129. Use a `HashSet` to remove duplicates from a list of numbers.
130. Sort an `ArrayList` of integers using `Collections.sort()`.

---

## How to Use This List
- Do **5–8 questions a day**, in order — don't skip ahead to OOP before Loops/Arrays feel comfortable.
- For each question: write it without looking anything up first, then check your logic.
- Sections 3, 4, and 5 (Loops, Arrays, Strings) are the real DSA foundation — repeat any of those you find slow or confusing.
- Once you finish this list, you'll be ready to start topic-wise DSA (searching, sorting, recursion, basic data structures like stacks/queues/linked lists).

Good luck — consistency with these will build real fluency, not just familiarity.
