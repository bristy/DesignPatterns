package decorator;

import factory.cabaggregator.ISedanCab;
import factory.cabaggregator.uber.UberSedabCab;

public abstract class UberPlayCab extends UberSedabCab {
    public abstract double expectedPrice();
}
