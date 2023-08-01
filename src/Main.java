import java.util.Random;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        for (int i = 1; i < 10; i++) {
            int value = new Random().nextInt(100);
            list1.add(value);
            list2.add(value);
        }

        list1.print();
        list1.revert();
        list1.print();

//        long start1 = System.currentTimeMillis();
//        list1.quickSort();
//        long end1 = System.currentTimeMillis();
//        System.out.printf("Время быстрой сортировки %d миллисекунд\n", end1 - start1);
//
//        long start2 = System.currentTimeMillis();
//        list2.bubbleSort();
//        long end2 = System.currentTimeMillis();
//        System.out.printf("Время сортировки пузырьком %d миллисекунд\n", end2 - start2);
    }
}