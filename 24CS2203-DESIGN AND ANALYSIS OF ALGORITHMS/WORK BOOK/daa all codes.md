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
4th experiment 2 inlab
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


4th post lab 

```python 
# Rabin–Karp pattern search (simple numeric version)

def rabin_karp(text, pattern, q):
    d = 10                     # base
    m = len(pattern)
    n = len(text)
    h = pow(d, m-1, q)         # d^(m-1) % q

    # initial hashes
    p = 0
    t = 0
    for i in range(m):
        p = (d*p + pattern[i]) % q
        t = (d*t + text[i]) % q

    # slide the window
    for s in range(n - m + 1):
        if p == t:
            if text[s:s+m] == pattern:
                print(f"Match found at index {s}")

        if s < n - m:
            t = (d*(t - text[s]*h) + text[s+m]) % q
            if t < 0:
                t += q


# given data
text = [9,2,7,2,1,8,3,0,5,7,1,2,1,2,1,9,3,6,2,3,9,7]
pattern = [2,1,9,3,6]
q = 21

rabin_karp(text, pattern, q)

```

5th pre lab 

```python
def add(X, Y):
    n = len(X)
    R = [[0]*n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            R[i][j] = X[i][j] + Y[i][j]
    return R

def sub(X, Y):
    n = len(X)
    R = [[0]*n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            R[i][j] = X[i][j] - Y[i][j]
    return R

def strassen(A, B):
    n = len(A)
    if n == 1:
        return [[A[0][0] * B[0][0]]]

    mid = n // 2
    # Split A
    a = [row[:mid] for row in A[:mid]]
    b = [row[mid:] for row in A[:mid]]
    c = [row[:mid] for row in A[mid:]]
    d = [row[mid:] for row in A[mid:]]
    # Split B
    e = [row[:mid] for row in B[:mid]]
    f = [row[mid:] for row in B[:mid]]
    g = [row[:mid] for row in B[mid:]]
    h = [row[mid:] for row in B[mid:]]

    # Seven products
    M1 = strassen(add(a, d), add(e, h))
    M2 = strassen(add(c, d), e)
    M3 = strassen(a, sub(f, h))
    M4 = strassen(d, sub(g, e))
    M5 = strassen(add(a, b), h)
    M6 = strassen(sub(c, a), add(e, f))
    M7 = strassen(sub(b, d), add(g, h))

    # Combine
    p = add(sub(add(M1, M4), M5), M7)
    q = add(M3, M5)
    r = add(M2, M4)
    s = add(sub(add(M1, M3), M2), M6)

    # Merge 4 blocks
    C = [[0]*n for _ in range(n)]
    for i in range(mid):
        for j in range(mid):
            C[i][j] = p[i][j]
            C[i][j+mid] = q[i][j]
            C[i+mid][j] = r[i][j]
            C[i+mid][j+mid] = s[i][j]
    return C

# Example
A = [[1, 2],
     [3, 4]]
B = [[5, 6],
     [7, 8]]

result = strassen(A, B)
for row in result:
    print(row)

```
5th prelab 2
```python
def find_max_min(arr, low, high):
    if low == high:
        return arr[low], arr[low]       # one element

    elif high == low + 1:
        if arr[low] > arr[high]:
            return arr[low], arr[high]
        else:
            return arr[high], arr[low]

    else:
        mid = (low + high) // 2
        max1, min1 = find_max_min(arr, low, mid)
        max2, min2 = find_max_min(arr, mid + 1, high)

        return max(max1, max2), min(min1, min2)


# Example
arr = [5, 2, 9, 1, 6, 3]
maximum, minimum = find_max_min(arr, 0, len(arr) - 1)
print("Max:", maximum, "Min:", minimum)
```
5th inlab 1

```python
def orientation(p, q, r):
    # cross product (q - p) x (r - q)
    val = (q[1] - p[1]) * (r[0] - q[0]) - (q[0] - p[0]) * (r[1] - q[1])
    if val == 0:
        return 0   # collinear
    return 1 if val > 0 else 2  # 1=clockwise, 2=counterclockwise

def convex_hull(points):
    n = len(points)
    if n <= 1:
        return points

    # Sort by x, then y
    points.sort()

    # Build lower hull
    lower = []
    for p in points:
        while len(lower) >= 2 and orientation(lower[-2], lower[-1], p) != 2:
            lower.pop()
        lower.append(p)

    # Build upper hull
    upper = []
    for p in reversed(points):
        while len(upper) >= 2 and orientation(upper[-2], upper[-1], p) != 2:
            upper.pop()
        upper.append(p)

    # Remove duplicate endpoints
    return lower[:-1] + upper[:-1]


# Input
points = [(0,0), (0,4), (-4,0), (5,0), (0,-6), (1,0)]

# Output
hull = convex_hull(points)
print("Convex Hull:", hull)


```
inlab2 
```python
def quicksort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr)//2]
    left = [x for x in arr if x < pivot]
    mid = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quicksort(left) + mid + quicksort(right)

arr = [15, 5, 24, 8, 1, 3, 16, 10, 20]
print(quicksort(arr))

```