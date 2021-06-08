package main;

public class Trip {
    private String rideType;
    private int distInKM;
    private int timeInMinutes;
    private int noOfPassengers;

    public Trip(String rideType,
                int distInKM,
                int timeInMinutes,
                int noOfPassengers) {
        this.rideType = rideType;
        this.distInKM = distInKM;
        this.timeInMinutes = timeInMinutes;
        this.noOfPassengers = noOfPassengers;
    }

    public void requestTrip() {
        if (rideType == "MOTOR_BIKE") {
            System.out.println(new MotorBikeRide(noOfPassengers,distInKM,timeInMinutes).getRideRequestMessage());
        } else if (rideType == "SEVEN_SEATER") {
            System.out.println(new SevenSeaterRide(noOfPassengers,distInKM,timeInMinutes).getRideRequestMessage());
        } else {
            System.out.println(new SedanRide(noOfPassengers,distInKM,timeInMinutes).getRideRequestMessage());
        }

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
        switch (rideType) {
            case "SEDAN":
                fare = new SedanRide(noOfPassengers,distInKM,timeInMinutes).perHeadFare();
                break;
            case "SEVEN_SEATER":
                fare = new SevenSeaterRide(noOfPassengers,distInKM,timeInMinutes).perHeadFare();
                break;
            default:
                fare = new MotorBikeRide(noOfPassengers,distInKM,timeInMinutes).perHeadFare();
                break;
        }

        return fare - (fare % 5);
    }

    public boolean canTakeTrip() {
        if (noOfPassengers < 1)
            return false;

        switch (rideType) {
            case "SEDAN":
                return new SedanRide(noOfPassengers,distInKM,timeInMinutes).canTakeTrip();
            case "SEVEN_SEATER":
                return new SevenSeaterRide(noOfPassengers,distInKM,timeInMinutes).canTakeTrip();
            default:
                return new MotorBikeRide(noOfPassengers,distInKM,timeInMinutes).canTakeTrip();
        }
    }
}
