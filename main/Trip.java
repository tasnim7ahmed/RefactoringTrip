package main;

public class Trip {
    private String rideType;
    private int distInKM;
    private int timeInMinutes;
    private int noOfPassengers;
    private Ride ride;

    public Trip(String rideType,
                int distInKM,
                int timeInMinutes,
                int noOfPassengers) {
        this.rideType = rideType;
        this.distInKM = distInKM;
        this.timeInMinutes = timeInMinutes;
        this.noOfPassengers = noOfPassengers;
        this.ride = getRide();
    }

    private Ride getRide()
    {
        Ride ride;
        if (rideType == "MOTOR_BIKE") {
            ride = new MotorBikeRide(noOfPassengers,distInKM,timeInMinutes);
        } else if (rideType == "SEVEN_SEATER") {
            ride = new SevenSeaterRide(noOfPassengers,distInKM,timeInMinutes);
        } else {
            ride = new SedanRide(noOfPassengers,distInKM,timeInMinutes);
        }
        return ride;
    }

    public void requestTrip() {
        System.out.println(ride.getRideRequestMessage());

        if (canTakeTrip()) {
            System.out.println(distInKM + " KM");
            System.out.println(timeInMinutes + " Minutes");
            System.out.println(perHeadFare() + " Taka Per Person");
        } else {
            System.out.println("Invalid Trip Request");
        }
    }

    public int perHeadFare() {
        int fare = -1;
        fare = ride.perHeadFare();
        return fare - (fare % 5);
    }

    public boolean canTakeTrip() {
        if (noOfPassengers < 1)
            return false;
       return ride.canTakeTrip();
    }
}
