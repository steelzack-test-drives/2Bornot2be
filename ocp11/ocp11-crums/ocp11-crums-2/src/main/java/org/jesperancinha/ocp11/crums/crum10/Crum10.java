package org.jesperancinha.ocp11.crums.crum10;

import java.util.Arrays;

import static org.jesperancinha.console.consolerizer.Consolerizer.printBlueGenericTitleLn;
import static org.jesperancinha.console.consolerizer.Consolerizer.printGreenGenericLn;
import static org.jesperancinha.console.consolerizer.Consolerizer.printMagentaGenericLn;

public class Crum10 {
    public static void main(String[] args) {
        printBlueGenericTitleLn("Crum 10 - compare and mismatch in arrays");

        final int a[] = new int[] { 1, 4, 5, 6 };
        final int[] b = new int[] { 1, 2, 5, 6, 7, 8 };
        final int c[] = new int[] { 1 };
        final int d[] = new int[] { 1, 4, 5, 6, 8, 10 };
        final int[] e = new int[] { 1, 4, 5, 8, 8, 10 };

        printMagentaGenericLn("The result of comparing a with b should be 1 => %d", Arrays.compare(a, b));
        printMagentaGenericLn("The result of comparing a with c should be 3 => %d", Arrays.compare(a, c));
        printMagentaGenericLn("The result of comparing a with d should be -2 => %d", Arrays.compare(a, d));
        printMagentaGenericLn("The result of comparing a with e should be -1 => %d", Arrays.compare(a, e));

        printMagentaGenericLn("The result of mismatching a with b should be 1 => %d", Arrays.mismatch(a, b));
        printMagentaGenericLn("The result of mismatching a with c should be 1 => %d", Arrays.mismatch(a, c));
        printMagentaGenericLn("The result of mismatching a with d should be 4 => %d", Arrays.mismatch(a, d));
        printMagentaGenericLn("The result of mismatching a with e should be 3 => %d", Arrays.mismatch(a, e));

        printGreenGenericLn("Rules to make comparison aren't too simple");
        printGreenGenericLn("Best  way to describe is, if all prefixes match, then the return value is the difference between the first size and the second size.");
        printGreenGenericLn("If one element differs, then the return value is the compareTo result of the two integers.");
        printGreenGenericLn("Mismatch returns the insertion point of the first element where a mismatch occurs.");
        printGreenGenericLn("If all prefixes match, then it returns the size of the smallest array.");
    }
}