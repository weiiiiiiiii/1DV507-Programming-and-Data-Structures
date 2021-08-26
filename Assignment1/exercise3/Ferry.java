package ww222ag_assign1.exercise3;


import java.util.Arrays;

public class Ferry implements FerryInterface {
    final private int MAX_PASSENGERS = 200;
    final private int MAX_VEHICLES_SPACE = 200; //min space is for a bike, a car occupies 5 spaces,
    private Vehicle [] vehicles = new Vehicle[0];
    private Passenger [] passengers = new Passenger[0];
    //private int passengers = 0; //only passengers
    private int money = 0;

    Ferry() { }

    @Override
    public int countPassengers() {
        int aux = 0;
        for(Vehicle v: vehicles) {
            aux += v.getNumOfPassengers();
        }
        return aux + passengers.length;
    }

    @Override
    public int countVehicleSpace() {
        int aux = 0;
        for(Vehicle v: vehicles) {
            aux += v.getOccupiedSpace();
        }
        return aux;
    }

    @Override
    public int countMoney() {
        int aux = 0;
        for(Vehicle v: vehicles) {
            aux += v.getFees();
        }
        return aux + (passengers.length*25);
    }

    @Override
    public Vehicle[] getAllVehicles() {
        return vehicles;
    }

    @Override
    public void embark(Vehicle v) throws ExceptionExceedsCapacity {
        if(hasSpaceFor(v)) {
            //throw error if there is no more space
            Vehicle[] tmp = Arrays.copyOf(this.vehicles, this.vehicles.length + 1);
            tmp[this.vehicles.length] = v;
            this.vehicles = tmp;
        }else {
            throw new ExceptionExceedsCapacity("No space available in ferry for vehicle");
        }
    }

    @Override
    public void embark(Passenger p) throws ExceptionExceedsCapacity {
        if(hasRoomFor(p)) {
            //throw error if there is no more space
            Passenger[] tmp = Arrays.copyOf(this.passengers, this.passengers.length + 1);
            tmp[this.passengers.length] = p;
            this.passengers = tmp;
        } else {
            throw new ExceptionExceedsCapacity("No space available");
        }
    }

    @Override
    public void disembark() {
        //count money before disembark and save money
        this.money = countMoney();
        this.passengers = new Passenger[0];
        this.vehicles = new Vehicle[0];
    }

    @Override
    public boolean hasSpaceFor(Vehicle v) {
        return (MAX_VEHICLES_SPACE - countVehicleSpace()) >= v.getOccupiedSpace();
    }

    @Override
    public boolean hasRoomFor(Passenger p) {
        return (MAX_PASSENGERS - countPassengers()) >= 1;
    }

    @Override
    public String toString() {
        return "======== FERRY STATUS ========\nPASSENGERS: "+countPassengers()+"/"+MAX_PASSENGERS+"\n"+
                "VEHICLES: "+ vehicles.length+"\nVEHICLES SPACE: "+countVehicleSpace()+"/"+MAX_VEHICLES_SPACE+"\n"+
                "MONEY (from current trip): "+countMoney()+"\nMONEY STORED (from previous trips): "+money;
    }
}
