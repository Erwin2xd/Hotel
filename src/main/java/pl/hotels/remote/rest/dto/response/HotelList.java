package pl.hotels.remote.rest.dto.response;

import java.util.List;

public class HotelList {
    private List<HotelDto> hotels;

    public HotelList(List<HotelDto> hotels) {
        this.hotels = hotels;
    }

    public List<HotelDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelDto> hotels) {
        this.hotels = hotels;
    }
}
