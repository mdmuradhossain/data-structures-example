
# Queue Data Structure

A queue is a useful data structure in programming. It is similar to the ticket queue outside a cinema hall, where the first person entering the queue is the first person who gets the ticket.

Queue follows the First In First Out (FIFO) rule - the item that goes in first is the item that comes out first.


## Basic Operations of Queue

- **Enqueue:** Add an element to the end of the queue
- **Dequeue:** Remove an element from the front of the queue
- **IsEmpty:** Check if the queue is empty
- **IsFull:** Check if the queue is full
- **Peek:** Get the value of the front of the queue without removing it

## Working of Queue Data Structure

- two pointers `FRONT` and `REAR`
- `FRONT` track the first element of the queue
- `REAR` track the last element of the queue
- initially, set value of `FRONT` and `REAR` to `-1`
## Enqueue Operation

- check if the queue is full
- for the first element, set the value of `FRONT` to `0`
- increase the `REAR` index by `1`
- add the new element in the position pointed to by `REAR`
## Dequeue Operation

- check if the queue is empty
- return the value pointed by `FRONT`
- increase the `FRONT` index by `1`
- for the last element, reset the values of `FRONT` and `REAR` to `-1`
## Queue Complexity Analysis

The complexity of enqueue and dequeue operations in a queue using an array is `O(1)`. If we use `pop(N)` in python code, then the complexity might be `O(n)` depending on the position of the item to be popped.