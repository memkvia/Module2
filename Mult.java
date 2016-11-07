
public class Mult {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        int product = 1;
        for (int number : array)
            product *= number;
        System.out.println(product);
    }
}
