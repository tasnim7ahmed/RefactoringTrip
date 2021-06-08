package main;

public class SedanRide implements Ride{
    private int noOfPassengers, distInKM, timeInMinutes;
    SedanRide(int noOfPassengers, int distInKM, int timeInMinutes)
    {
        this.noOfPassengers = noOfPassengers;
        this.distInKM = distInKM;
        this.timeInMinutes = timeInMinutes;
    }

    public boolean canTakeTrip()
    {
        return noOfPassengers<=4 && distInKM<=25;
    }

    public int perHeadFare()
    {
        int totalFare = 50 + distInKM * 30 + timeInMinutes * 2;
        return totalFare/noOfPassengers;

    }

    public String getRideRequestMessage()
    {
        return "== Comfortable Sedan Ride ==";
    }
}
