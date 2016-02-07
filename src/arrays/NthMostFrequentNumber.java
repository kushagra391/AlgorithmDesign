package arrays;/* Authored by Kushagra on 2/7/2016. */

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class NthMostFrequentNumber {
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        int k = 2;
        System.out.println(nthMostFrequentNumber(A, k));
    }

    @SuppressWarnings("UnnecessaryLocalVariable")
    private static int nthMostFrequentNumber(int[] A, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : A) {
            if (!map.containsKey(x)) {
                map.put(x, 1);
            }
            else {
                int count = map.get(x);
                map.put(x, count + 1);
            }
        }

        HeapNodeComparator nodeComparator = new HeapNodeComparator();
        PriorityQueue<HeapNode> maxHeap = new PriorityQueue<>(nodeComparator);

        for (int x : map.keySet()) {

            int key = x;
            int count = map.get(key);

            maxHeap.add(new HeapNode(key, count));
        }

        int nthLargest = -1;
        for (int i=0; i<k; i++) {
            nthLargest = maxHeap.poll().key;
        }

        return nthLargest;
    }

    static class HeapNode {
        int key;
        int count;

        // constructor
        HeapNode(int key, int count) {
            this.key = key;
            this.count = count;
        }
    }

    // Comparator class
    static class HeapNodeComparator implements Comparator<HeapNode> {

        @Override
        public int compare(HeapNode h1, HeapNode h2) {
            return h2.count - h1.count;
        }
    }
}
