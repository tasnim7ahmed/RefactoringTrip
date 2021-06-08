package main;

public class SevenSeaterRide {
    private int noOfPassengers, distInKM, timeInMinutes;
    SevenSeaterRide(int noOfPassengers, int distInKM, int timeInMinutes)
    {
        this.noOfPassengers = noOfPassengers;
        this.distInKM = distInKM;
        this.timeInMinutes = timeInMinutes;
    }

    public boolean canTakeTrip()
    {
        return noOfPassengers <= 7 && distInKM >= 10;
    }

    public int perHeadFare()
    {
        int totalFare;
        if (distInKM < 10)
            totalFare = 300;
        else
            totalFare = (distInKM * 30);
        return totalFare/noOfPassengers;
    }

    public void getRideRequestMessage()
    {
        System.out.println("== Ride with Friends and Family in Seven-Seater ==");
    }
}
