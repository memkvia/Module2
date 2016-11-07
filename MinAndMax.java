import java.util.Arrays;

public class MinAndMax {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("Min "+ min);
        System.out.println("Max "+ max);
    }
}
