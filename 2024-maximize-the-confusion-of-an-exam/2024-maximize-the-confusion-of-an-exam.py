# class Solution:
#     def maxConsecutiveAnswers(self, answerKey: str, k: int) -> int:
        
#         j = 1
#         arr = []
#         max1 = 0
#         count =1
#         i =1 
#         while(i < len(answerKey)):
            
#             curr = answerKey[j]
#             if curr == answerKey[i]:
#                 i+=1
#                 count +=1
                
#             else:
#                 max1 = max(max1, count)
#                 count = 1
#             j+=1  
#         print(max1)
                
class Solution:

    def maxConsecutiveAnswers(self, answerKey, k):
        max_freq = i = 0
        char_count = collections.Counter()

        for j in range(len(answerKey)):

            char_count[answerKey[j]] += 1
            max_freq = max(max_freq, char_count[answerKey[j]])

            if j - i + 1 > max_freq + k:
                char_count[answerKey[i]] -= 1
                i += 1

        return len(answerKey) - i
            
            
            
            
        
        