
public class Max {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (max > array[i]){
                max = array[i];

            }
        }System.out.println("Maximal "+ max);
    }
}
