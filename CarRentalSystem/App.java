import java.time.LocalDate;
import java.util.*;
import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Car Rental System");
        RentalSystem rentalSystem = new RentalSystem();

        Car car1=new Car("Toyota","Glanza",2022,"ABCD1234",600,true);
        Car car2=new Car("Honda","Civic",2021,"DEFG5678",800,true);
        Car car3=new Car("Ford","Mustang",2023,"HIJK8973",1200,true);

        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);

        //Create Customer
        Customer customer=new Customer("Kanika", "9054678321", "DL1234");

        //Make Reservation

        LocalDate startDate=LocalDate.now();
        LocalDate endDate=startDate.plusDays(3);

        List<Car> availableCars=rentalSystem.searchCars("Toyota","Glanza",startDate,endDate);

        if(!availableCars.isEmpty()) {
            Car selectedCar=availableCars.get(0);
            Reservation reservation=rentalSystem.makeReservation(customer, selectedCar, startDate, endDate);
            if(reservation != null) {
                boolean isPaymentSuccessful=rentalSystem.processPayment(reservation);
                if(isPaymentSuccessful == true) {
                    System.out.println("Reservation successful with Reservation Id: "+ reservation.getReservationId());
                } else {
                    System.out.println("Reservation failed, Reservation cancelled" + reservation.getReservationId());
                    rentalSystem.cancelReservation(reservation.getReservationId());
                }
            } else {
                System.out.println("Selected car not available for given Dates");
            }
        } else {
            System.out.println("No car available for given Specifiication");
        }




    }
}
