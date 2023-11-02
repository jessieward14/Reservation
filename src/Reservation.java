public class Reservation {


    //this will help me make reservation objects
     public int numPeople;
     public double time;

     int tableNumber;
     public String name;

     public long priority;
     public long timeMade;

     //helpful for finding current time
    // System.currentTimeMillis();

    public Reservation(int nnumPeople, double ttime, long ppriority, String nname, long ttimeMade) {
        numPeople = nnumPeople;
        time = ttime;
        name = nname;
        priority = ppriority;
        timeMade = ttimeMade;
    }
        public void print(){

        System.out.println (name + " booked a reservation at " +timeMade + " for " + numPeople + " people at " + time + " o'clock.");

    }


}
