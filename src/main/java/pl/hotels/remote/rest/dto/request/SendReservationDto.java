package pl.hotels.remote.rest.dto.request;

import pl.hotels.remote.rest.dto.common.PersonOrderDto;
import pl.hotels.remote.rest.dto.common.ReservationDto;

import java.util.List;

public class SendReservationDto {
    private List<ReservationDto> hotels;
    private PersonOrderDto person;

    public SendReservationDto(List<ReservationDto> hotels, PersonOrderDto person) {
        this.hotels = hotels;
        this.person = person;
    }

    public List<ReservationDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<ReservationDto> hotels) {
        this.hotels = hotels;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }
}
