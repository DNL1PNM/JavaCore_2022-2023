package lr11.ExampleCollections.TestSortedMap;
import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    private static final int NUM_ELEMENTS = 19_000_000;
    private static final long NUM_OPERATION = 1_000_000_000L;//недостаточно памяти для реализации

    private static final Random RAND = new Random();

    public static void main(String[] args) {

        System.out.println("Тест добавления элементов SortedMap с использованием класса TreeMap в качестве его реализации");
        SortedMap<Integer, Integer> treeMap = new TreeMap<>();
        SortedMap<Integer, Integer> treeMap2 = new TreeMap<>();
        SortedMap<Integer, Integer> treeMap3 = new TreeMap<>();
        //
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            int key = RAND.nextInt(NUM_ELEMENTS);
            treeMap.put(i, key);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время, затраченное на добавление элементов в начало : "
                + (endTime - startTime) + "ms");
        //
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            int key = RAND.nextInt(NUM_ELEMENTS);
            treeMap.put(i, key);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Время, затраченное на добавление элементов в конец: "
                + (endTime1 - startTime1) + "ms");
        //
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            int key = RAND.nextInt(NUM_ELEMENTS);
            treeMap.put(NUM_ELEMENTS / 2 + i, key);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Время, затраченное на добавление элементов в cередину: "
                + (endTime2 - startTime2) + "ms");
        //
        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            treeMap.remove(i);
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("Время, затраченное на удаление элементов с начала : "
                + (endTime3 - startTime3) + "ms");
        //
        long startTime4 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            treeMap.remove(i);
        }
        long endTime4 = System.currentTimeMillis();
        System.out.println("Время, затраченное на удаление элементов с конца : "
                + (endTime4 - startTime4) + "ms");
        //
        treeMap = null;
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            int key = RAND.nextInt(NUM_ELEMENTS);
            treeMap2.put(i, key);
        }
        //
        long startTime5 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            int key = (NUM_ELEMENTS / 2);
            treeMap2.remove(key);
        }
        long endTime5 = System.currentTimeMillis();
        System.out.println("Время удаления элемента из середины : "
                + (endTime5 - startTime5) + "ms");
        //
        treeMap2 = null;
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            int key = RAND.nextInt((int)NUM_ELEMENTS);
            treeMap3.put(i, key);
        }
        //
        long startTime6 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            int key = RAND.nextInt((int) NUM_ELEMENTS);
            treeMap3.get(key);
        }
        long endTime6 = System.currentTimeMillis();
        System.out.println("Время получения элемента по индексу : "
                + (endTime6 - startTime6) + "ms");
    }
}