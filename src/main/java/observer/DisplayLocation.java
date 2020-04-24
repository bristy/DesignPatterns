package observer;

public class DisplayLocation implements IUpdateLocation {
    @Override
    public void update(Location newLocation) {
        System.out.println(newLocation.toString());
    }

    public DisplayLocation(LocationFetcherService service) {
        service.register(this);
    }
}
