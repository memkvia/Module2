
public class SecondLarg {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        int largest = array[0];
        int secondlargest = array[0];
        for (int number : array)
            if (number > largest){
                secondlargest = largest;
                largest = number;

            } else if (number > secondlargest)
                secondlargest = number;
        System.out.println(secondlargest);

    }
}
