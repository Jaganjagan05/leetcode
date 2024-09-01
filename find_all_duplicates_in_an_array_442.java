class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> li=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int id=Math.abs(nums[i]);
            if(nums[id-1]<0) li.add(id);
            else nums[id-1]=-nums[id-1];

        }
    return li;
    }
}