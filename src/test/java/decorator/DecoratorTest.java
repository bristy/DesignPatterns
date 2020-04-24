package decorator;

import factory.cabaggregator.uber.UberSedabCab;
import org.junit.Assert;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void uberWifiSedanTest() {
        UberSedabCab uberSedan = new UberSedabCab();
        UberWifiSedan wifiSedan = new UberWifiSedan(uberSedan);
        Assert.assertEquals(100, wifiSedan.expectedPrice(), 0d);
    }
}
