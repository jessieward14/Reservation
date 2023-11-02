
import java.util.Scanner;
public class ReservationSystem {
    Reservation[] reservations = new Reservation[10];

    public static void main(String[] args) {
        ReservationSystem jarvis = new ReservationSystem();
    }


    public ReservationSystem() {
//
     addReservation(5,5.3, 3, "charlotte", 4000000);
     Scanner scan = new Scanner (System.in);
     System.out.println("what is your name?");
     String namw = scan.nextLine();
     System.out.println("Hello " + namw +"! What can I help you with?");
     System.out.println("Here are your options: Press 1 to view reservations times; press 2 to add a reservation; press 3 to sort reservations by priority; press 5 to add people; press 6 for special requests");
     String number = scan.nextLine();
     if(number.equals("1")){
         System.out.println("View reservations");
         displayReservation();
        }
     if(number.equals("2")){
         System.out.println("What time do you want your reservation?");
         String time = scan.nextLine();
         System.out.println("For how many people?");
         String amount = scan.nextLine();
         System.out.println("Would you like to change the name of the reservation?");
         String change = scan.nextLine();
         if(change.equals("yes")){
             System.out.println("What would you like to change the name of the reservation to?");
             String name = scan.nextLine();
             namw = name;
         }
         if (change.equals("no")){
             System.out.println("Okay sounds good " + namw + "!");
         }
         System.out.println("Thank you for making a reservation!");

         addReservation(Integer.parseInt(amount), Double.parseDouble(time), System.currentTimeMillis(), namw, System.currentTimeMillis());

     }
     if(number.equals("3")){

     }



     //   selectionSort();

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
     //   addReservation(5, 7.0, 3, "Steve", 5.3);
      //  selectionSort();
    }


    public void addReservation(int nnumPeople, double ttime, long ppriority, String nname, long ttimeMade) {
        Reservation chair = new Reservation(nnumPeople, ttime, ppriority, nname, ttimeMade);
        for (int x = 0; x < reservations.length; x++) {
            if (reservations[x] == null) {
               // System.out.println("empty");
                reservations[x] = chair;
               // reservations[x].print();
                break;

            }

        }

        displayReservation();
    }

    public void displayReservation() {
        //System.out.println(reservations[]);
        for (int x = 0; x < reservations.length; x++) {
            if (reservations[x] == null) {
                System.out.println("available");

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
        Reservation filler = new Reservation(0,0,0,"bob",400000);
        for(int v= 0; v< reservations.length - 1; v++){
//            if{reservations[v].priority > reservations[v+1].priority){
//                filler = reservations[v+1];
//
//            }

            for(int j= 0; j< reservations.length; j++){
                if(reservations[j] != null){
                    reservations[j].priority = j;

                }
            }
        }
    }

    }
