package factory.cabaggregator;

import factory.cabaggregator.uber.UberMiniCab;
import factory.cabaggregator.uber.UberSedabCab;

public class UberICabFactory implements ICabProviderFactory {
    @Override
    public IMiniCab mini() {
        return new UberMiniCab();
    }

    @Override
    public ISedanCab sedan() {
        return new UberSedabCab();
    }
}
