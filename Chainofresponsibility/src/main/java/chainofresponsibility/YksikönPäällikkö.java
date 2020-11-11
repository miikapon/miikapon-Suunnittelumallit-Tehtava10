package chainofresponsibility;

public class YksikönPäällikkö extends Korotus {

    private final double ALLOWABLE = 0.05 * BASE;

    public void processPyyntö(KorotusPyyntö pyyntö) {
        if (pyyntö.getMäärä() < ALLOWABLE) {
            System.out.println("Päällikkö hyväksyy: " + pyyntö.getMäärä() + ":n palkankorotuksen.");
        } else {
            super.processPyyntö(pyyntö);
        }
    }
}
