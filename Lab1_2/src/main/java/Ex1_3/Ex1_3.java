package Ex1_3;
import java.util.Random;

public class Ex1_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(100);
        }

        for (int i = 0; i < array.length - 1; ++i) {
            for (int j = i + 1; j < array.length; ++j) {
                if (array[j] < array[i]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }

        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
    }
}
