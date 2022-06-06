
import java.util.ArrayList;
import java.util.List;

public class Vehicle{
    private String model;
    private String make;
    private String year;
    private String color;
    private int licensePlateNum;
    private float pricePerDay;
    // private Image photo;
    private String description;
    private String lotNumber;
    private String parkingSpaceNum;
    private Reservation reservation;


    public Vehicle(String make, String model, int year, String color){
       }

    /**
     * @return String return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return String return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return String return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return String return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return String return the licensePlateNum
     */
    public int getLicensePlateNum() {
        return licensePlateNum;
    }

    /**
     * @param licensePlateNum the licensePlateNum to set
     */
    public void setLicensePlateNum(int licensePlateNum) {
        this.licensePlateNum = licensePlateNum;
    }

    /**
     * @return float return the pricePerDay
     */
    public float getPricePerDay() {
        return pricePerDay;
    }

    /**
     * @param pricePerDay the pricePerDay to set
     */
    public void setPricePerDay(float pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return String return the lotNumber
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * @param lotNumber the lotNumber to set
     */
    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    /**
     * @return String return the parkingSpaceNum
     */
    public String getParkingSpaceNum() {
        return parkingSpaceNum;
    }

    /**
     * @param parkingSpaceNum the parkingSpaceNum to set
     */
    public void setParkingSpaceNum(String parkingSpaceNum) {
        this.parkingSpaceNum = parkingSpaceNum;
    }

    /**
     * @return Reservation return the reservation
     */
    public Reservation getReservation() {
        return reservation;
    }

    /**
     * @param reservation the reservation to set
     */
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

}
