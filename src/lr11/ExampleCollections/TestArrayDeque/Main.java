package lr11.ExampleCollections.TestArrayDeque;
import java.util.Random;
import java.util.ArrayDeque;

public class Main {
    private static final int NUM_ELEMENTS = 19_000_000;
    private static final long NUM_OPERATION = 1_000_000_000L;//Метод не определен
    private static final Random RAND = new Random();

    public static void main(String[] args) {
        System.out.println("Тест добавления элементов ArrayDeque");
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        //
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            deque.addFirst(i);
        }
        long endTime1 = System.currentTimeMillis();
        long totalTime1 = endTime1 - startTime1;
        System.out.println("Время добавления элементов в начало : "
                + totalTime1 + " ms");
        //
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            deque.addLast(i);
        }
        long endTime2 = System.currentTimeMillis();
        long totalTime2 = endTime2 - startTime2;
        System.out.println("Время добавления элементов в конец : "
                + totalTime2 + " ms");
        //
        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS / 2; i++) {
            deque.addFirst(i);
        }
        long endTime3 = System.currentTimeMillis();
        long totalTime3 = endTime3 - startTime3;
        System.out.println("Время добавления элементов в середину : "
                + totalTime3 + " ms");
        //
        long startTime4 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS ; i++) {
            deque.removeFirst();
        }
        long endTime4 = System.currentTimeMillis();
        long totalTime4 = endTime4 - startTime4;
        System.out.println("Время удаления элементов с начала : "
                + totalTime4 + " ms");
        //
        long startTime5 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS ; i++) {
            deque.removeLast();
        }
        long endTime5 = System.currentTimeMillis();
        long totalTime5 = endTime5 - startTime5;
        System.out.println("Время удаления элементов с конца : "
                + totalTime5 + " ms");
        //
        long startTime6 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS  ; i++) {
            deque.remove(deque.size()/2);
        }
        long endTime6 = System.currentTimeMillis();
        System.out.println("Время для удаления элементов из середины : "
                + (endTime6 - startTime6) + "ms");
    }
}
