def getFinalState(self, nums: List[int], k: int, multiplier: int) -> List[int]:
        i=0
        while i<k:
            mini=min(nums)
            ind=nums.index(mini)
            nums[ind]=mini*multiplier
            i+=1
        return nums