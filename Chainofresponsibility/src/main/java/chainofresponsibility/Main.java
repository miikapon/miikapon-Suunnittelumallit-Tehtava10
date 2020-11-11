package chainofresponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        LähiEsimies a = new LähiEsimies();
        YksikönPäällikkö s = new YksikönPäällikkö();
        Toimitusjohtaja d = new Toimitusjohtaja();
        a.setSuccessor(s);
        s.setSuccessor(d);

        try {
            while (true) {
                System.out.println("Palkka on 2500e");
                System.out.println("Syötä määrä tarkistaaksesi kenen täytyy hyväksyä palkankorotuspyyntösi.");
                System.out.println(">");
                double f = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                a.processPyyntö(new KorotusPyyntö(f));
                System.out.println("");
            }
        } catch (Exception e) {
            System.exit(1);
        }

    }

}
