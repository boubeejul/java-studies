package Arrays;

public class Main {
    public static void main(String[] args) {
        
        int nums[] = {1,2,3,4};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // dinamic array, initiate with 0s
        int nums2[] = new int[4];
        nums2[3] = 1;
        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }

        // array of arrays
        int nums3[][] = {{1,2,3,4},{1,2,3,4}};
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums3[i].length; j++) {
                System.out.println(nums3[i][j]);
            }
        }

        for (int i[]: nums3) {
            for (int j: i) {
                System.out.println(j);
            }
        }

        // jagged array -> don't know the number of columns yet
        int nums4[][] = new int[3][];

        nums4[0] = new int[2];
        nums4[1] = new int[3];
        nums4[2] = new int[4];

        for (int i[]: nums4) {
            for (int j: i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
