```python
given = list(map(str,input().split()))

  

my_dict = {}
for j in given:
    if j in my_dict:
        my_dict[j] += 1
    else:
        my_dict[j] = 1
sorted_items = sorted(my_dict.items(), key=lambda x: (x[1], x[0]))
# Step 3: Extract only the names
result = [item[0] for item in sorted_items]
print(result)

```




