public class MinMax {
     public static void main (String[] args) {
         int[] nums = { 99, -10, 100, 19, 977, -562, 463, -9, 287, 49 };
         int min, max;
         min = max = nums[0];

         for (int vet : nums) {
            if(vet < min)
  	            min = vet;
            if(vet > max) 
	           max = vet;
        }
        
        System.out.println("Min e Max: " + min + " " + max);
    }
}