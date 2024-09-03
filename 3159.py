class Solution:
    def occurrencesOfElement(self, nums: List[int], queries: List[int], x: int) -> List[int]:
        index = [i for i, num in enumerate(nums) if num == x]
        return [index[query - 1] if query <= len(index) else -1 for query in queries]