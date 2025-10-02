in lab experiment 1 1

```python 
def sort_by_frequency(arr):
    # Step 1: Count frequencies manually
    freq = {}
    for s in arr:
        if s in freq:
            freq[s] += 1
        else:
            freq[s] = 1

    # Step 2: Sort distinct strings by (frequency, alphabetical order)
    # key = tuple: (frequency, string)
    result = sorted(freq.keys(), key=lambda x: (freq[x], x))

    return result


# Example usage
arr = ["Ramesh", "Mahesh", "Mahesh", "Ramesh"]
print(sort_by_frequency(arr))  # ['Mahesh', 'Ramesh']

```
in lab experiment 1 2

```python 

def custom_sort(words, order):
    # Step 1: build rank map
    rank = {}
    for i, ch in enumerate(order):
        rank[ch] = i

    # Step 2: sorting with custom key
    def transform(word):
        return [rank[ch] for ch in word]  # turn word into its numeric rank sequence

    return sorted(words, key=transform)


# Example
words = ["word", "world", "row"]
order = "worldabcefghijkmnpqstuvxyz"
print(custom_sort(words, order))  # ['world', 'word', 'row']

```
```python 
	def quicksort(arr):
    if len(arr) <= 1:
        return arr

    pivot = arr[len(arr) // 2]  # pick middle element
    left  = [x for x in arr if x < pivot]
    mid   = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]

    return quicksort(left) + mid + quicksort(right)


# Example
arr = [3, 6, 8, 10, 1, 2, 1]
print(quicksort(arr))  # [1, 1, 2, 3, 6, 8, 10]

```
pre lab 3rd exp 2
```python 
def stefan_sort(s):
    # Count characters manually
    freq = {}
    for ch in s:
        freq[ch] = freq.get(ch, 0) + 1

    # Sort characters by (-frequency, char)
    sorted_chars = sorted(freq.items(), key=lambda x: (-x[1], x[0]))

    # Rebuild the string
    result = ""
    for ch, count in sorted_chars:
        result += ch * count

    return result


# Driver
strings = ["aaabbc", "aabbcc", "aabbccdd", "aabcc"]

for s in strings:
    print(stefan_sort(s))

```