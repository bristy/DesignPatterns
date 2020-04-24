package factory;

import factory.cabaggregator.CabProviders;
import factory.cabaggregator.FactoryGenerator;
import factory.cabaggregator.ICabProviderFactory;
import org.junit.Assert;
import org.junit.Test;

public class FactoryTest {

    @Test
    public void testUber() {
        ICabProviderFactory factory = FactoryGenerator.getFactory(CabProviders.UBER);
        Assert.assertEquals("ubermini", factory.mini().book());
        Assert.assertEquals("ubersedan", factory.sedan().book());
    }

    @Test
    public void testOla() {
        ICabProviderFactory factory = FactoryGenerator.getFactory(CabProviders.OLA);
        Assert.assertEquals("olamini", factory.mini().book());
        Assert.assertEquals("olasedan", factory.sedan().book());
    }
}
