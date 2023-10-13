public class Reservation {


    //this will help me make reservation objects
     public int numPeople;
     public double time;

     int tableNumber;
     public String name;

     public int priority;

     //helpful for finding current time
    // System.currentTimeMillis();

    public Reservation(int nnumPeople, double ttime, int ppriority, String nname, int ttableNumber) {
        numPeople = nnumPeople;
        time = ttime;
        name = nname;
        priority = ppriority;
        tableNumber = ttableNumber;
    }
        public void print(){

        System.out.println (name + " booked a reservation for " + numPeople + " people at " + time + " o'clock for table " + tableNumber +"." );

    }


}
