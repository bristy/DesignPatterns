package factory.cabaggregator;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class FactoryGenerator {
    public static ICabProviderFactory getFactory(CabProviders type) {
        switch (type) {
            case OLA:
                return new OlaICabTypeFactory();
            case UBER:
                return new UberICabFactory();
            default:
                throw new NotImplementedException();
        }
    }
}
