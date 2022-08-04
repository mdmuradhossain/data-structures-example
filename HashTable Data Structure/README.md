# Hash Table

The Hash table data structure stores elements in key-value pairs where

- Key- unique integer that is used for indexing the values
- Value - data that are associated with keys.

![Hash Table key and data Key and Value in Hash table](https://cdn.programiz.com/sites/tutorial2program/files/Hash-0.png)

## Hashing (Hash Function)

In a hash table, a new index is processed using the keys. And, the element corresponding to that key is stored in the index. This process is called hashing.

Let `k` be a key and `h(x)` be a hash function.

Here, `h(k)` will give us a new index to store the element linked with `k`.

![Hash table Representation](https://cdn.programiz.com/sites/tutorial2program/files/Hash-2_0.png)

> **Hashing:** Hashing is a technique of mapping a large set of arbitrary data to tabular indexes using a hash function. It is a method for representing dictionaries for large datasets.
> It allows lookups, updating and retrieval operation to occur in a constant time i.e. `O(1)`.

> **Why Hashing is Needed?:**
> After storing a large amount of data, we need to perform various operations on these data. Lookups are inevitable for the datasets. Linear search and binary search perform lookups/search with time complexity of `O(n)` and `O(log n)` respectively. As the size of the dataset increases, these complexities also become significantly high which is not acceptable.

## Hash Collision

When the hash function generates the same index for multiple keys, there will be a conflict (what value to be stored in that index). This is called a hash collision.

We can resolve the hash collision using one of the following techniques.

- Collision resolution by chaining
- Open Addressing: Linear/Quadratic Probing and Double Hashing

### 1. Collision resolution by chaining

In chaining, if a hash function produces the same index for multiple elements, these elements are stored in the same index by using a doubly-linked list.

If `j` is the slot for multiple elements, it contains a pointer to the head of the list of elements. If no element is present, `j` contains `NIL`.

chaining method used to resolve collision in hash table

![Collision Resolution using chaining](https://cdn.programiz.com/sites/tutorial2program/files/Hash-3_1.png)

**Pseudocode for operations**

`chainedHashSearch(T, k)`
`return T[h(k)]`
`chainedHashInsert(T, x)`
`T[h(x.key)] = x //insert at the head`
`chainedHashDelete(T, x)`
`T[h(x.key)] = NIL`

### 2. Open Addressing

Unlike chaining, open addressing doesn't store multiple elements into the same slot. Here, each slot is either filled with a single key or left NIL.

Different techniques used in open addressing are:

i. Linear Probing
In linear probing, collision is resolved by checking the next slot.

`h(k, i) = (h′(k) + i) mod m`

where

- `i = {0, 1, ….}`
- `h'(k)` is a new hash function

If a collision occurs at `h(k, 0)`, then `h(k, 1)` is checked. In this way, the value of i is incremented linearly.

The problem with linear probing is that a cluster of adjacent slots is filled. When inserting a new element, the entire cluster must be traversed. This adds to the time required to perform operations on the hash table.

ii. Quadratic Probing

It works similar to linear probing but the spacing between the slots is increased (greater than one) by using the following relation.

`h(k, i) = (h′(k) + c1i + c2i2) mod m`

where,

- `c1` and `c2` are positive auxiliary constants,
- `i = {0, 1, ….}`

iii. Double hashing
If a collision occurs after applying a hash function `h(k)`, then another hash function is calculated for finding the next slot.

`h(k, i) = (h1(k) + ih2(k)) mod m`

## Good Hash Functions

A good hash function may not prevent the collisions completely however it can reduce the number of collisions.

Here, we will look into different methods to find a good hash function

### 1. Division Method

If `k` is a key and `m` is the size of the hash table, the hash function `h()` is calculated as:

`h(k) = k mod m`

For example, If the size of a hash table is `10` and `k = 112` then `h(k) = 112` mod `10 = 2`. The value of `m` must not be the powers of `2`. This is because the powers of `2` in binary format are `10, 100, 1000, ….` When we find `k mod m`, we will always get the lower order p-bits.

`if m = 22, k = 17, then h(k) = 17 mod 22 = 10001 mod 100 = 01`
`if m = 23, k = 17, then h(k) = 17 mod 22 = 10001 mod 100 = 001`
`if m = 24, k = 17, then h(k) = 17 mod 22 = 10001 mod 100 = 0001`
`if m = 2p, then h(k) = p lower bits of m`

### 2. Multiplication Method

`h(k) = ⌊m(kA mod 1)⌋`

where,

- `kA mod 1` gives the fractional part `kA`,
- `⌊ ⌋` gives the floor value
- `A` is any constant. The value of `A` lies between `0` and `1`. But, an optimal choice will be `≈ (√5-1)/2` suggested by Knuth.

### 3. Universal Hashing

In Universal hashing, the hash function is chosen at random independent of keys.

#Hash Tables in Data Structure and Algorithm

![Examples of Hashing](https://miro.medium.com/max/1400/1*J7lzku84LsxaeXpbgqRy5Q.png)
Hashing is the most important Data Struct that we use every day which is designed to use a special formula to encode the given value with a particular key for faster access of elements. the efficiency of hashing depends on the formula we used. Let's go into detail.

### INTRODUCTION

Suppose we want to design a system for storing users and their passwords. And we want to access to be performed efficiently:

1.Insert a user name and corresponding password. 2. Search a user and change their password. 3. Delete a user and corresponding password.

Think about it. We can use the following data structures to maintain it: array with pair element, Linked List, Binary Tree, Trie, …

summary of some methods:
![](https://miro.medium.com/max/1400/1*bjamB7adoJshRANMrn5guA.png)
Can we do better?

The above data structures all of these operations can be guaranteed to be in `O(logn)` time. So can we perform it with `O(1)` time? this is why the hash table comes in.

### BUILD HASH FUNCTION

The simplest method to build Hash function is each key, we can perform sum of each key by add all character and then we can use Modulo for M. M is typically a prime number and it is the size of Hash array. I just suppose in a simple case of password but in real life, we must encode password (this is not the purpose of this article and apply a ton of algorithm for encoding password).

![Examples of sum all characters](https://miro.medium.com/max/1400/1*T7KP2Fd1eezpjOn1kweJrw.png)

table_size = 7
table = [0]\*table_size
def hashing(user):
sum = 0
for char in user:
sum += char
return sum%table_size`

//Example of USER1
user = "USER1"
password = "PASSWORD1"
table[hashing(user)] = password

We have many the formula for the Hash function like Robert Sedgewick, Polynomial, Cyclic shift,…

**Robert Sedgewick Hashing:**
def RSHash(key):
a = 63689
b = 378551
hash = 0
for i in range(len(key)):
hash = hash _ a + ord(key[i])
a = a _ b
return hash%table_size

**Polynomial Hashing:**
def polynominalRollingHash(key):
p = 31
m = 1e9+99
power*of_p = 1
hash_val = 0
for s in key:
hash_val = (hash_val + (s - 'a' + 1)\_power_of_p) % table_size
power_of_p = (power_of_p * p) % table_size
return hash_val

**Cyclic shift Hashing:**
def cyclicShiftHash(key):
hash_val = 0
for s in key:
hash_val ^= ((hash_val << 5) + s + (hash_val >> 27))
return hash_val & 0x7FFFFFFF;

0x7FFFFFFF is a number in hexadecimal (2,147,483,647 in decimal) that represents the maximum positive value for a 32-bit signed binary integer.

**So, what makes a good hash function?**

- The hash value is fully determined by the data being hashed.
- The hash function uses all the input data.
- The hash function “uniformly" distributes the data across the entire set of possible hash values.
- The hash function generates very different hash values for similar strings.

The above hashing functions may be good at different problems, we have to try many problems to aware of it.

## THE PROBLEMS OF HASHING FUNCTION

### COLLISIONS

Collision = two keys hashing to the same value.

- Essentially unavoidable
- Birthday problem: how many people will have to enter a room until two have the same birthday?
- With M hash values, expect a collision after sqrt(M/2) insertions

=> can't avoid collisions unless you have a ridiculous amount of money :)) sorry for a little bit of confusion here, I mean the memory

### COLLISION REVOLUTION

How to handle Collisions?

There are mainly two methods to handle collision:

- Separate Chaining.
- Open Addressing.

### Separate Chaining

The concept of separate chaining involves a technique in which each index key is built with a linked list. This means that the table’s cells have linked lists governed by the same hash function, So, in place of the collision error which occurred in the figure we used in the last section, the cell now contains a linked list containing the string “Bruce Lee” and “Robert Lee” as seen in this new figure. We can see in this figure how the subsequent strings are loaded using the separate chaining technique.

![Linked List](https://miro.medium.com/max/1400/1*VEMtED_SYyKY-f2IAJz81g.png)

**Why use linked list?**

**Advantages:**

- Easy to implement
- Unlimited capacity

**Disadvantages:**

- In the worst case: if the chain becomes long because of too many elements have same value, the search time can become O(n).
- Wastage of space (some space of hash table are never used)
- Uses extra space for linked list

_The below code for Separate Chaining:_
TABLE_SIZE = 1000
class Node:
def **init**(self, key=""):
self.key = ""
self.next = Node

class HashTalbe:
def **init**(self):
self.head = Node
self.count = 0
// In[]: create a new hashTable
hashTable = []
// In[]: hashing function
def hashing(s):
hashValue = 1315423911
a=5
b=2
for i in range(len(s)):
x = hashValue << a
y = hashValue >> b
hashValue ^= (x+ord(s[i]) + y) & 0xFFFFFFFF
return hashValue & 0xFFFFFFFF
// In[]: insert a new key into hash table
def insert(s):
index = hashing(s) % TABLE_SIZE
newNode = Node(s)
if hashTable[index].head == None:
hashTable[index].head = newNode
hashTable[index].count = 1
return
newNode.next = hashTable[index].head
hashTable[index].head = newNode
hashTable[index].count += 1
// In[]: search a key in hash table
def search(s):
index = hashing(s) % TABLE_SIZE
currentNode = hashTable[index].head
while currentNode != None:
if currentNode.key == s:
return True
currentNode = currentNode.next
return False
// In[]: delete a key in table
def deleteKey(s):
index = hashing(s) % TABLE_SIZE
currentNode = hashTable[index].head
prevNode = currentNode
while currentNode != None:
if currentNode.key == s:
if currentNode == hashTable[index].head:
hashTable[index].head = hashTable[index].head.next
else:
prevNode.next = currentNode.next
hashTable[index].count -= 1
del currentNode
return True
prevNode = currentNode
currentNode = currentNode.next

### Open Addressing

As the name of it, the concept is instead of create a new linked list to store the key is duplicated, we will move the duplicated key to an empty index. There are 4 mainly way to avoid collision.
![](https://miro.medium.com/max/1400/1*Cz4tULUMd5vxBP2btP4f9A.png)

- Linear probing
- Binary probing
- Quadratic probing
- Double hashing

**Linear probing:** when the key is duplicated, this key is moved to the next empty index with linear search.

Advantages:

- Allow search all index in Hash table easily.
- Insert function always performs except the array is full.

Disadvantages:

- Data will be gathered into segments in Hashtable.
- In the worst case, search the empty indexing with `O(n)` time.

_Implementation:_
TABLE_SIZE = 100
current_size = 0
class Node:
def **init**(self, key = ""):
self.key = key
self.flag = 0
hashTable = [Node()]\*TABLE_SIZE
def JSHash(keys):
hashValue = 1315423911
a = 5
b = 2
for s in keys:
x = hashValue << a
y = hashValue >> b
hashValue ^= (x+ord(s)+y)
return hashValue & 0x7FFFFFFF
def insertKey(key):
global current_size
index = JSHash(key) % TABLE_SIZE
if current_size > TABLE_SIZE:
return False
while hashTable[index].flag:
index = (index+1)%TABLE_SIZE
hashTable[index].key = key
hashTable[index].flag = 1
current_size += 1
return True
def searchKey(key):
index = JSHash(key) % TABLE_SIZE
count = 0
if current_size == 0:
return -1  
 while hashTable[index].flag != 0 and count <= TABLE_SIZE:
if hashTable[index].key == key:
if hashTable[index].flag == 1:
return index
return -1
index = (index+1) % TABLE_SIZE
count += 1
return -1

**Binary probing:** use operation XOR to find the empty index.
Advantages:

- while taking advantage of Linear’s strengths and making quick calculations in practice by using bitwise

Disadvantages:

- Data is still gathered into different segments.
- Like Linear probing the Binary probing in the worst-case `O(n)` time.

Implementation:
TABLE_SIZE = 100
current_size = 0
class Node:
def **init**(self, key = ""):
self.key = key
self.flag = 0
hashTable = [Node()]\*TABLE_SIZE
def JSHash(keys):
hashValue = 1315423911
a = 5
b = 2
for s in keys:
x = hashValue << a
y = hashValue >> b
hashValue ^= (x+ord(s)+y)
return hashValue & 0x7FFFFFFF
def insertKey(key):
global current_size
index = JSHash(key) % TABLE_SIZE
if current_size > TABLE_SIZE:
return False  
 for i in range(1, TABLE_SIZE+1):
if hashTable[index].flag == 0:
hashTable[index].key = key
hashTable[index].flag = 1
current_size += 1
return True
index = (index ^ i) % TABLE_SIZE
return False
def searchKey(key):
index = JSHash(key) % TABLE_SIZE
count = 0
if current_size == 0:
return -1
i = 1
while hashTable[index].flag != 0 and count <= TABLE_SIZE:
if hashTable[index].key == key:
if hashTable[index].flag == 1:
return index
return -1
index = (index ^ 1) % TABLE_SIZE
count += 1
i += 1  
 return -1

**Quadratic probing:** Like Linear probing, the quadratic probing uses the quadratic function to change the index of the duplicated element. Find `i-th` index smallest such as `(index+i*i) mod SIZE` is empty then move it to there.

Advantages:

- Reduce the clustering of data phenomena
  Disadvantages:
- Encountered some case the array still has the empty indexing but it didn’t find.
- 2 two keys that have the same process may be will hash at the same index.

_Implementation:_
TABLE_SIZE = 100
current_size = 0
class Node:
def **init**(self, key = ""):
self.key = key
self.flag = 0
hashTable = [Node()]*TABLE_SIZE
def JSHash(keys):
hashValue = 1315423911
a = 5
b = 2
for s in keys:
x = hashValue << a
y = hashValue >> b
hashValue ^= (x+ord(s)+y)
return hashValue & 0x7FFFFFFF
def insertKey(key):
global current_size
index = JSHash(key) % TABLE_SIZE
if current_size >= TABLE_SIZE:
return False  
 for i in range(1, TABLE_SIZE+1):
if hashTable[index].flag == 0:
hashTable[index].key = key
hashTable[index].flag = 1
current_size += 1
return True
index = (index + i*i) % TABLE_SIZE
return False
def searchKey(key):
index = JSHash(key) % TABLE_SIZE
count = 0
if current_size == 0:
return -1
i = 1
while hashTable[index].flag != 0 and count <= TABLE_SIZE:
if hashTable[index].key == key:
if hashTable[index].flag == 1:
return index
return -1
index = (index + i\*i) % TABLE_SIZE
count += 1
i += 1

return -1

**Double hashing:** When the occurs collision we will use another hashing function. Suppose index_first is the index of the first hashing function, index_second is the index of the second hashing function. and then `i` is updated by `index_first = (index_first + i*index_second) mod SIZE`.

Advantages:

- Not occur the clustering of data phenomena.

Disadvantages:

- Must use double hashing.
- Like Quadratic probing 2 two keys that have the same process may be will hash at the same index.

_Implementation:_
def insertKey(key):
global current_size
index = JSHash(key) % TABLE_SIZE
inde_second = RSHash(key) % TABLE_SIZE
if current_size >= TABLE_SIZE:
return False
for i in range(1, TABLE_SIZE+1):
if hashTable[index].flag == 0:
hashTable[index].key = key
hashTable[index].flag = 1
current_size += 1
return True
index = (index + i*index_second) % TABLE_SIZE
return False
def searchKey(key):
index = JSHash(key) % TABLE_SIZE
index_second = RSHash(key) % TABLE_SIZE
count = 0
if current_size == 0:
return -1
i = 1
while hashTable[index].flag != 0 and count <= TABLE_SIZE:
if hashTable[index].key == key:
if hashTable[index].flag == 1:
return index
return -1
index = (index + i*index_second) % TABLE_SIZE
count += 1
i += 1
return -1

## Time complexity

### Searching

Hashing is a storage technique which mostly concerns itself making searching faster and more efficient.

### Best Case

When searching for an element in the hash map, in the best case, the element is directly found at the location indicated by its key. So, we only need to calculate the hash key and then retrieve the element. This is achieved in constant time. So, best case complexity is O(1).

### Average Case

If the hashing function is well defined, the probability of values being hashed to the same key falls drastically.
So, in the average case,

Calculation of hash h(k) takes place in O(1) complexity.
Finding this location is achieved in O(1) complexity.
Now, assuming a hash table employs chaining to resolve collisions, then in the average case, all chains will be equally lengthy. If the total number of elements in the hash map is n and the size of the hash map is m, then size of each chain will be n/m. As n/m is a fixed value, we will only have to travel n/m steps at most to find the element. So, in average case, hashing runs in O(1) complexity. This is an definite improvement over binary search O(log n) and linear search O(n).

### Worst Case

In the worst case, the hash map is at full capacity. In case of open addressing for collisions, we will have to traverse through the entire hash map and check every element to yield a search result.

In case of chaining, one single linked list will have all the elements in it. So, the search algorithm must traverse the entire linked list and check every node to yield proper search results.

So the worst case complexity shoots up to O(n) since all elements are being checked one by one. Linear searching in worst case is also O(n) whereas binary search still maintains the order of log n in worst case as well.

## Insertion and Deletion

### Best Case

The hash key is calculated in O(1) time complexity as always, and the required location is accessed in O(1).

Insertion: In the best case, the key indicates a vacant location and the element is directly inserted into the hash table. So, overall complexity is O(1).

Deletion: In the best case, the element to be deleted is found at the key index itself and is directly deleted. This is achieved in constant O(1) complexity.

### Average Case

The hash key is calculated in O(1) time complexity and the required location is accessed in O(1).
Insertion: Like we saw in searching earlier, in the average case,all chains are of equal length and so, the last node of the chain is reached in constant time complexity. Here, the new node is created and appended to the list. Overall time complexity is O(1).

Deletion: The node to be deleted can be reached in constant time in the average case, as all the chains are of roughly equal length. Deletion takes place in O(1) complexity.

### Worst Case

In the worst cases, both insertion and deletion take O(n) complexity. This is because all nodes are attached to the same linked list due to collision.
Insertion: The entire list of n elements must be traversed to reach the end and then, the new node is appended.
Deletion: The entire list is searched and in the worst case, the element to be deleted is found at the very last node in the last.

## Space complexity

In all cases of open addressing, space complexity for hash map remains O(n) where

n = number of elements in the hash map

since every element which is stored in the table must have some memory associated with it, no matter the case.
However,
Summing up:
For open addressing:

| ACTIVITY         | BEST CASE | AVERAGE CASE | WORST CASE |
| ---------------- | --------- | ------------ | ---------- |
| Searching        | O(1)      | O(1)         | O(n)       |
| Insertion        | O(1)      | O(1)         | O(n)       |
| Deletion         | O(1)      | O(1)         | O(n)       |
| Space Complexity | O(n)      | O(n)         | O(n)       |

For closed addressing (chaining):

| ACTIVITY         | BEST CASE | AVERAGE CASE | WORST CASE |
| ---------------- | --------- | ------------ | ---------- |
| Searching        | O(1)      | O(1)         | O(n)       |
| Insertion        | O(1)      | O(1)         | O(n)       |
| Deletion         | O(1)      | O(1)         | O(n)       |
| Space Complexity | O(m+n)    | O(m+n)       | O(m+n)     |

where m is the size of the hash table and n is the number of items inserted. This is because linked nodes are allocated memory outside the hash map.
