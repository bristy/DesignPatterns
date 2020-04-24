package adapter;

public class GrabTaxiRequestBuildeImpl implements IBookingRequestBuilder {
    @Override
    public BookingRequest build() {
        return new GrabRequestBuilder().grabRequest();
    }
}
