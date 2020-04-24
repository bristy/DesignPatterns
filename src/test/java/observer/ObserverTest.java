package observer;

import org.junit.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class ObserverTest {
    @Test
    public void testLocation() {
        LocationFetcherService service = new LocationFetcherService();
        DisplayLocation mockedDisplay = mock(DisplayLocation.class);
        service.register(mockedDisplay);
        service.dispatchLocation();
        verify(mockedDisplay, times(1)).update(any());
    }
}
