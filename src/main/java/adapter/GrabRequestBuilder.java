package adapter;

public class GrabRequestBuilder {
    BookingRequest grabRequest() {
        return  BookingRequest.builder().type("grab").build();
    }
}
