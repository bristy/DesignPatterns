package observer;

import lombok.NonNull;

public interface IUpdateLocation {
    void update(@NonNull Location newLocation);
}
