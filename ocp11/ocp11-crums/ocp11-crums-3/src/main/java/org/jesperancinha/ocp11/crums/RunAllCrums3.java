package org.jesperancinha.ocp11.crums;

import org.jesperancinha.console.consolerizer.Consolerizer;
import org.jesperancinha.ocp11.crums.crum1.Crum1;
import org.jesperancinha.ocp11.crums.crum10.Crum10;
import org.jesperancinha.ocp11.crums.crum11.Crum11;
import org.jesperancinha.ocp11.crums.crum12.Crum12;
import org.jesperancinha.ocp11.crums.crum13.Crum13;
import org.jesperancinha.ocp11.crums.crum14.Crum14;
import org.jesperancinha.ocp11.crums.crum15.Crum15;
import org.jesperancinha.ocp11.crums.crum16.Crum16;
import org.jesperancinha.ocp11.crums.crum17.Crum17;
import org.jesperancinha.ocp11.crums.crum18.Crum18;
import org.jesperancinha.ocp11.crums.crum19.Crum19;
import org.jesperancinha.ocp11.crums.crum2.Crum2;
import org.jesperancinha.ocp11.crums.crum20.Crum20;
import org.jesperancinha.ocp11.crums.crum21.Crum21;
import org.jesperancinha.ocp11.crums.crum3.Crum3;
import org.jesperancinha.ocp11.crums.crum4.Crum4;
import org.jesperancinha.ocp11.crums.crum5.Crum5;
import org.jesperancinha.ocp11.crums.crum6.Crum6;
import org.jesperancinha.ocp11.crums.crum7.Crum7;
import org.jesperancinha.ocp11.crums.crum8.Crum8;
import org.jesperancinha.ocp11.crums.crum9.Crum9;

import java.io.IOException;
import java.util.Arrays;

public class RunAllCrums3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Consolerizer.typingWaitGlobal = 0;
        Consolerizer.maxLineCharsGlobal = 150;
        Consolerizer.titleSpread = 150;
        Consolerizer.blackAndWhite = Arrays.asList(args)
            .contains("-bw");

        Crum1.main(args);
        Crum2.main(args);
        Crum3.main(args);
        Crum4.main(args);
        Crum5.main(args);
        Crum6.main(args);
        Crum7.main(args);
        Crum8.main(args);
        Crum9.main(args);
        Crum10.main(args);
        Crum11.main(args);
        Crum12.main(args);
        Crum13.main(args);
        Crum14.main(args);
        Crum15.main(args);
        Crum16.main(args);
        Crum17.main(args);
        Crum18.main(args);
        Crum19.main(args);
        Crum20.main(args);
        Crum21.main(args);
    }
}