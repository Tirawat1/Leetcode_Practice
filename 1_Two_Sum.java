import java.util.HashMap;
import java.util.Map;

class Solution {
    
    public int[] twoSum(int[] nums, int target) {

        // best complexity
        for(int i = 1; i < nums.length; i++){
            for(int j = i;j < nums.length; j++){
                if(nums[j] + nums[j - i] == target){
                    return new int[] {j, j-i};
                }
            }
        }
        return new int[] {-1,-1};

        // hashmap method
        // Map<Integer , Integer> map = new HashMap<>();
        // for(int i=0;i< nums.length ; i++ ){
        //     int diff = target - nums[i];
        //     if(map.containsKey(diff)){
        //         return new int[] {map.get(diff) , i}; 
        //     }
        // }

        // return new int[] {-1,-1};

        // my code
        // int [] result = new int[2];
        // for(int i=0; i<nums.length; i++){
        //     int sum=0;
        //     for(int j=i+1; j<nums.length; j++){
        //         sum += nums[i];
        //         sum += nums[j];
        //         if(sum == target){
        //             result[1] = j;
        //             result[0] = i;
        //             return result;
        //         }
        //         sum -= nums[j]; 
        //         sum -= nums[i];
        //     }
        // }
        
        // return result;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {3,2,3};
        int target = 6;
        int[] result = solution.twoSum(nums, target); // Call twoSum on the instance
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
