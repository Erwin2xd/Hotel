package pl.hotels.remote.rest.dto.response;

import pl.hotels.remote.rest.dto.request.AddReservationDto;

import java.util.List;

public class ReservationStatusDto {
    private List<AddReservationDto> reservations;

    public ReservationStatusDto(List<AddReservationDto> reservations) {
        this.reservations = reservations;
    }

    public List<AddReservationDto> getReservations() {
        return reservations;
    }

    public void setReservations(List<AddReservationDto> reservations) {
        this.reservations = reservations;
    }
}
