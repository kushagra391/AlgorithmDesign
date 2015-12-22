package arrays;/* Authored by Kushagra on 12/19/2015. */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedArraysDemo {

    public static void main(String[] args) {

        int[][] A = {{2, 6, 12, 34},
                {1, 9, 20, 1000},
                {23, 34, 90, 2000}};

        int k = A.length;

        List<Integer> R = mergeKSortedArrays(A);
        System.out.println(R.toString());

    }

    private static List<Integer> mergeKSortedArrays(int[][] A) {

        int k = A.length;
        PriorityQueue<HeapEntry> minHeap = new PriorityQueue<>(
                (Comparator<HeapEntry>) (h1, h2) -> {
                    int key1 = h1.getKey();
                    int key2 = h2.getKey();

                    if (key1 < key2) return -1;
                    if (key1 > key2) return 1;
                    else return 0;
                });


        // Add first column
        for (int i = 0; i < k; i++) {
            int colIndex = 0;
            HeapEntry entry = new HeapEntry()
                    .setKey(A[i][colIndex])
                    .setRowIndex(i)
                    .setColIndex(colIndex);
            minHeap.add(entry);
        }

        // * add and remove entries
        List<Integer> list = new ArrayList<>();
        while (!minHeap.isEmpty()) {

            HeapEntry minElement = minHeap.poll();
            list.add(minElement.getKey());

            HeapEntry nextElement = getNextElement(A, minElement);
            if (nextElement != null)
                minHeap.add(nextElement);
        }

        return list;
    }

    private static HeapEntry getNextElement(int[][] A, HeapEntry entry) {

        int maxCol = A[0].length - 1;

        int currentRow = entry.rowIndex;
        int currentCol = entry.colIndex;

        if (currentCol + 1 == maxCol)
            return null;
        else {
            return new HeapEntry()
                    .setKey(A[currentRow][currentCol + 1])
                    .setColIndex(currentCol + 1)
                    .setRowIndex(currentRow);
        }
    }

    static class HeapEntry {

        private int key;
        private int rowIndex;
        private int colIndex;

        HeapEntry() {
            // empty constructor
        }

        public HeapEntry setKey(int key) {
            this.key = key;
            return this;
        }

        public HeapEntry setRowIndex(int index) {
            this.rowIndex = index;
            return this;
        }

        public HeapEntry setColIndex(int colIndex) {
            this.colIndex = colIndex;
            return this;
        }

        public int getKey() {
            return this.key;
        }
    }


}
