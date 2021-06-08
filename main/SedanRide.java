package main;

public class SedanRide {
    private int noOfPassengers, distInKM;
    SedanRide(int noOfPassengers, int distInKM)
    {
        this.noOfPassengers = noOfPassengers;
        this.distInKM = distInKM;
    }

    public boolean canTakeTrip()
    {
        return noOfPassengers<=4 && distInKM<=25;
    }
}
