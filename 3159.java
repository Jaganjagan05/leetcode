public class Main {
	public static void main(String[] args) {
		
	}class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> index = new ArrayList<>();
        int n = nums.length;
        int[] ans = new int[queries.length]; // Changed n to queries.length

        for (int j = 0; j < n; j++) {
            if (nums[j] == x) {
                index.add(j);
            }
        }

        for (int i = 0; i < queries.length; i++) { // Changed n to queries.length
            if (queries[i] <= index.size()) {
                ans[i] = index.get(queries[i] - 1);
            } else {
                ans[i] = -1;
            }
        }
        return ans;
    }
}
}