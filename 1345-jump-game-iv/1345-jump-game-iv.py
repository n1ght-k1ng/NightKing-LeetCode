class Solution:
#     def minJumps(self, arr: List[int]) -> int:
#         d = defaultdict(list)
#         for j, i in enumerate(arr):
#             d[i].append(j)
#         ans = float("inf")
#         visited = set()

#         def rec(i, jump):
#             nonlocal ans, visited, d
#             if 0 > i or i >= len(arr) or i in visited:
#                 return

#             if i == len(arr)-1:
#                 ans = min(ans, jump)
#                 return
#             visited.add(i)
#             rec(i-1, jump+1)
#             rec(i+1, jump+1)
#             for ele in d[arr[i]]:
#                 if ele > i:
#                     rec(ele, jump+1)
#             visited.remove(i)

#         rec(0, 0)
#         return ans
        def minJumps(self, arr: List[int]) -> int:
            d = defaultdict(list)
            for j, ele in enumerate(arr):
                d[ele].append(j)

            queue = deque([0])
            steps = 0
            visited = {0}
            n = len(arr)
            while queue:
                for _ in range(len(queue)):
                    i = queue.popleft()
                    if i == n - 1:
                        return steps
                    for ele in [*d[arr[i]], i-1, i+1]:
                        if ele not in visited and 0 <= ele <= n:
                            visited.add(ele)
                            queue.append(ele)
                    d[arr[i]].clear() # We should clear the list of index, to avoid recalculation at line **for ele in [*d[arr[i]], i-1, i+1]:**
                steps += 1