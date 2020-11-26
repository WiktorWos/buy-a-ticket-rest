package springresttest.buyaticket.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class BusStop {
    @NotBlank(message = "Please provide a location")
    private String location;

    @NotNull(message = "Please provide a distance from first stop")
    private Integer distanceFromFirstStop;

    @NotNull(message = "Please provide a time from first stop")
    private Integer timeFromFirstStop;

    public BusStop() {
    }

    public BusStop(String location, Integer distanceFromFirstStop, Integer timeFromFirstStop) {
        this.location = location;
        this.distanceFromFirstStop = distanceFromFirstStop;
        this.timeFromFirstStop = timeFromFirstStop;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getDistanceFromFirstStop() {
        return distanceFromFirstStop;
    }

    public void setDistanceFromFirstStop(Integer distanceFromFirstStop) {
        this.distanceFromFirstStop = distanceFromFirstStop;
    }

    public Integer getTimeFromFirstStop() {
        return timeFromFirstStop;
    }

    public void setTimeFromFirstStop(Integer timeFromFirstStop) {
        this.timeFromFirstStop = timeFromFirstStop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusStop)) return false;
        BusStop busStop = (BusStop) o;
        return location.equals(busStop.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }
}