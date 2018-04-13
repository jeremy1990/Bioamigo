import com.bioamigo.molecular.SubatomicParticle;
import org.junit.Assert;
import org.junit.Test;

public class SubatomicParticleTest {
    @Test
    public void testName() {
        Assert.assertEquals("proton", SubatomicParticle.PROTON.name());
        Assert.assertEquals("neutron", SubatomicParticle.NEUTRON.name());
        Assert.assertEquals("electron", SubatomicParticle.ELECTRON.name());
    }

    @Test
    public void testSymbol() {
        Assert.assertEquals("p", SubatomicParticle.PROTON.symbol());
        Assert.assertEquals("n", SubatomicParticle.NEUTRON.symbol());
        Assert.assertEquals("e", SubatomicParticle.ELECTRON.symbol());
    }

    @Test
    public void testMass() {
        Assert.assertEquals(1.007276466879,
                SubatomicParticle.PROTON.mass(), 1E-6);
        Assert.assertEquals(1.00866491588,
                SubatomicParticle.NEUTRON.mass(), 1E-6);
        Assert.assertEquals(0.000548579909070,
                SubatomicParticle.ELECTRON.mass(), 1E-6);
    }

    @Test
    public void testCharge() {
        Assert.assertEquals(1, SubatomicParticle.PROTON.charge());
        Assert.assertEquals(0, SubatomicParticle.NEUTRON.charge());
        Assert.assertEquals(-1, SubatomicParticle.ELECTRON.charge());
    }

    @Test
    public void testToString() {
        Assert.assertEquals("(name=proton,symbol=p,mass=1.007276,charge=1)",
                SubatomicParticle.PROTON.toString());
        Assert.assertEquals("(name=neutron,symbol=n,mass=1.008665,charge=0)",
                SubatomicParticle.NEUTRON.toString());
        Assert.assertEquals("(name=electron,symbol=e,mass=0.000549,charge=-1)",
                SubatomicParticle.ELECTRON.toString());
    }

    @Test
    public void testEquals() {
        Assert.assertFalse(SubatomicParticle.PROTON.equals(
                SubatomicParticle.NEUTRON));
        Assert.assertFalse(SubatomicParticle.ELECTRON.equals(null));
        Assert.assertFalse(SubatomicParticle.NEUTRON.equals("neutron"));
        Assert.assertTrue(SubatomicParticle.PROTON.equals(
                SubatomicParticle.PROTON));
    }

    @Test
    public void testHashCode() {
        Assert.assertNotEquals(SubatomicParticle.PROTON.hashCode(),
                SubatomicParticle.NEUTRON.hashCode());
        Assert.assertNotEquals(SubatomicParticle.NEUTRON.hashCode(),
                SubatomicParticle.ELECTRON.hashCode());
    }
}
