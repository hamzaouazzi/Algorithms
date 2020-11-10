package algorithms.datastructures.priorityqueue;

public class MinIndexedBinaryHeap<T extends Comparable<T>> extends MinIndexedDHeap<T> {
    public MinIndexedBinaryHeap(int maxSize) {
        super(2, maxSize);
    }
}
