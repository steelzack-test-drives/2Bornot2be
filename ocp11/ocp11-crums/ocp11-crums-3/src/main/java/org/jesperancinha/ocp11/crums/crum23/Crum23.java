package org.jesperancinha.ocp11.crums.crum23;

import static org.jesperancinha.console.consolerizer.Consolerizer.printBlueGenericTitleLn;
import static org.jesperancinha.console.consolerizer.Consolerizer.printGreenGenericLn;
import static org.jesperancinha.console.consolerizer.Consolerizer.printMagentaGenericLn;
import static org.jesperancinha.console.consolerizer.Consolerizer.printOrangeGenericLn;
import static org.jesperancinha.console.consolerizer.Consolerizer.printYellowGenericLn;

public class Crum23 {
    public static void main(String[] args) {
        printBlueGenericTitleLn("Crum 23 - Parsers return type");

        printMagentaGenericLn("Parsers always return a primitive in their commond method:");

        final byte parB = Byte.parseByte("123");
        final short parS = Short.parseShort("3334");
        final int parI = Integer.parseInt("112223444");
        final long parL = Long.parseLong("23423432422342342");
        final float parF = Float.parseFloat("123");
        final double parD = Double.parseDouble("333444.34343");

        printYellowGenericLn("These are the results:");

        printOrangeGenericLn(parB);
        printOrangeGenericLn(parS);
        printOrangeGenericLn(parI);
        printOrangeGenericLn(parL);
        printOrangeGenericLn(parF);
        printOrangeGenericLn(parD);

        printGreenGenericLn("This is just to show that all different static method parsers of the different java.lang.Number types, all return a primitive");

    }
}
