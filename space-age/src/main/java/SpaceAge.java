class SpaceAge {
    public static final double SECONDS_IN_A_EARTH_YEAR=31557600;
    double seconds;
    double spaceAge;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        spaceAge = getSeconds() / SECONDS_IN_A_EARTH_YEAR;
        return spaceAge;
    }

    double onMercury() {
        spaceAge = getSeconds() / (0.2408467 * SECONDS_IN_A_EARTH_YEAR);
        return spaceAge;
    }

    double onVenus() {
        spaceAge = getSeconds() / (0.61519726 * SECONDS_IN_A_EARTH_YEAR);
        return spaceAge;
    }

    double onMars() {
        spaceAge = getSeconds() / (1.8808158 * SECONDS_IN_A_EARTH_YEAR);
        return spaceAge;

    }

    double onJupiter() {
        spaceAge = getSeconds() / (11.862615 * SECONDS_IN_A_EARTH_YEAR);
        return spaceAge;

    }

    double onSaturn() {
        spaceAge = getSeconds() / (29.447498 * SECONDS_IN_A_EARTH_YEAR);
        return spaceAge;

    }

    double onUranus() {
        spaceAge = getSeconds() / (84.016846 * SECONDS_IN_A_EARTH_YEAR);
        return spaceAge;

    }

    double onNeptune() {
        spaceAge = getSeconds() / (164.79132 * SECONDS_IN_A_EARTH_YEAR);
        return spaceAge;

    }

}
