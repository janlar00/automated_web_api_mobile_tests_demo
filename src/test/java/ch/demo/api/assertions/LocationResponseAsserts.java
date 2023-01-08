package ch.demo.api.assertions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.assertj.core.api.AbstractAssert;

import ch.demo.api.models.location.LocationResponse;
import ch.demo.api.models.location.Station;

public class LocationResponseAsserts extends AbstractAssert<LocationResponseAsserts, LocationResponse> {

    public LocationResponseAsserts(final LocationResponse locationResponse, final Class<?> selfType) {
        super(locationResponse, selfType);
    }

    public void hasStationCorrectLatitude() {
        final double THRESHOLD = .0001;
        boolean latitudeCorrect = false;
        List<Station> stations = actual.getStations();
        for (Station tmpStation: stations) {
            if ("Bern 7".equals(tmpStation.getName())) {
                float actualLatitude = tmpStation.getCoordinates().getLatitude();
                float expectedLatitude = 47.787f;
                System.out.println(actualLatitude + " is an actual latitude");
                System.out.println(expectedLatitude + " is an expected latitude");
                if (Math.abs(actualLatitude - expectedLatitude) < THRESHOLD)
                    latitudeCorrect = true;
                }
            }

        if (!latitudeCorrect)
            System.out.println("\u001B[41m" + "Latitude for the test station is not correct" + "\u001B[0m");
        assertTrue(latitudeCorrect);
    }
}

