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

```python 
def count_upper(s):
    return sum(1 for ch in s if ch.isupper())

def sort_by_upper(arr):
    # Count uppercase for each string
    counts = [count_upper(s) for s in arr]

    # Zip strings with counts and sort by count
    paired = list(zip(arr, counts))
    paired.sort(key=lambda x: x[1])

    return paired


# Example
arr = ["poiNtEr", "aRRAy", "cOde", "foR"]
print(sort_by_upper(arr))

```
3rd exp inlab2 
```python

def odd_even_merge(arr, lo, n, r):
    step = r * 2
    if step < n:
        odd_even_merge(arr, lo, n, step)
        odd_even_merge(arr, lo + r, n, step)
        for i in range(lo + r, lo + n - r, step):
            if arr[i] > arr[i + r]:
                arr[i], arr[i + r] = arr[i + r], arr[i]
    else:
        if arr[lo] > arr[lo + r]:
            arr[lo], arr[lo + r] = arr[lo + r], arr[lo]

def odd_even_merge_sort(arr, lo, n):
    if n > 1:
        m = n // 2
        odd_even_merge_sort(arr, lo, m) #left
        odd_even_merge_sort(arr, lo + m, m) #right 
        odd_even_merge(arr, lo, n, 1)

# Driver
arr = ["Neil", "Katherine", "Harry", "Stefan", "Dennis"]
n = len(arr)
odd_even_merge_sort(arr, 0, n)
print(arr)

```

post lab exp 3 

```python 
def secret_decode_simple(s):
    letters = s[::2]  # every even index → letters
    digits  = s[1::2] # every odd index → digits

    result = ""
    for ch, d in zip(letters, digits):
        shift_amount = int(d)
        new_char = chr(((ord(ch) - ord('a') + shift_amount) % 26) + ord('a'))
        result += new_char
    return result

# Example
encoded = "a1b2c3d4e5"  # last 'e' without digit will be ignored
decoded = secret_decode_simple(encoded)
print(decoded)  # "abbdcfdhj"

```

exp 4 pre lab and inlab
``` python

def find_pattern(txt, pattern):
    n = len(txt)
    m = len(pattern)
    
    for i in range(n - m + 1):  # slide the window
        match = True
        for j in range(m):
            if txt[i + j] != pattern[j]:
                match = False
                break
        if match:
            return i  # pattern found at index i
    return -1  # not found

# Example usage
txt1 = "HAVE A NICE DAY"
pattern1 = "NICE"
pos1 = find_pattern(txt1, pattern1)
print(f"Pattern found at index {pos1}" if pos1 != -1 else "Pattern not found")

txt2 = "WELCOME EVERYONE"
pattern2 = "ONE"
pos2 = find_pattern(txt2, pattern2)
print(f"Pattern found at index {pos2}" if pos2 != -1 else "Pattern not found")


```

```python 

import time

# ---------- Naive String Search ----------
def naive_search(txt, pattern):
    n = len(txt)
    m = len(pattern)
    for i in range(n - m + 1):
        match = True
        for j in range(m):
            if txt[i + j] != pattern[j]:
                match = False
                break
        if match:
            return i
    return -1

# ---------- KMP Preprocessing ----------
def compute_lps(pattern):
    m = len(pattern)
    lps = [0] * m
    length = 0
    i = 1
    while i < m:
        if pattern[i] == pattern[length]:
            length += 1
            lps[i] = length
            i += 1
        else:
            if length != 0:
                length = lps[length-1]
            else:
                lps[i] = 0
                i += 1
    return lps

# ---------- KMP Search ----------
def kmp_search(txt, pattern):
    n = len(txt)
    m = len(pattern)
    lps = compute_lps(pattern)
    
    i = j = 0  # indices for txt and pattern
    while i < n:
        if txt[i] == pattern[j]:
            i += 1
            j += 1
        if j == m:
            return i - j  # pattern found
        elif i < n and txt[i] != pattern[j]:
            if j != 0:
                j = lps[j-1]
            else:
                i += 1
    return -1

# ---------- Execution Time Measurement ----------
def measure_time(func, *args):
    start = time.time()
    pos = func(*args)
    end = time.time()
    elapsed = end - start
    return pos, elapsed

# ---------- Example ----------
txt = "A" * 100000 + "B"  # large text
pattern = "AB"

pos_naive, time_naive = measure_time(naive_search, txt, pattern)
pos_kmp, time_kmp = measure_time(kmp_search, txt, pattern)

print(f"Naive Search: Position={pos_naive}, Time={time_naive:.6f} seconds")
print(f"KMP Search:   Position={pos_kmp}, Time={time_kmp:.6f} seconds")

```