package chainofresponsibility;

public class Toimitusjohtaja extends Korotus {

    private final double ALLOWABLE = 1 * BASE;

    public void processPyyntö(KorotusPyyntö pyyntö) {
        if (pyyntö.getMäärä() < ALLOWABLE) {
            System.out.println("Johtaja hyväksyy: " + pyyntö.getMäärä() + ":n palkankorotuksen.");
        } else {
            System.out.println(pyyntö.getMäärä() + ":n korotus evätään.");
        }
    }
}
