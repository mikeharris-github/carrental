

public class Reservation{
    // private Date startDate;
    // private Date endDate;
    //***Need to come back and update this to dates from strings */
    private String startDate;
    private String endDate;
    // private Time pickupTime;
    // private Time returnTime;
    //**NEED TO UPDATE TIMES FROM STRING */
    private String pickupTime;
    private String returnTime;
    private int resNum;
    private Vehicle vehicle;
    private Customer customer;
    private String licensePlateNum;


    public Reservation(){

    }

    /**
     * @return Date return the startDate
     */
    public String getStartDate() {

    // public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {

    // public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return Date return the endDate
     */
    public String getEndDate() {

    // public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {

    // public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return Time return the pickupTime
     */
    public String getPickupTime() {

    // public Time getPickupTime() {
        return pickupTime;
    }

    /**
     * @param pickupTime the pickupTime to set
     */
    public void setPickupTime(String pickupTime) {

    // public void setPickupTime(Time pickupTime) {
        this.pickupTime = pickupTime;
    }

    /**
     * @return Time return the returnTime
     */
    public String getReturnTime() {

    // public Time getReturnTime() {
        return returnTime;
    }

    /**
     * @param returnTime the returnTime to set
     */
    public void setReturnTime(String returnTime) {

    // public void setReturnTime(Time returnTime) {
        this.returnTime = returnTime;
    }

    /**
     * @return int return the resNum
     */
    public int getResNum() {
        return resNum;
    }

    /**
     * @param resNum the resNum to set
     */
    public void setResNum(int resNum) {
        this.resNum = resNum;
    }

    /**
     * @return Vehicle return the vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * @return Customer return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
    //  * @return Integer return the confirmationNum
    //  */
    // public Integer getConfirmationNum() {
    //     return confirmationNum;
    // }

    /**
    //  * @param confirmationNum the confirmationNum to set
    //  */
    // public void setConfirmationNum(Integer confirmationNum) {
    //     this.confirmationNum = confirmationNum;
    // }

}
