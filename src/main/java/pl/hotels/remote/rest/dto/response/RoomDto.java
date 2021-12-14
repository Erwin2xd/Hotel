package pl.hotels.remote.rest.dto.response;

public class RoomDto {
    private Integer id;
    private String beds;
    private Float price;

    public RoomDto(Integer id, String beds, Float price) {
        this.id = id;
        this.beds = beds;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBeds() {
        return beds;
    }

    public void setBeds(String beds) {
        this.beds = beds;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
