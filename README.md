# data_Structures_Algorithms_Java
Learning log for data structure and algorithms using java

### What is a dataStructure?
- Organizes and stores data.
- Many data structures are available as there is no single data structure which can perform all tasks efficiently.

### What is an algorithm?
- An algorithm is something, which specifies the steps needed to perform a task.
- There can be many algorithms for accomplishing a task.
- An algorithm is not an implementation. There can be many implementations of the same algorithm.

## Arrays
- Used to store similar kind of data.
- Efficient while searching data if you know the index.

> Algorithm performance:
> Generally to check an algorithm performance, we will add code to check the start time and end time of a task.
> then specify the time taken to run the task, but this is not an effective way of measuring an algorithms performance.
> Older machines can do it very slow, newer machines or super computers can do it very fast even-though the algorithm is not great.

### How is algorithm performance measured?
- By the number of steps it takes to execute a task, this is called ** Time Complexity ** .
- Amount of memory consumed to run an algorithm which is called ** Memory Complexity ** .

> As memory is cheaper now a days, concern is more towards time complexity.

### Time Complexity
- Time complexity is considered for the worst case scenario.
- Performance of algorithms are calculated by comparing the worst case time complexity of those two.

### Big-O notation
- Expressing the way of complexity, related to the number of items, that the algorithm deals with.
- Written as capital alphabet 'O' followed by parentheses.
- Provides a way of comparing different algorithms with time complexity, in an objective manner, independent of hardware.

#### Example
### Steps to add sugar in tea:
1. Fetch the bowl with sugar.
2. Get a spoon.
3. Scoop out sugar with spoon.
4. Pour sugar from spoon into tea.
5. if you need more sugar repeat the steps 3 and 4.

### Calculating time complexity for above algorithm
Spoons of sugars required | Steps required (Time Complexity)
------------------------- | --------------------------------
1 | 4
2 | 6
3 | 8
4 | 10

### Converting to notation
- Number of desired sugars = n
- Total number of steps = 2n + 2
- As n grows the number of steps grows.
- The '2' in '2n' and '+2' remains constant, so they do not factor into the time complexity.
- The value of 'n' determines the growth rate.
- Hence the time complexity is ** 'O(n)' **
- This is called as linear complexity

### General Big-O values
Big-O  | Description | Notes
------ | ----------- | ------------------------------------------------------
O(n) | constant | Increase in number of steps is constant
O(logn) | logarithmic | logarithmic considered is base 2
O(n) | linear | Increase in number of steps will be linear, difference between any two in the sequence is same
O(nlogn)| n log-star n | <del> need to be updated </del>
O(n2) | quadratic | n to the power 2, or n squared

