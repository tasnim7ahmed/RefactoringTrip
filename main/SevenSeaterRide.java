package main;

public class SevenSeaterRide {
    private int noOfPassengers, distInKM;
    SevenSeaterRide(int noOfPassengers, int distInKM)
    {
        this.noOfPassengers = noOfPassengers;
        this.distInKM = distInKM;
    }

    public boolean canTakeTrip()
    {
        return noOfPassengers <= 7 && distInKM >= 10;
    }
}
