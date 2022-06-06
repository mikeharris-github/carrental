
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

  
    public static void main(String[] args) throws ParseException {
      //Initialization and mock data detup
      Scanner scan = new Scanner(System.in);
      int counter = 1000;
      //Create fake reservation to add to resdb
      Reservation fakeReservation = new Reservation();
      Customer fakeCustomer = new Customer("John", "Doe", "fake@gmail.com");
      Vehicle fakeVehicle = new Vehicle("Ferrari", "F250", 2022, "Red");
      fakeReservation.setStartDate("1/1/2022");
      fakeReservation.setEndDate("1/21/2022");
      fakeReservation.setPickupTime("1:30");
      fakeReservation.setReturnTime("2:30");
      fakeReservation.setResNum(12345);
      fakeReservation.setCustomer(fakeCustomer);
      fakeReservation.setVehicle(fakeVehicle);
      fakeVehicle.setLicensePlateNum(12345);
      //create ArrayList for Reservations then add to resDB
      // ArrayList<Reservation> resDB = new ArrayList<Reservation>();
      // resDB.add(fakeReservation);


    //HOMEPAGE
      System.out.println("Welcome to the Car Rental Place!\n Are you a Car Manager? Y/N"); 
      String answer = scan.nextLine();
      if(answer.equals("Y")){
        addCar(scan, fakeReservation);
      } else if(answer.equals("N")){
        System.out.println("Would you like to create a new reservation or edit an existing reservation? Select 'create' or 'edit'.");
        String response = scan.nextLine();
        if(response.equals("create")){
          makeReservation(scan, counter);
        }
        else if(response.equals("edit")){
          editReservation(scan,fakeReservation);
        }
        else{
          System.out.println("You did not enter the correct value.");
          System.exit(0);
        }
      }      
    }

    public static Reservation makeReservation(Scanner scan, int counter) {
      System.out.println("makeReservation method activated!");

            //begin collecting customer information
            System.out.println("Welcome Customer!\nLet's get started with your car rental.\nWhat's your first name?");
            String firstName = scan.nextLine();
            // customer.setFirstName(firstName);
      
            System.out.println("What's your last name");
            String lastName = scan.nextLine();
            // customer.setLastName(lastName);
      
            System.out.println("What's your email address?");
            String email = scan.nextLine();
            // customer.setEmail(email);
      
            System.out.println("What date would you like to pick your vehicle?");
            String pickUpDate = scan.nextLine();
      
            System.out.println("What time for the pickup?");
            String pickUpTime = scan.nextLine();
      
            System.out.println("What's date would you like to drop off your vehicle?");
            String dropOffDate = scan.nextLine();
      
            System.out.println("What time for the dropoff?");
            String dropOffTime = scan.nextLine();
      
            System.out.println("Which of the following car makes would you like?\nFerrari\nTesla");
            String vehicleMake = scan.nextLine();
            System.out.println("Which of the following car models would you like?");
            if(vehicleMake.equals("Ferrari")){
              System.out.println("360 Modena\nF430 Spider \n458 Italia");
            }
            if(vehicleMake.equals("Telsa")){
              System.out.println("Model x\nModel Y");
            }
            String vehicleModel = scan.nextLine();

            if(vehicleModel.equals("Model Y")){
              System.out.println("That car is currently unavailable.");
              System.exit(0);
            }
            System.out.println("What year?");
            int vehicleYear = scan.nextInt();
            scan.nextLine();
            System.out.println("What is your driver's license number?");
            String driversLicNum = scan.nextLine();
            System.out.println("What color?");
            String vehicleColor = scan.nextLine();
      
            //check age
            System.out.println("What is your age?");
            Integer age = scan.nextInt();
            Reservation reservation = new Reservation();
            if(age>=25){
      
              //create reservation
              counter++;
              int resNum = counter;
              //create customer
              //create vehicle
              Vehicle vehicle = new Vehicle(vehicleMake, vehicleModel, vehicleYear, vehicleColor);
              Customer customer = new Customer(firstName,lastName,email);

              //TEST
              // Reservation reservation = new Reservation(pickUpDate,dropOffDate,pickUpTime,dropOffTime,resNum,customer,vehicle);
              reservation.setStartDate(pickUpDate);
              reservation.setEndDate(dropOffDate);
              reservation.setPickupTime(pickUpTime);
              reservation.setReturnTime(dropOffTime);
              reservation.setResNum(resNum);
              reservation.setCustomer(customer);
              reservation.setVehicle(vehicle);

              System.out.println("Thank you for your business! Below is your reservation information: \nName: " + customer.getFirstName() + " " + customer.getLastName() + " \nreservation start date: " + reservation.getStartDate() + "\nDropoff Date: " + reservation.getEndDate());
              System.out.println("Pickup time: " + reservation.getPickupTime() + "\nDropoff time: " + reservation.getReturnTime() + "\nReservation Number: " + reservation.getResNum());
              // return reservation;
            }
            else{
              System.out.println("You do not meet the minimum age to rent a vehicle.");
              System.exit(0);
            }
            return reservation;
  
    }
  
    public static void editReservation(Scanner scan, Reservation reservation) {
      System.out.println("Please enter your reservation number:");
      int resNum = scan.nextInt();
      scan.nextLine();
      if(resNum!=reservation.getResNum()){
        System.out.println("Reservation does not exist.");
        System.exit(0);
      }
      System.out.println("Reservation exists.\nWhich would you like to update?\nStart Date\nEnd Date\nPickup Time\nReturn Time");
      String response = scan.nextLine();
      if(response.equals("Start Date")){
        System.out.println("Enter new start date:");
        String newStartDate = scan.nextLine();
        reservation.setStartDate(newStartDate);
        System.out.println("Resevation " + resNum + " has succesfully updated it's start date to: " + reservation.getStartDate());
      }
      if(response.equals("End Date")){
        System.out.println("Enter new end date:");
        String newEndDate = scan.nextLine();
        reservation.setEndDate(newEndDate);
        System.out.println("Resevation " + resNum + " has succesfully updated it's end date to: " + reservation.getEndDate());
      }
      if(response.equals("Pickup Time")){
        System.out.println("Enter new pickup time:");
        String newPickupTime = scan.nextLine();
        reservation.setPickupTime(newPickupTime);
        System.out.println("Resevation " + resNum + " has succesfully updated it's pickup time to: " + reservation.getPickupTime());
      }
      if(response.equals("Return Time")){
        System.out.println("Enter new return time:");
        String newReturnTime = scan.nextLine();
        reservation.setReturnTime(newReturnTime);
        System.out.println("Resevation " + resNum + " has succesfully updated it's return time to: " + reservation.getReturnTime());
      }
    }
  
    public static void addCar(Scanner scan, Reservation fakeReservation){
      CarManager carManager = new CarManager();
      boolean userCheck = checkUserCredentials(carManager);
      if(userCheck==true){
        System.out.println("Login successful!");
      }
      else{
        System.out.println("Credentials are incorrect, please try again.");
        checkUserCredentials(carManager);
      }
      System.out.println("What is your license plate number?");
      int userLicNum = scan.nextInt();

      //gets reservation num from fakeReservation object created at beginning
      int licensePlateNum = fakeReservation.getVehicle().getLicensePlateNum();
  
      //If car is in stock, inform car is in inventory
      if(userLicNum == licensePlateNum ){
        System.out.println("That car is already in inventory");
      }
      else{
        //create car
        scan.nextLine();
        System.out.println("Car not currently in inventory. \nWhat is the make of the car?");
        String vehicleMake = scan.nextLine();
        System.out.println("What is the model of the car?");
        String vehicleModel = scan.nextLine();
        System.out.println("What year?");
        int vehicleYear = scan.nextInt();
        scan.nextLine();
        System.out.println("What color?");
        String vehicleColor = scan.nextLine();
        Vehicle vehicle = new Vehicle(vehicleMake, vehicleModel, vehicleYear, vehicleColor);
        vehicle.setLicensePlateNum(userLicNum);
        System.out.println("The following car is added to inventory: " + vehicleColor + " " + vehicleYear + " " + vehicleMake + " " + vehicleModel);
        System.out.println("The license plate number is: " + userLicNum);
      }
      System.exit(0);
    }
  

    private static boolean checkUserCredentials(CarManager carManager) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your username: ");
      String username = scan.nextLine();
      System.out.println("Enter your password");
      String password = scan.nextLine();
      String result = carManager.checkCredentials(username, password);
      System.out.print("Result: " + result);
      if(result.equals("true")){
        System.out.println("This is a car manager!");
      }
      else{
        System.out.println("Credentials are incorrect, please try again.");
        checkUserCredentials(carManager);
      }
      return true;

    }}


