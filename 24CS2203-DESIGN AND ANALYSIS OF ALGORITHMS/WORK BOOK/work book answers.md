```python
given = list(map(int,input().split()))
uniq = set(given)
frequency = [given.count(x) for x in uniq]
