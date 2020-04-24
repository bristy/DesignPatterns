package factory.cabaggregator.uber;

import factory.cabaggregator.IMiniCab;

public class UberMiniCab implements IMiniCab {
    @Override
    public String book() {
        System.out.println("Uber mini is booked.");
        return "ubermini";
    }

    @Override
    public double expectedPrice() {
        return 0;
    }
}
