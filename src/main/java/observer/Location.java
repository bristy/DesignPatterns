package observer;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Location {
    private double longitude;
    private double latitude;
}
