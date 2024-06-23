package model;

import java.time.LocalDate;

public class Reservation {
    private String reservationId;
    private Car car;
    private Customer customer;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalPrice;

    public Reservation(String reservationId,Car car,Customer customer,LocalDate startDate,LocalDate endDate,double totalPrice) {
        this.reservationId=reservationId;
        this.car=car;
        this.customer=customer;
        this.startDate=startDate;
        this.endDate=endDate;
        this.totalPrice=totalPrice;
    }

    public String getReservationId() {
        return this.reservationId;
    }

    public Car getCar() {
        return this.car;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

}
