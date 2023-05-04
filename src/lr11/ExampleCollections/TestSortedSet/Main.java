package lr11.ExampleCollections.TestSortedSet;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    private static final int NUM_ELEMENTS = 19_000_000;
    private static final long NUM_OPERATION = 1_000_000_000L;//недостаточно памяти для реализации
    private static final Random RAND = new Random();
    public static void main(String[] args) {
        System.out.println("Тест добавления элементов SortedSet");
        SortedSet<Integer> set = new TreeSet<>();
        SortedSet<Integer> set2 = new TreeSet<>();
        SortedSet<Integer> set3 = new TreeSet<>();
        //
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            set.add(0);
        }
        long endTime1 = System.currentTimeMillis();
        long totalTime1 = endTime1 - startTime1;
        System.out.println("Время добавления элементов в начало : "
                + totalTime1 + " ms");
        //
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            set.add(set.size());
        }
        long endTime2 = System.currentTimeMillis();
        long totalTime2 = endTime2 - startTime2;
        System.out.println("Время добавления элементов в конец : "
                + totalTime2 + " ms");
        //
        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS/2; i++) {
            set.add(set.size()/2);
            set.add(set.size()/2);
        }
        long endTime3 = System.currentTimeMillis();
        long totalTime3 = endTime3 - startTime3;
        System.out.println("Время добавления элементов в середину : "
                + totalTime3 + " ms");
        //
        long startTime4 = System.currentTimeMillis();
        while (!set.isEmpty()) {
            set.remove(set.first());
        }
        long endTime4 = System.currentTimeMillis();
        long totalTime4 = endTime4 - startTime4;
        System.out.println("Время удаления элементов с начала : "
                + totalTime4+ " ms");
        //
        long startTime5 = System.currentTimeMillis();
        while (!set.isEmpty()) {
            set.remove(set.last());
        }
        long endTime5 = System.currentTimeMillis();
        long totalTime5 = endTime5 - startTime5;
        System.out.println("Время удаления элементов с конца : "
                + totalTime5 + " ms");
        //
        set = null;
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            set2.add(0);
        }
        //
        long startTime6 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS ; i++) {
            set2.remove(set2.size()/2);
        }
        long endTime6 = System.currentTimeMillis();
        System.out.println("Время для удаления элементов из середины : "
                + (endTime6 - startTime6) + "ms");
        //
        set2 = null;
        for (int i = 0; i < (int)NUM_OPERATION; i++) {
            set3.add(0);
        }
        //
        long startTime7 = System.currentTimeMillis();
        int key = RAND.nextInt((int)NUM_OPERATION);
        for (int i = 0; i < NUM_OPERATION; i++) {
            set3.contains(key);
            }
        long endTime7 = System.currentTimeMillis();
        System.out.println("Время для получения элемента по индексу :"
        +(endTime7 - startTime7) + "ms");
    }
}