
"""Vaibhav likes to playwith numbers and he has N numbers. One day he was placing
the numbers on the playing board just to count that how many numbers he have.He was placing the numbers in increasing order i.e. from 1 to N.
But when he was putting the numbers back into his bag, some numbers fell downonto the floor. He picked up all the numbers but one number, he couldn't find.
Now he have to go somewhere urgently, so he asks you to find the missingnumber.
NOTE: Don't use Sorting


Example 1:

Input:  
                                                    

N = 4                                        

A[] = {1, 4, 3}

Output:

2"""



number = int(input("Enter a number: "))
array = list(map(int,input().split()))
answer = [str(x) for x in range(1,number+1)]
for i in array:
    if i in array:
        answer.remove(str(i))
print("".join(answer))
   
