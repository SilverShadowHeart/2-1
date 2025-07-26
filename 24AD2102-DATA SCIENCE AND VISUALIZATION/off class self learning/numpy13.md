## ✅ `np.sort()` – Sorts array **returns a sorted copy**


`a = np.array([3, 1, 2]) sorted_a = np.sort(a)         # [1, 2, 3]`

- Doesn't change `a`
    
- Works on 1D, 2D, etc.
    
- You can control the **axis** and **kind** of sort
    


`np.sort(arr, axis=-1, kind='quicksort')  # axis = -1 → last axis`

---

## ✅ `np.argsort()` – Returns **indices** that would sort the array


`a = np.array([3, 1, 2]) np.argsort(a)       # [1, 2, 0]`

- Good for **sorting related arrays** based on the sorted order of one
    



`names = np.array(['c', 'a', 'b']) scores = np.array([3, 1, 2])  order = np.argsort(scores) print(names[order])   # ['a' 'b' 'c']`

---

## ✅ `a.sort()` – In-place version (no copy)



`a = np.array([3, 1, 2]) a.sort()          # a becomes [1, 2, 3]`

---

## Sorting with axis



`arr = np.array([[3, 2, 1],                 [6, 5, 4]])  np.sort(arr, axis=0)  # sort down columns np.sort(arr, axis=1)  # sort across rows`

---

## Sorting algorithms

- `'quicksort'` – default, fast average case
    
- `'mergesort'` – stable, useful for complex sorting
    
- `'heapsort'` – less common
    
- `'stable'` – always preserves equal element order