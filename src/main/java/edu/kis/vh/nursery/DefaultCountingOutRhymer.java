package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int STACK_SIZE = 12;
    public static final int EMPTY_STACK_VALUE = -1;
    public static final int IS_FULL = 11;
    final private int[] numbers = new int[STACK_SIZE];

    private int total = -1;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK_VALUE;
    }

    public boolean isFull() {
        return total == IS_FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total--];
    }
}
