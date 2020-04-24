package factory.cabaggregator.ola;

import factory.cabaggregator.IMiniCab;

public class OlaMiniCab implements IMiniCab {
    @Override
    public String book() {
        System.out.println("Ola mini is booked.");
        return "olamini";
    }

    @Override
    public double expectedPrice() {
        return 0;
    }
}
