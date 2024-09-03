public class Main {
	public static void main(String[] args) {
		class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int operation=0;
        while (operation<k){
            int minind=-1;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<min){
                    min=nums[i];
                    minind=i;
                }
            }
            operation+=1;
            nums[minind]*=multiplier;
        }
        return nums;
        
    }
}
	}
}