package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private IntArrayStack baseRhymer;

    public DefaultCountingOutRhymer() {
        this.baseRhymer = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(IntArrayStack baseRhymer) {
        this.baseRhymer = baseRhymer;
    }

    public int getTotal() {
        return baseRhymer.getTotal();
    }

    public void countIn(int in) {
        baseRhymer.countIn(in);
    }

    public boolean callCheck() {
        return baseRhymer.callCheck();
    }

    public boolean isFull() {
        return baseRhymer.isFull();
    }

    public int countOut() {
        return baseRhymer.countOut();
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return baseRhymer.getNumbers()[baseRhymer.getTotal()];
    }
}
