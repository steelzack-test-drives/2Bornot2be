package org.jesperancinha.ocp11.mastery4dot2.show;

import org.jesperancinha.ocp11.mastery4dot2.concert.Band;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;

import static org.jesperancinha.console.consolerizer.Consolerizer.printYellowGenericLn;

public final class CristalBall {

    // Guideline 6-5 / MUTABLE-5: Do not trust identity equality when overridable on input reference objects
    private static final Map<PrivateKey, CristalBall> cristalBalls = new WeakHashMap<>();

    // Guideline 6-1 / MUTABLE-1: Prefer immutability for value types
    private final String host;

    // Guideline 6-1 / MUTABLE-1: Prefer immutability for value types
    private final LocalDate localDate;

    // Guideline 6-1 / MUTABLE-1: Prefer immutability for value types
    private final LocalDateTime localDateTime;

    private final Date date;

    private final Band band;

    private final PrivateKey priv;

    // Guideline 6-1 / MUTABLE-1: Prefer immutability for value types
    // Guideline 6-2 / MUTABLE-2: Create copies of mutable output values
    // Guideline 6-3 / MUTABLE-3: Create safe copies of mutable and subclassable input values
    // Guideline 6-4 / MUTABLE-4: Support copy functionality for a mutable class
    // Guideline 6-5 / MUTABLE-5: Do not trust identity equality when overridable on input reference objects
    private CristalBall(final String host, final Date date, final Band band) throws NoSuchProviderException, NoSuchAlgorithmException {
        this.host = host;
        this.date = (Date) date.clone();
        this.band = new Band(band.getMembers(), band.getBandName());
        this.localDate = null;
        this.localDateTime = null;
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA", "SUN");
        KeyPair pair = keyGen.generateKeyPair();
        this.priv = pair.getPrivate();
        printYellowGenericLn("Public key is %s", pair.getPublic());
    }

    public static CristalBall createCristalBall(final String host, final Date date, final Band band) throws NoSuchProviderException, NoSuchAlgorithmException {
        return new CristalBall(host, date, band);
    }

    public String getHost() {
        return host;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    // Guideline 6-2 / MUTABLE-2: Create copies of mutable output values
    public Date getDate() {
        return (Date) date.clone();
    }

    // Guideline 6-2 / MUTABLE-2: Create copies of mutable output values
    // Guideline 6-3 / MUTABLE-3: Create safe copies of mutable and subclassable input values
    public Date getDateSafeCopy() {
        return new Date(date.getTime());
    }

    // Guideline 6-2 / MUTABLE-2: Create copies of mutable output values
    // Guideline 6-3 / MUTABLE-3: Create safe copies of mutable and subclassable input values
    public Band getBand() {
        return new Band(band.getMembers(), band.getBandName());
    }

    // Guideline 6-2 / MUTABLE-2: Create copies of mutable output values
    // Guideline 6-3 / MUTABLE-3: Create safe copies of mutable and subclassable input values
    // Guideline 6-4 / MUTABLE-4: Support copy functionality for a mutable class
    public CristalBall copy() throws NoSuchProviderException, NoSuchAlgorithmException {
        return new CristalBall(host, getDate(), getBand());
    }

    public CristalBall getCristalBall(PrivateKey key){
        return cristalBalls.get(key);
    }
}
