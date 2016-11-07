
public class MaxPositiveNum {
    public static void main(String[] args) {
        int[] array = {9,2,3,4,5,6,7,8,9,0};
        int max = 0;
        for (int num : array) {
            if (num > 0 && max < num) {
                max = num;
            }
        }

        System.out.println(max);

    }
}
