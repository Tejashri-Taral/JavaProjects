import model.payment.PaymentProcessor;
import model.payment.CreditCardPaymentProcessor;
import model.Car;
import model.Customer;
import model.Reservation;
import java.util.List;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class RentalSystem {

    private Map<String,Car> cars;
    private Map<String,Reservation> reservations;
    private PaymentProcessor paymentProcessor;

    public RentalSystem() {
        cars=new HashMap<>();
        reservations=new HashMap<>();
        paymentProcessor=new CreditCardPaymentProcessor();
            
    }

    public void addCar(Car car) {
        cars.put(car.getLicensePlate(), car);
        System.out.println("Car added successfully");
    }

    public void removeCar(String licensePlate) {
        cars.remove(licensePlate);
    }

    public List<Car> searchCars(String maker,String model,LocalDate starDate,LocalDate endDate) {
        List<Car> availableCars=new ArrayList<>();
        for(Car car:cars.values()) {
            if(car.getMaker().equals(maker) && car.getModel().equals(model) && car.getIsAvailable()) {
               if(isCarAvailable(car,starDate,endDate)) {
                availableCars.add(car);
                }
            }
        }
        return availableCars;
    }

    private boolean isCarAvailable(Car car,LocalDate startDate,LocalDate endDate) {
        for(Reservation reservation: reservations.values()) {
            if(reservation.getCar().equals(car)) {
                if(startDate.isBefore(reservation.getEndDate()) && endDate.isAfter(reservation.getStartDate())) {
                    return false;
                }
            }
        }
        return true;
    }

    public Reservation makeReservation(Customer customer,Car car,LocalDate startDate,LocalDate endDate) {
        if(isCarAvailable(car, startDate, endDate)) {
            String reservationId=generateReservationID();
            Reservation reservation=new Reservation(reservationId, car,customer, startDate, endDate, 1500.0);
            reservations.put(reservationId, reservation);
            car.setAvailable(false);
            return reservation;
        }
        return null;
    }

    public void cancelReservation(String reservationId) {
        Reservation reservation=reservations.remove(reservationId);
        reservation.getCar().setAvailable(true);
    }

    private String generateReservationID() {
        return "res"+UUID.randomUUID().toString().substring(0,8).toUpperCase();
    }

    public boolean processPayment(Reservation reservation) {
        return paymentProcessor.processPayment(reservation.getTotalPrice());
    }
}
