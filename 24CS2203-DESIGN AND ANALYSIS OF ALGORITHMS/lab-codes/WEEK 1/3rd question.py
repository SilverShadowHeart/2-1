"""Given a string S consisting of opening and closing parenthesis '(' and ')'. Find length of the longest valid parenthesis substring.
A parenthesis string is valid if:
• For every opening parenthesis, there is a closing parenthesis.
• Opening parenthesis must be closed in the correct order.
Example 1:
Input: S = ((()
Output: 2
Explaination: The longest valid 
parenthesis substring is "()".
Example 2:
Input: S = )()())
Output: 4
Explaination: The longest valid 
parenthesis substring is "()()".
"""

strin = input()
open = 0
close = 0 
for i in strin:
    if i == "(":
        open +=1
    elif i == ")":
        close += 1
print(min(open,close))