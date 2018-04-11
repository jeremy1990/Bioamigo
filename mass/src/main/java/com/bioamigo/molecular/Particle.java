package com.bioamigo.molecular;

/**
 * In the field of biological study involving mass spectrometer,
 * at the molecular level, proton, neutron, electron are the building blocks
 * of the whole world. To simplify the model, only mass, charge matter the most.
 * Thus, {@code Particle} in this context is not the same one as
 * in particle physics.
 */
public interface Particle {
    /**
     * Get the full name of the particle.
     *
     * @return the full name.
     */
    String name();

    /**
     * Get the abbreviation for the particle.
     *
     * @return the short name.
     */
    String symbol();

    /**
     * Get the mass in Dalton. 1 Dalton is defined as one twelfth of
     * the mass of an unbound neutral atom of carbon-12 in its nuclear
     * and electronic ground state and at rest. See
     * <a href="https://www.bipm.org/utils/common/pdf/si_brochure_8_en.pdf">
     * the International System of Units (SI)</a>.
     *
     * @return mass in Dalton.
     */
    double mass();

    /**
     * Get the charge of the particle.
     *
     * @return charge of the particle.
     */
    int charge();
}
