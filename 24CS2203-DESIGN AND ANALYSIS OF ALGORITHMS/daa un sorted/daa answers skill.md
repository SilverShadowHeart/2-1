# week 1

![[WhatsApp Image 2025-10-09 at 08.35.20_f3b1fe85.jpg]]

```python 
    def lengthOfLongestSubstring(self, s: str) -> int:
        max_length = 0
        current_substring_list = []

        for char in s:
            if char in current_substring_list:
                index = current_substring_list.index(char)
                current_substring_list = current_substring_list[index + 1:]
            
            current_substring_list.append(char)
            
            if len(current_substring_list) > max_length:
                max_length = len(current_substring_list)
                
        return max_length
```



![[WhatsApp Image 2025-10-09 at 08.35.39_959da4dc.jpg]]

```python 
def twoSum(nums, target):
    n = len(nums)
    for i in range(n):
        for j in range(n):
            if i != j:
                if nums[i] + nums[j] == target:
                    return [i, j]

# --- Example Usage ---
nums_input = [2, 7, 11, 15]
target_input = 9

print(f"Input Nums: {nums_input}")
print(f"Input Target: {target_input}")
print(f"Output Indices: {twoSum(nums_input, target_input)}")
```

## week 2

![[Pasted image 20251010194038.png]]

cont'd
can contain is 49

```python
lenght = int(input())
array = list(map(int,input().split()))
result = []
for i in range(lenght):
 for j in range(lenght):
   mini = min(array[i],array[j])
   breadth = abs(i-j)
   possible = mini*breadth
   result.append(possible)
print(max(result)) 
```

![[Pasted image 20251010194232.png]]


```python
number = int(input())
val = [1000,900,500,400,100,90,50,40,10,9,5,4,1]
roma = ["M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"]
romaa = ''
for i in range(len(val)):
    while number >= val[i]:
     romaa += roma[i]
     number -= val[i]
print(romaa)
```
## week 3

![[Pasted image 20251013180906.png]]

```python
size = int(input())
array = []

for i in range(size):
    row = list(map(int,input().split()))
    array.append(row)
for i in range((size)):
    newar = []  
    for j in range((size)-1,-1,-1):
        newar.append(str(array[j][i]))
    print(" ".join(newar))
    
    
```
![[Pasted image 20251013181514.png]]

```python 
def group_anagrams(words):
    groups = {}
    for word in words:
        key = ''.join(sorted(word))
        groups.setdefault(key, []).append(word)
    result = [sorted(g) for g in groups.values()]
    result.sort(key=lambda g: (len(g), g[0]))
    return result

words = input().split()
for group in group_anagrams(words):
    print(' '.join(group))

```

## week 4
![[Pasted image 20251013181715.png]]

```python 
leni = int(input())
array = list(map(int,input().split()))
count = 0
while 0 in array:
     array.remove(0)
     count +=1
array.extend([0]*count)
print(*(array))
```

![[Pasted image 20251013181812.png]]

```python 
row = list(input().strip())
n = len(row)
found = False

for i in range(n):
    # Generate new list by skipping the i-th character
    combo = row[:i] + row[i+1:]
    if combo == combo[::-1]:
        print("true")
        found = True
        break

if not found:
    print("false")

```

![[Pasted image 20251013182035.png]]

```python 
length = int(input())
array = list(map(int,input().split()))
answer = []
current = 0
while current <length:
 prod = 1
 for i in range(len(array)):
  if current != i:
   prod *= array[i]
 answer.append(prod)
 current += 1
print(*(answer))
```

## week 5

![[Pasted image 20251013182543.png]]

```python 
n = int(input())
nums = list(map(int, input().split()))
target = int(input())
results = []

for i in range(n):
    for j in range(i + 1, n):
        for k in range(j + 1, n):
            for m in range(k + 1, n):
                quad = [nums[i], nums[j], nums[k], nums[m]]
                if sum(quad) == target:
                    # Add only if not already present
                    quad_sorted = sorted(quad)
                    if quad_sorted not in results:
                        results.append(quad_sorted)

results.sort()
for quad in results:
    print(*quad)

```

![[Pasted image 20251013182612.png]]

```python 
n = int(input())
words = [input() for _ in range(n)]

prefix = ""
for chars in zip(*words):
    if len(set(chars)) == 1:  # all chars in this position are the same
        prefix += chars[0]
    else:
        break

print(prefix)

```
## week 6

![[Pasted image 20251010194426.png]]


```python
def multiply(mat1, mat2):
    m = len(mat1)
    k = len(mat1[0])
    n = len(mat2[0])

    result = [[0 for _ in range(n)] for _ in range(m)]

    for i in range(m):
        for j in range(n):
            for p in range(k):
                result[i][j] += mat1[i][p] * mat2[p][j]
    
    return result

m, k = map(int, input().split())
_, n = map(int, input().split())

mat1 = []
for _ in range(m):
    row = list(map(int, input().split()))
    mat1.append(row)

mat2 = []
for _ in range(k):
    row = list(map(int, input().split()))
    mat2.append(row)

result_matrix = multiply(mat1, mat2)

for row in result_matrix:
    print(row)
```


![[Pasted image 20251010200102.png]]

```python 
def compress(s):
    if not s:
        return ""

    res = ""
    count = 1

    for i in range(1, len(s)):
        if s[i] == s[i-1]:
            count += 1
        else:
            res += s[i-1]
            if count > 1:
                res += str(count)
            count = 1

    res += s[-1]
    if count > 1:
        res += str(count)

    return res


user_input = input()
result_string = compress(user_input)
print(result_string)
```

## No week 7 for C3 C2
## week 8

![[Pasted image 20251010201143.png]]
```python
def generate_parentheses(num_pairs):
    combinations = []

    def backtrack(current_string, open_count, close_count):
        if len(current_string) == num_pairs * 2:
            combinations.append(current_string)
            return

        if open_count < num_pairs:
            backtrack(current_string + "(", open_count + 1, close_count)

        if close_count < open_count:
            backtrack(current_string + ")", open_count, close_count + 1)

    backtrack("", 0, 0)
    return combinations

n = int(input())
result_list = generate_parentheses(n)

for combo in result_list:
    print(combo)
```


![[Pasted image 20251010201255.png]]

with dictionary 
```python
def solve_bulls_and_cows(secret, guess):
    bulls = 0
    cows = 0
    
    secret_counts = {}
    guess_counts = {}
    
    for i in range(len(secret)):
        s_char = secret[i]
        g_char = guess[i]
        
        if s_char == g_char:
            bulls += 1
        else:
            secret_counts[s_char] = secret_counts.get(s_char, 0) + 1
            guess_counts[g_char] = guess_counts.get(g_char, 0) + 1
            
    for char, count in secret_counts.items():
        cows += min(count, guess_counts.get(char, 0))
            
    print(f"{bulls}A{cows}B")

secret_input = input()
guess_input = input()
solve_bulls_and_cows(secret_input, guess_input)
```

without dictionary

```python
def solve_bulls_and_cows(secret, guess):
    bulls = 0
    cows = 0
    
    secret_counts = [0] * 10
    guess_counts = [0] * 10
    
    for i in range(len(secret)):
        if secret[i] == guess[i]:
            bulls += 1
        else:
            secret_digit = int(secret[i])
            guess_digit = int(guess[i])
            
            secret_counts[secret_digit] += 1
            guess_counts[guess_digit] += 1
            
    for i in range(10):
        cows += min(secret_counts[i], guess_counts[i])
            
    print(f"{bulls}A{cows}B")

secret_input = input()
guess_input = input()
solve_bulls_and_cows(secret_input, guess_input)
```

## week 9

![[Pasted image 20251010202153.png]]

```python
nodes_as_strings = input().split()

tree_levels = []

start_index = 0
current_level_num = 0

while start_index < len(nodes_as_strings):
    num_nodes_on_level = 2**current_level_num
    end_index = start_index + num_nodes_on_level

    level_slice_str = nodes_as_strings[start_index:end_index]
    
    current_level_values = []
    for node_str in level_slice_str:
        if node_str != "null":
            current_level_values.append(int(node_str))
    
    if current_level_values:
        tree_levels.append(current_level_values)
        
    start_index = end_index
    current_level_num += 1

output_string = str(tree_levels)
print(output_string.replace(" ", ""))
```

![[Pasted image 20251010202132.png]]

```python
node_list = list(map(str, input().split()))

max_depth = 0
while 2**max_depth <= len(node_list):
    max_depth += 1

current_level = 0
slice_start = 0
slice_end = 1

while current_level <= max_depth:
    level_slice = node_list[slice_start:slice_end]

    if level_slice == level_slice[::-1]:
        current_level += 1
        slice_start += slice_end
        slice_end += 2**current_level
        continue
    else:
        print("True")
        break
else:
    print("False")
```


## week 10
![[Pasted image 20251010203053.png]]
![[Pasted image 20251010203118.png]]

```python
def min_cost_to_connect_points(points):
    num_points = len(points)
    if num_points <= 1:
        return 0

    # Track which points are already in the network
    in_network = [False] * num_points
    # Minimum cost to connect each point to the network
    min_connection_cost = [float('inf')] * num_points
    min_connection_cost[0] = 0  # Start from the first point
    total_cost = 0

    for _ in range(num_points):
        # --- 1. Find the cheapest point not yet in the network ---
        cheapest_cost = float('inf')
        point_to_add = -1
        for i in range(num_points):
            if not in_network[i] and min_connection_cost[i] < cheapest_cost:
                cheapest_cost = min_connection_cost[i]
                point_to_add = i

        # --- 2. Add this point to the network ---
        total_cost += cheapest_cost
        in_network[point_to_add] = True

        # --- 3. Update the cost to connect remaining points ---
        new_point_x, new_point_y = points[point_to_add]
        for i in range(num_points):
            if not in_network[i]:
                other_x, other_y = points[i]
                manhattan_distance = abs(new_point_x - other_x) + abs(new_point_y - other_y)
                # Update if this new point provides a cheaper connection
                min_connection_cost[i] = min(min_connection_cost[i], manhattan_distance)

    return total_cost

# --- Main Program to handle input ---
num_points_input = int(input("Enter number of points: "))
points_list = [list(map(int, input("Enter x y coordinates: ").split())) for _ in range(num_points_input)]

result = min_cost_to_connect_points(points_list)
print(result)

```

![[Pasted image 20251010202603.png]]
![[Pasted image 20251010202645.png]]

```python 
num_intervals_a = int(input())
intervals_a = []
for _ in range(num_intervals_a):
    intervals_a.append(list(map(int, input().split())))

num_intervals_b = int(input())
intervals_b = []
for _ in range(num_intervals_b):
    intervals_b.append(list(map(int, input().split())))

result_intervals = []
for i in range(num_intervals_a):
    if i > 0 and intervals_a[i][0] == intervals_b[i-1][1]:
        result_intervals.append([intervals_a[i][0], intervals_a[i][0]])
    
    if intervals_a[i][0] <= intervals_b[i][1]:
        result_intervals.append([intervals_b[i][0], intervals_a[i][1]])
        
for interval in result_intervals:
    print(*interval)
```

simple approach same thing basically 
```python
def intervalIntersection(A, B): 
i = j = 0 
res = [] 
while i < len(A) and j < len(B):
 lo = max(A[i][0], B[j][0])
 hi = min(A[i][1], B[j][1]) 
 if lo <= hi: 
  res.append([lo, hi]) 
 if A[i][1] < B[j][1]: 
  i += 1 
 else: 
 j += 1
return res 
if __name__ == "__main__": 
m = int(input())
A = [list(map(int, input().split())) for _ in range(m)] 
n = int(input())
B = [list(map(int, input().split())) for _ in range(n)]
ans = intervalIntersection(A, B) for seg in ans: 
print(*seg)
```


## week 11

![[Pasted image 20251013183020.png]]
```python
number = int(input())
coords = []
for i in range(number):
 x = tuple(map(int,input().split()))
 coords.append(x)
coords = set(coords)

min_area = float("inf")

for(x1,y1) in coords:
 for (x2,y2) in coords:
  if x1< x2 and y1<y2:
    if (x1,y2) in coords and (x2,y1) in coords:
      area = (x2 - x1) * (y2-y1)
      min_area = min(min_area,area)
print(min_area)
```

![[Pasted image 20251013183103.png]]

```python

def addOperators(num, target):
    res = []
    def dfs(path, i, val, last):
        if i == len(num):
            if val == target:
                res.append(path)
            return
        for j in range(i+1, len(num)+1):
            s = num[i:j]
            if len(s) > 1 and s[0] == '0':
                break
            n = int(s)
            if i == 0:
                dfs(s, j, n, n)
            else:
                dfs(path + '+' + s, j, val + n, n)
                dfs(path + '-' + s, j, val - n, -n)
                dfs(path + '*' + s, j, val - last + last * n, last * n)
    dfs("", 0, 0, 0)
    return res

num = input().strip()
target = int(input())
for expr in addOperators(num, target):
    print(expr)

```