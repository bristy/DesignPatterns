package observer;

import lombok.NonNull;

import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

public class LocationFetcherService {

    private Set<WeakReference<IUpdateLocation>> locationSet = new HashSet<>();

    public void register(@NonNull IUpdateLocation updateLocation) {
        locationSet.add(new WeakReference<>(updateLocation));
    }

    public void deregister(@NonNull IUpdateLocation remove) {
        for(WeakReference<IUpdateLocation> updateLocation : locationSet) {
            if(updateLocation.get() != null && updateLocation.get().equals(remove)) {
                locationSet.remove(updateLocation);
                break;
            }
        }
    }

    public void dispatchLocation() {
        Location location = Location.builder().longitude(10d).latitude(20d).build();
        updateLocations(location);
    }

    private void updateLocations(Location location) {
        for(WeakReference<IUpdateLocation> updateLocation : locationSet) {
            if(updateLocation.get() != null) {
                updateLocation.get().update(location);
            }
        }
    }

}
