package se.lugosoft.bottleriddle.manager;

import se.lugosoft.bottleriddle.model.Bottle;

public class BottleManager {
    public void fill(final Bottle bottle) {
        bottle.setCurrentVolume(bottle.getMaxVolume());
    }

    public void empty(final Bottle bottle) {
        bottle.setCurrentVolume(0);
    }

    public void pour(final Bottle source, final Bottle destination) {
        int volumeToPour = calculateVolumeToPour(source, destination);

        source.setCurrentVolume(source.getCurrentVolume() - volumeToPour);

        if (destination.getMaxVolume() <= destination.getCurrentVolume() + volumeToPour) {
            destination.setCurrentVolume(destination.getMaxVolume());
        } else {
            destination.setCurrentVolume(destination.getCurrentVolume() + volumeToPour);
        }
    }

    private static int calculateVolumeToPour(final Bottle source, final Bottle destination) {
        final int spaceInDestination = destination.getMaxVolume() - destination.getCurrentVolume();

        if (source.getCurrentVolume() > spaceInDestination) {
            return spaceInDestination;
        }
        return source.getCurrentVolume();
    }

}


