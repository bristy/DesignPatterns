package factory.cabaggregator.uber;

import factory.cabaggregator.ISedanCab;

public class UberSedabCab implements ISedanCab {
    @Override
    public String book() {
        System.out.println("Uber sedan is booked.");
        return "ubersedan";
    }

    @Override
    public double expectedPrice() {
        return 0;
    }
}
