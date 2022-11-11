from itertools import permutations

class Solution:
    
            
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
# using the two pointer technique if we have a 5 digit number, the next permutation will be 
                
        i = len(nums)-2
        
        while(i>=0 and nums[i] >= nums[i+1]):
            i-=1
        if(i>=0):
            j = len(nums)-1
            while j>=0 and nums[j] <= nums[i]:
                j-=1
            temp = nums[j]
            nums[j] = nums[i]
            nums[i] = temp
                
        
        
    
        end = len(nums)-1
        start = i+1
        while(start < end):
            temp = nums[start]
            nums[start] = nums[end]
            nums[end] = temp
            start+=1
            end-=1
              
                
                
                
                
                
            
            
        
        

        
        
        
        