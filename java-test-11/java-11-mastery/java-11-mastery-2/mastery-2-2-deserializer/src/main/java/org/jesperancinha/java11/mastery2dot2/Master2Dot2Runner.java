package org.jesperancinha.java11.mastery2dot2;

import org.jesperancinha.console.consolerizer.Consolerizer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import static org.jesperancinha.console.consolerizer.Consolerizer.printBlueGenericLn;
import static org.jesperancinha.console.consolerizer.Consolerizer.printGreenGenericLn;
import static org.jesperancinha.console.consolerizer.Consolerizer.printRainbowLn;
import static org.jesperancinha.console.consolerizer.Consolerizer.printRainbowTitleLn;
import static org.jesperancinha.console.consolerizer.Consolerizer.printYellowGeneric;

public class Master2Dot2Runner {
    public static void main(String[] args) {

        Consolerizer.typingWaitGlobal = 0;

        printBlueGenericLn("================== Master Module mastery-2-2-deserializer ==================");

        printRainbowTitleLn("1. Serializing `FileOutputStream` and `FileInputStream`");
        printRainbowLn("==");
        printYellowGeneric("### Creating Apollo 13 Mission but missing a few details\n");
        String fileName = "/tmp/destination";
        try (var fileInputStream = new FileInputStream(fileName);
             var objectInputStream = new ObjectInputStream(fileInputStream)) {
            var missionData = (MissionData) objectInputStream.readObject();
            printGreenGenericLn("File has been read from this location -> %s", fileName);
            printGreenGenericLn("Data -> %s", missionData);
            printGreenGenericLn("Please run module %s to realize that default fields are read with Java default values and not the assigned ones,\nif they are not part of the serialized data", "mastery-2-2-deserializer");
            printGreenGenericLn("A new data would look like this -> %s", new MissionData());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}