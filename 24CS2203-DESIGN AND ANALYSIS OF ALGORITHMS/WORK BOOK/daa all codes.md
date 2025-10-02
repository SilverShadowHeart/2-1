in lab experiment 1

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
