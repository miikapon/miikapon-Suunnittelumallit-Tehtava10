package chainofresponsibility;

public class LähiEsimies extends Korotus {

    private final double ALLOWABLE = 0.02 * BASE;

    public void processPyyntö(KorotusPyyntö pyyntö) {
        if (pyyntö.getMäärä() < ALLOWABLE) {
            System.out.println("Esimies hyväksyy: " + pyyntö.getMäärä() + "e palkankorotuksen.");
        } else {
            super.processPyyntö(pyyntö);
        }
    }
}
