package Array;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class maxSubArray_LeetCode_53 {

    public static int maxSubArray(int[] nums) {
        int cur=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(cur<=0||i==0){
                cur=nums[i];
            }else{
                cur+=nums[i];
            }
            if(cur>max||i==0){
                max=cur;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] list={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(list));
    }
}
