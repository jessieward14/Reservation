public class ReservationSystem {
    public static void main(String[] args) {
       ReservationSystem jarvis = new ReservationSystem();
    }


    public ReservationSystem(){
        Reservation gavin = new Reservation(1, 1, 1, "Jessie", 1);
        gavin.toString();
        gavin.print();


        Reservation cat = new Reservation(10,9,3,"Steve", 4);


        Reservation[] reservations = new Reservation[10];

        reservations[0]= gavin;

        reservations[0].print();
        reservations[2] = cat;
        reservations[2].print();

        for(int x=3; x<10; x++){
            reservations[x] = new Reservation(7,7.00, 2, 6);
            reservations[x].print();
        }


        public addReservation(){

            for(int x=3; x<10; x++){
                reservations[x] = new Reservation(7,7.00, 2, 6);
                reservations[x].print();
            }
        }
        public displayReservation(){
            System.out.println(reservations[2]);

        }

    }

}
