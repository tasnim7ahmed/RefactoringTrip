package main;

public class MotorBikeRide {
    private int noOfPassengers, distInKM;
    MotorBikeRide(int noOfPassengers, int distInKM)
    {
        this.noOfPassengers = noOfPassengers;
        this.distInKM = distInKM;
    }

    public boolean canTakeTrip()
    {
        return noOfPassengers <= 1 && distInKM <= 10;
    }
}
