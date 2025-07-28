
"""Given two arrays a and b.Given q queries each having a positive
integer i denoting an index of the array a. For each query, your task is to find all the elements lessthan or equal to qi in the array b.
Example 1:


Input:

N=6

a[] = {1, 2, 3, 4, 7, 9}

b[] = {0, 1, 2, 1, 1, 4} 

Query 1 -> 5

Query 2 -> 4

Output : 6

         6
         """

number = int(input(" lenght"))
a = list(map(int,input("array 1").split()))
b = list(map(int,input("array 2").split()))

count = 0
query = input('query')
while query != "exit":
    for i in b:
        if i <= a[int(query)]:
            count+= 1
    print(count)
    count = 0
    query = input("query")
