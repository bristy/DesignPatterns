package adapter;

public class OlaUberBookingRequestBuilder implements IBookingRequestBuilder {
    @Override
    public BookingRequest build() {
        return BookingRequest.builder().build();
    }
}
