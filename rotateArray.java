import java.util.Arrays;
public class rotateArray {
    public static int [] reverse (int[]nums, int k){
        int n = nums.length;
        k=k%n;
        if(n==0) return nums;
        int [] temp = new int [k];
        for(int i = n-k;i<n;i++){
            temp[i-n+k]=nums[i];
        }
        for (int i = n-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        for(int i = 0;i<k;i++){
            nums[i]=temp[i];
        }
        return nums;
    }
    public static void main(String[]args){
        int [] nums ={1,2,3,4,5,6,7};
        int k = 3;
        System.out.print(Arrays.toString(reverse(nums,k)));
    }
}
