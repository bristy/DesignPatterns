package adapter;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class BookingRequest {

    @Builder.Default
    private String requestId = "id";
    @Builder.Default
    private String type = "olauber";
}
