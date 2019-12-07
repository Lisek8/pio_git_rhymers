package edu.kis.vh.nursery;

/**
 * FIFO Rhymer class
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    /**
     * DefaultCountingOutRhymer used as a base for FIFORhymer
     */
    private DefaultCountingOutRhymer temporaryRhymer = new DefaultCountingOutRhymer();

    /**
     * Reimplementation of countOut method from DefaultCountingOutRhymer
     * @return last inputed number or -1 if stack is empty
     */
    @Override
    public int countOut() {
        while (!callCheck())

            temporaryRhymer.countIn(super.countOut());

        int ret = temporaryRhymer.countOut();

        while (!temporaryRhymer.callCheck())

            countIn(temporaryRhymer.countOut());

        return ret;
    }
}
