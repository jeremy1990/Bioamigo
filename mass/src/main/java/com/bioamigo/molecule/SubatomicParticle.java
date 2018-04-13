package com.bioamigo.molecule;

/**
 * Proton, neutron and electron are three subatomic particles which share
 * the same objects for all consumptions in this molecule world. These
 * three objects are created as the program runs.
 */
public final class SubatomicParticle implements Particle {
    /**
     * The mass and name are from
     * <a href="http://physics.nist.gov/constants">CODATA</a>.
     */
    public static final SubatomicParticle PROTON = new SubatomicParticle(
            "proton", "p", 1.007276466879, 1);
    /**
     * The mass and name are from
     * <a href="http://physics.nist.gov/constants">CODATA</a>.
     */
    public static final SubatomicParticle NEUTRON = new SubatomicParticle(
            "neutron", "n", 1.00866491588, 0);
    /**
     * The mass and name are from
     * <a href="http://physics.nist.gov/constants">CODATA</a>.
     */
    public static final SubatomicParticle ELECTRON = new SubatomicParticle(
            "electron", "e", 0.000548579909070, -1);

    private String name;
    private String symbol;
    private double mass;
    private int charge;

    /*
     * Do not change the accessibility. Changing it could turn the whole world
     * upside down.
     */
    private SubatomicParticle(final String name,
                              final String symbol,
                              final double mass,
                              final int charge) {
        this.name = name;
        this.symbol = symbol;
        this.mass = mass;
        this.charge = charge;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String symbol() {
        return symbol;
    }

    @Override
    public double mass() {
        return mass;
    }

    @Override
    public int charge() {
        return charge;
    }

    @Override
    public String toString() {
        return String.format("(name=%s,symbol=%s,mass=%.6f,charge=%d)",
                name, symbol, mass, charge);
    }

    @Override
    public boolean equals(final Object obj) {
        return obj != null && obj instanceof SubatomicParticle
                && hashCode() == obj.hashCode();
    }

    @Override
    @SuppressWarnings("checkstyle:magicnumber")
    public int hashCode() {
        int result = 0;
        result = 31 * result + name.hashCode();
        result = 31 * result + symbol.hashCode();
        result = 31 * result + (int) Double.doubleToLongBits(mass);
        result = 31 * result + charge;
        return result;
    }
}
