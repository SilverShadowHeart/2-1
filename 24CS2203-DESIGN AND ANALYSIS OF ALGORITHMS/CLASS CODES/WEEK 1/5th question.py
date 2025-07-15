"""DAA 2025-26, [15-07-2025 01:07 PM]
Divya works for an international toy company that ships by container. Her task is to the determine the lowest cost way to combine
orders. What is the smallest number of containers that can be contracted to ship the items based on the given list of weights?
 
Constraints
1<=n<=105
0<=w[i]<=104,
where i €[1,n]
 
Sample Input 1
8
1 2 3 21 7 12 14 21
Sample Output 1 
4
Sample Input 2
6
12 15 7 819 24
Sample Output 2
4

DAA 2025-26, [15-07-2025 01:44 PM]
Her task is to determine the lowest-cost way to combine her orders for shipping. She has a list of item weights. The shipping company has a requirement that all items loaded in a container must weigh less than or equal to 4 units plus the weight of the minimum weight item. All items that meet the requirement will be shipped in one container.

The goal is to find the smallest number of containers that can be contracted to ship the items based on the given list of weights.

For example, there are items with weights w = [1,2,3,4,5,10,11,12,13]. This can be broken into two containers: [1,2,3,4,5] and [10,11,12,13] . Each container will contain items weighing within units of the minimum weight item i.e the minimum weight 1 will have a group of items ≥ (1+4), since that takes 2,3,4 and 5 the next available minimum weight is 10, so our next group will the all the weights that fall within ≥ 10 and ≤ (10+4), which in this case is all the elements left. The answer here is 2."""