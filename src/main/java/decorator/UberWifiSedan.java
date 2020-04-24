package decorator;

import factory.cabaggregator.uber.UberSedabCab;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UberWifiSedan extends UberPlayCab {

    private UberSedabCab uberSedabCab;

    @Override
    public double expectedPrice() {
        return uberSedabCab.expectedPrice() + 100;
    }
}
