package pl.hotels.remote.rest.dto.request;

import pl.hotels.remote.rest.dto.common.PersonOrderDto;
import pl.hotels.remote.rest.dto.common.ReservationDto;

import java.util.List;

public class AddReservationDto {
    private Integer id;
    private String status;
    private List<ReservationDto> hotels;
    private PersonOrderDto person;

    public AddReservationDto(Integer id, String status, List<ReservationDto> hotels, PersonOrderDto person) {
        this.id = id;
        this.status = status;
        this.hotels = hotels;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
