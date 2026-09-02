class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        ArrayList<Integer> arr=new ArrayList<>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[k]);
                        Collections.sort(arr);
                        st.add(arr);
                    }
                }
            }
        }
        return new ArrayList(st);
    }
}