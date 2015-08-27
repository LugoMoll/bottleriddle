package bottleriddle;

import bottleriddle.model.Bottle;

/**
 * Created by danie_000 on 27/08/2015.
 */
public class Main {
    private static final int BOTTLE_1_VOLUME = 3;
    private static final int BOTTLE_2_VOLUME = 5;
    private static final int[] TARGET_VOLUMES = {1, 4};

    public static void main(String[] args) {
        final BottleRiddleSolver bottleRiddleSolver = new BottleRiddleSolver();

        for (int targetVolume : TARGET_VOLUMES) {
            bottleRiddleSolver.solve(new Bottle(BOTTLE_1_VOLUME), new Bottle(BOTTLE_2_VOLUME), targetVolume);
        }
    }
}