package factory.cabaggregator;

import factory.cabaggregator.ola.OlaMiniCab;
import factory.cabaggregator.ola.OlaSedanCab;

public class OlaICabTypeFactory implements ICabProviderFactory {

    @Override
    public IMiniCab mini() {
        return new OlaMiniCab();
    }

    @Override
    public ISedanCab sedan() {
        return new OlaSedanCab();
    }
}
