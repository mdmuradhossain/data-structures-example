# Stack Data Structure

A stack is a linear data structure that follows the principle of Last In First Out (LIFO). This means the last element inserted inside the stack is removed first.
We can think of the stack data structure as the pile of plates on top of another.

![Stack representation similar to a pile of plate](https://cdn.programiz.com/sites/tutorial2program/files/stack-of-plates_0.png)

Here, you can:

- Put a new plate on top
- Remove the top plate

And, if you want the plate at the bottom, you must first remove all the plates on top. This is exactly how the stack data structure works.

## LIFO Principle of Stack

In programming terms, putting an item on top of the stack is called push and removing an item is called pop.

![Stack Push and Pop Operations](https://cdn.programiz.com/sites/tutorial2program/files/stack.png)

In the above image, although item 3 was kept last, it was removed first. This is exactly how the LIFO (Last In First Out) Principle works.

## Basic Operations of Stack

- **Push:** Add an element to the top of a stack
- **Pop:** Remove an element from the top of a stack
- **IsEmpty:** Check if the stack is empty
- **IsFull:** Check if the stack is full
- **Peek:** Get the value of the top element without removing it

## Working of Stack Data Structure

- A pointer called `TOP` is used to keep track of the top element in the stack.
- When initializing the stack, we set its value to `-1` so that we can check if the stack is empty by comparing `TOP == -1`.
- On pushing an element, we increase the value of TOP and place the new element in the position pointed to by `TOP`.
- On popping an element, we return the element pointed to by `TOP` and reduce its value.
- Before pushing, we check if the stack is already full
- Before popping, we check if the stack is already empty

![Working of Stack Data Structure](https://cdn.programiz.com/sites/tutorial2program/files/stack-operations.png)


## Stack Time Complexity

### Analysis of Stack Operations
Below mentioned are the time complexities for various operations that can be performed on the Stack data structure.

- Push Operation : O(1)
- Pop Operation : O(1)
- Top Operation : O(1)
- Search Operation : O(n)

The time complexities for push() and pop() functions are O(1) because we always have to insert or remove the data from the top of the stack, which is a one step process.

For the array-based implementation of a stack, the push and pop operations take constant time, `O(1)`.

## Applications of Stack Data Structure
Although stack is a simple data structure to implement, it is very powerful. The most common uses of a stack are:

- To reverse a word - Put all the letters in a stack and pop them out. Because of the LIFO order of stack, you will get the letters in reverse order.
- In compilers - Compilers use the stack to calculate the value of expressions like `2 + 4 / 5 * (7 - 9)` by converting the expression to prefix or postfix form.
- In browsers - The back button in a browser saves all the URLs you have visited previously in a stack. Each time you visit a new page, it is added on top of the stack. When you press the back button, the current URL is removed from the stack, and the previous URL is accessed.