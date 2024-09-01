class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        ans = []
    # Use a dictionary to count occurrences of each element
        counts = {}
    
        for i in nums:
            if i in counts:
                counts[i] += 1
            else:
                counts[i] = 1
    
    # Append elements that appear exactly twice
        for key, value in counts.items():
            if value == 2:
                ans.append(key)
    
        return ans