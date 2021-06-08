package main;

public class MotorBikeRide {
    private int noOfPassengers, distInKM, timeInMinutes;
    MotorBikeRide(int noOfPassengers, int distInKM, int timeInMinutes)
    {
        this.noOfPassengers = noOfPassengers;
        this.distInKM = distInKM;
        this.timeInMinutes = timeInMinutes;
    }

    public boolean canTakeTrip()
    {
        return noOfPassengers <= 1 && distInKM <= 10;
    }

    public int perHeadFare()
    {
        int totalFare = Math.max(25, distInKM * 20);
        return totalFare/noOfPassengers;
    }

    public void getRideRequestMessage()
    {
        System.out.println("== Ride Swift in Bike ==");
    }
}
