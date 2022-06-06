

import java.util.List;

public class CarManager {


    
    private String username = "username123";
    private String password = "password123";


    public CarManager(){
        // super(firstName, lastName, dob, driversLicenseNum, email, reservation);
        // this.username = userName;
        // this.password = password;
    }

    public String checkCredentials(String username1, String password1){
        if(username1.equals(username) && password1.equals(password)){
            return "true";
        }
        else {
            return "false";
        }
    }

    public Vehicle addCar(Vehicle v){
        return v;
    }

    public void removeCar(Vehicle vehicle){
    
    }

    public void login(){

    };


}
