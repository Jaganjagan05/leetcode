class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int ans=0;
        for(int i=0;i<n;i++){
            HashSet<Integer> sub=new HashSet<>();
            for(int j=i;j<n;j++){
                int ele=nums.get(j);
                sub.add(ele);
                int len=sub.size();
                ans+=len*len;

            }
        }
        return ans;
        
    }
}