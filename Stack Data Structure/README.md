
# Stack Data Structure

A stack is a linear data structure that follows the principle of Last In First Out (LIFO). This means the last element inserted inside the stack is removed first.
We can think of the stack data structure as the pile of plates on top of another.


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
## Stack Time Complexity

For the array-based implementation of a stack, the push and pop operations take constant time, `O(1)`.