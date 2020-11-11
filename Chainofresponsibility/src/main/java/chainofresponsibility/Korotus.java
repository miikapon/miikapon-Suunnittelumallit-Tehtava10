package chainofresponsibility;

public abstract class Korotus {

    protected static final double BASE = 1000;
    private Korotus successor;

    public void setSuccessor(Korotus successor) {
        this.successor = successor;
    }

    public void processPyyntö(KorotusPyyntö pyyntö) {
        if (successor != null) {
            successor.processPyyntö(pyyntö);
        }
    }
}
