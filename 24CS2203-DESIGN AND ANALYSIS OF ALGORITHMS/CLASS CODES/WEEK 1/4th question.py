"""You are given an array of nintegers,ar=ar[0],ar[1],…,ar[n-1] , and a positive integer,k . Find and print
the number of (i,j) pairs where i<j and ar[i] + ar[j] is divisible by .
For example,ar =[1,2,3,4,5,6]  and k=5. Our three pairs meeting the criteria are
[1,4],[2,3] and [4,6].
FunctionalDescription
Complete the
divisible Sum Pairs function in the editor below. It should return the integercount of pairs meeting the criteria.
Return
Int: The
Number of pairs
 
Constraints
2<=n<=100
1<=k<=100
1<=ar[i]<=100
Sample Input 
STDIN                     Function
6   3                          n=6, k=3
1 32 6 1 2                ar=[1, 3, 2, 6, 1,
2]
Sample Output 
5
Sample Input   1
4    6
Sample Output 1 
6
Sample Input   2
5    7   8
12
Sample Output 2
3
 
Sample Input   3
4

7
8    12
Sample Output 3
1
"""

array = list(map(int,input("enter all the numbers").split()))
target = int(input())
array.sort()
match = 0
for i in range(len(array)):
    for j in range(len(array)):
        if array[i] >= array[j]:
            break
        if (array[i]+array[j])%target == 0:
            match += 1
print(match)