class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        int ans=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)) map.put(i,map.get(i)+1);
            else map.put(i,1);
            if(map.get(i)>n) ans=i;
        }
        return ans;

        
    }
}