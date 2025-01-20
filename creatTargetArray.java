class Solution{
  public int[] createTargetArray(int[] nums, int[] index){
      int n = nums.length;
      ArrayList<Integer> target = new ArrayList<>();
      int[] ans = new int[n];

      for(int i = 0; i < n; i++){
          target.add(index[i], nums[i]);
      }
      for(int i = 0; i < n; i++){
          ans[i] = target.get(i);
      }
      return ans;
  }

}

// class Solution {
//     public int[] createTargetArray(int[] nums, int[] index) {
//         int len = nums.length;
//         ArrayList <Integer> targetList = new ArrayList <>();
//         int [] ans = new int [len];

//         for (int i = 0; i < len; i++){
//             //to insert nums[i] in place of index[i] using arraylist formula of
//             // .add(place, value)
//             // .get(value)

//             targetList.add(index[i], nums[i]);
//         }
//         for(int j = 0; j < len; j++){
//             ans[j] = targetList.get(j);
//         }
//         return ans;

//     }
// }
