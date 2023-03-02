# max-profit-cutting-metal-rods
HackerRank In order to maximize profit, he should sell the metal of same size and shape.
Mr. Octopus has recently shut down his factory and want to sell off his metal rods to a local businessman.

In order to maximize profit, he should sell the metal of same size and shape. If he sells  metal rods of length , he receives N x L x metal_price. The remaining smaller metal rods will be thrown away. To cut the metal rods, he needs to pay cost_per_cut for every cut.

What is the maximum amount of money Mr. Octopus can make?

Input Format
First line of input contains cost_per_cut
Second line of input contains metal_price
Third line contains L, the number of rods Mr. Octopus has, followed by L integers in each line representing length of each rod.

Output Format
Print the result corresponding to the testcase.

Constraints
1 <= metal_price, cost_per_cut <= 1000
1 <= L <= 50
Each element of lenghts will lie in range [1, 10000].

Sample Input#00

1
10
3
26
103
59
Sample Output#00
1770

Explanation Here cuts are pretty cheap. So we can make large number of cuts to reduce the amount of wood wasted. Most optimal lengths of rods will be . So we will cut  pieces of length  from  rod, and throw peice of length  from it. Similarly we will cut  pieces of length  from  rod and throw away a piece of length . From  rod, we will cut  pieces of length  and throw a piece of length . So in total we have  pieces of length  and we have made  cuts also. So total profit is 

Sample Input#01
100
10
3
26
103
59

Sample Output#01
1230

Explanation Here we will throw smallest rod entirely and cut the pieces of length 51 from both left. So profit is 
3 x 51 x 10 - 3 x 100 = 1230
