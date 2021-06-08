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
            System.out.println("== Ride Swift in Bike ==");
        } else if (rideType == "SEVEN_SEATER") {
            System.out.println("== Ride with Friends and Family in Seven-Seater ==");
        } else {
            System.out.println("== Comfortable Sedan Ride ==");
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
                fare = (50 + distInKM * 30 + timeInMinutes * 2) / noOfPassengers;
                break;
            case "MOTOR_BIKE":
                fare = Math.max(25, distInKM * 20) / noOfPassengers;
                break;
            default:
                if (distInKM < 10)
                    fare = 300 / noOfPassengers;
                else
                    fare = (distInKM * 30) / noOfPassengers;

                break;
        }

        return fare - (fare % 5);
    }

    public boolean canTakeTrip() {
        if (noOfPassengers < 1)
            return false;

        switch (rideType) {
            case "SEDAN":
                return noOfPassengers <= 4 && distInKM <= 25;
            case "SEVEN_SEATER":
                return noOfPassengers <= 7 && distInKM >= 10;
            default:
                return noOfPassengers <= 1 && distInKM <= 10;
        }
    }
}
