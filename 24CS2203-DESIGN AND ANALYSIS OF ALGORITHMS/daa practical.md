```python 

def quicksort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr)//2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quicksort(left) + middle + quicksort(right)

# Example
arr = [3, 6, 8, 10, 1, 2, 1]
print(quicksort(arr))


```

```python
def custom_sort(s):
    # Count characters
    freq = {}
    for ch in s:
        if ch in freq:
            freq[ch] += 1
        else:
            freq[ch] = 1

    # Sort characters by (-count, char)
    sorted_chars = sorted(s, key=lambda x: (-freq[x], x))
    return ''.join(sorted_chars)

# Examples
inputs = ["aaabbc", "aabbcc", "aabbccdd", "aabcc"]
for s in inputs:
    print(custom_sort(s))

```


```python
arr = ["poiNtEr", "aRRAy", "cOde", "foR"]

# Count uppercase letters for each string
upper_counts = [sum(1 for ch in s if ch.isupper()) for s in arr]

# Combine strings with their counts using zip
zipped = list(zip(arr, upper_counts))

# Sort by the count (ascending)
sorted_zipped = sorted(zipped, key=lambda x: x[1])

print(sorted_zipped)

```

```python
def compare_and_swap(arr, i, j):
    if arr[i] > arr[j]:
        arr[i], arr[j] = arr[j], arr[i]

def odd_even_merge(arr, lo, n, r):
    step = r * 2
    if step < n:
        odd_even_merge(arr, lo, n, step)
        odd_even_merge(arr, lo + r, n, step)
        for i in range(lo + r, lo + n - r, step):
            compare_and_swap(arr, i, i + r)
    else:
        compare_and_swap(arr, lo, lo + r)

def odd_even_merge_sort(arr, lo=0, n=None):
    if n is None:
        n = len(arr)
    if n > 1:
        m = n // 2
        odd_even_merge_sort(arr, lo, m)
        odd_even_merge_sort(arr, lo + m, n - m)
        odd_even_merge(arr, lo, n, 1)

# Input
names = ["Neil", "Katherine", "Harry", "Stefan", "Dennis"]
odd_even_merge_sort(names)
print(names)

```

```python 
def shift_letters(s):
    alphabets = list("abcdefghijklmnopqrstuvwxyz")
    res = []

    for i in range(len(s)):
        # if next char is a digit, shift this letter
        if s[i].isalpha() and i + 1 < len(s) and s[i + 1].isdigit():
            idx = alphabets.index(s[i])
            shift = int(s[i + 1])
            res.append(alphabets[(idx + shift) % 26])
        # ignore digits, keep normal letters
        elif s[i].isalpha():
            res.append(s[i])
    return ''.join(res)

input_str = "a1b2c3d4e"
print(shift_letters(input_str))

```

```python
txt = "AAAAABBAABAAAACC"
pat = "AAAA"

for i in range(len(txt) - len(pat) + 1):
    if txt[i:i+len(pat)] == pat:
        print("Pattern found at index", i)

```

```python
def cross(o, a, b):
    # cross product to check orientation
    return (a[0]-o[0])*(b[1]-o[1]) - (a[1]-o[1])*(b[0]-o[0])

def merge(left, right):
    # merge two hulls
    hull = left + right
    hull.sort()  # sort by x, minimal handling
    # keep only convex points (Graham-scan style)
    res = []
    for p in hull:
        while len(res) >= 2 and cross(res[-2], res[-1], p) <= 0:
            res.pop()
        res.append(p)
    return res

def convex_hull(points):
    if len(points) <= 1:
        return points
    mid = len(points)//2
    left = convex_hull(points[:mid])
    right = convex_hull(points[mid:])
    return merge(left, right)

# ----------------- Example -----------------
points = [(0,0),(1,1),(2,2),(2,0),(0,2),(1,0)]
hull = convex_hull(sorted(points))
print(hull)

```
exp8

```python 
def min_hours(hours):
    attend, skip1, skip2 = hours[0], 0, float('inf')
    for h in hours[1:]:
        attend, skip1, skip2 = h + min(attend, skip1, skip2), attend, skip1
    return min(attend, skip1, skip2)

```