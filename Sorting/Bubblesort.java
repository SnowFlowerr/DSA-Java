import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int nums[]={4,6,2,7,3,0,2,8,9,7};
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
