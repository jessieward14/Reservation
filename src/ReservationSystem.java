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
        selectionSort();
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

            } else {
                reservations[x].print();
            }
        }
    }

    public void selectionSort() {
        int[] waffles = new int[10];

        for (int i = 0; i < waffles.length; i++) {
            waffles[i] = (int) (Math.random() * 100);
            System.out.print(waffles[i] + ", ");
        }
        System.out.println();

        //start of selectionSort();
        //find the min
        int n = waffles.length;
        for (int k = 0; k < n - 1; k++) {
            int minIndex = k;
            for (int v = k + 1; v < n; v++) {
                if (waffles[v] < waffles[minIndex]) {
                    minIndex = v;
                }
            }

            //swap indexs
            int temp = waffles[minIndex];
            waffles[minIndex] = waffles[k];
            waffles[k] = temp;
        }
        for (int i = 0; i < waffles.length; i++) {
            System.out.print(waffles[i] + ", ");
        }
        System.out.println();

    }



    public void sortReservationsByPriority(){
        Reservation filler = new Reservation(0,0,0,0,0);
        for(int v= 0; v< reservations.length - 1; v++){
            if{reservations[v].priority > reservations[v+1].priority){
                filler = reservations[v+1];

            }

            for(int j= 0; j< reservations.length; j++){
                if(reservations[j] != null){
                    reservations[j].priority = j;

                }
            }
        }
    }

    }
}