package ww222ag_assign1.exercise3;
import java.util.Arrays;

public abstract class Vehicle {
    private int maxCapacity, occupiedSpace, vehicleFee, passengerFee;
    Passenger[] passengers;
    Vehicle(int maxCapacity, int occupiedSpace, int vehicleFee, int passengerFee) {
        this.passengers = new Passenger[] {};
        this.maxCapacity = maxCapacity;
        this.occupiedSpace = occupiedSpace;
        this.vehicleFee = vehicleFee;
        this.passengerFee = passengerFee;
    };
    public void addPassengers(Passenger[] passengers) throws ExceptionExceedsCapacity {
        if(passengers.length + this.passengers.length > maxCapacity) {
            throw new ExceptionExceedsCapacity(maxCapacity);
        } else {
            Passenger[] newpassengers = Arrays.copyOf(this.passengers, this.passengers.length + passengers.length);
            var u = 0;
            for (var i = this.passengers.length; i<(this.passengers.length + passengers.length); i++) {
                newpassengers[i] = passengers[u];
                u++;
            }
            this.passengers = newpassengers;
        }
    }
    public int getNumOfPassengers() {
        return passengers.length;
    }
    public int getFees() {
        return vehicleFee + (passengerFee * passengers.length);
    }
    public int getOccupiedSpace() {
        return occupiedSpace;
    }
    void printPassengers() {
        System.out.print("Passengers: [ ");
        for(Passenger p: passengers) {
            System.out.print(p.getName());
        }
        System.out.println(" ]");
    }
}
