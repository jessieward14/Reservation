public class ReservationSystem {
    Reservation[] reservations = new Reservation[10];

    public static void main(String[] args) {
        ReservationSystem jarvis = new ReservationSystem();
    }


    public ReservationSystem() {
//        Reservation gavin = new Reservation(1, 1, 1, "Jessie", 1);
//        gavin.toString();
//        gavin.print();
//
//
//        Reservation cat = new Reservation(10,9,3,"Steve", 4);
//
//
//
//        reservations[0]= gavin;
//
//        reservations[0].print();
//        reservations[2] = cat;
//        reservations[2].print();
//
//        for(int x=3; x<10; x++){
//            reservations[x] = new Reservation(7,7.00, 2, "bill", 3);
//            reservations[x].print();
//        }
        addReservation(5, 7.0, 3, "Steve", 5);
    }


    public void addReservation(int nnumPeople, double ttime, int ppriority, String nname, int ttableNumber) {
        Reservation chair = new Reservation(nnumPeople, ttime, ppriority, nname, ttableNumber);
        for (int x = 0; x < reservations.length; x++) {
            if (reservations[x] == null) {
                System.out.println("empty");
                reservations[x] = chair;
                reservations[x].print();
                break;

            }

        }

        displayReservation();
    }

    public void displayReservation() {
        //System.out.println(reservations[]);
        for (int x = 0; x < reservations.length; x++) {
            if (reservations[x] == null) {
                System.out.println("empty");

            }else{
                System.out.println(reservations);
            }
        }
    }
}