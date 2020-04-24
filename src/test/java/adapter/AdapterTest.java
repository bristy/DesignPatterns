package adapter;

import org.junit.Assert;
import org.junit.Test;

public class AdapterTest {
    @Test
    public void adapterOlaUberTest() {
        IBookingRequestBuilder olauber = new OlaUberBookingRequestBuilder();
        BookingRequest olaUberReq = olauber.build();
        Assert.assertEquals("olauber", olaUberReq.getType());
    }

    @Test
    public void adapterGrabTest() {
        IBookingRequestBuilder grab = new GrabTaxiRequestBuildeImpl();
        BookingRequest grabReq = grab.build();
        Assert.assertEquals("grab", grabReq.getType());
    }
}
