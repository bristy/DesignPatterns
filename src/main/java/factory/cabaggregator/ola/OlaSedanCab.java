package factory.cabaggregator.ola;

import factory.cabaggregator.ISedanCab;

public class OlaSedanCab implements ISedanCab {
    @Override
    public String book() {
        System.out.println("Ola sedan is booked.");
        return "olasedan";
    }

    @Override
    public double expectedPrice() {
        return 0;
    }
}
