
import java.util.Scanner;
public class ReservationSystem {
    Reservation[] reservations = new Reservation[10];

    public static void main(String[] args) {
        ReservationSystem jarvis = new ReservationSystem();
    }


    public ReservationSystem() {
//
     addReservation(5,5.3, 3, "charlotte", 4000000);
     addReservation(2,6.0, 1, "john", 18293);
     Scanner scan = new Scanner (System.in);
     System.out.println("what is your name?");
     String namw = scan.nextLine();
     System.out.println("Hello " + namw +"! What can I help you with?");
     boolean loop = true;
     while(loop==true) {
         System.out.println("Here are your options: Press 1 to view reservations times; press 2 to add a reservation; press 3 to sort reservations by priority; press 4 to request a waiter; press 5 to end session");
         String number = scan.nextLine();
         if(number.equals("1")) {
             System.out.println("View reservations");
             displayReservation();
         }
         if(number.equals("2")) {
             System.out.println("What time do you want your reservation?");
             String time = scan.nextLine();
             System.out.println("For how many people?");
             String amount = scan.nextLine();
             System.out.println("Would you like to change the name of the reservation?");
             String change = scan.nextLine();
             if (change.equals("yes")) {
                 System.out.println("What would you like to change the name of the reservation to?");
                 String name = scan.nextLine();
                 namw = name;
             }
             if (change.equals("no")) {
                 System.out.println("Okay sounds good " + namw + "!");
             }
             System.out.println("Thank you for making a reservation!");

             addReservation(Integer.parseInt(amount), Double.parseDouble(time), System.currentTimeMillis(), namw, System.currentTimeMillis());

         }
         if(number.equals("3")) {
             selectionSort();
            /* System.out.println("Would you like to explore any other menu options? yes or no.");
             String reply = scan.nextLine();
             if (reply.equals("no")) {
                 System.out.println("Okay!");
             }
             if (reply.equals("yes")) {
                 System.out.println("Okay! Which option would you like to see? ");*/
          //   }
         }
         if(number.equals("4")){
             System.out.println("What waiter would you like? Here are your options: Haley, Kim, Mike, Carol, Jenny");
             String waiter = scan.nextLine();
             if(waiter.equals("Haley")||waiter.equals("Kim") || waiter.equals("Mike")||waiter.equals("Carol")||waiter.equals("Jenny")){
                 System.out.println("Okay, your request has been sent!");
             }
             else{
                 System.out.println("Sorry, that waiter is not one of the options.");
             }
         }
         if(number.equals("5")){
             loop=false;
             System.out.println("Your action successfully went through.");
         }
        /* else{
             System.out.println("That is not one of the options");
         }*/


     }

    /* if(number.equals("4")){
         System.out.println("Here are your options: Press 1 to view reservations times; press 2 to add a reservation; press 3 to sort reservations by priority; press 4 to delete a reservation; press 5 for special requests");
         String number2 = scan.nextLine();
       }*/
  ///  if(number.equals())

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
    // addReservation(5, 7.0, 3, "Steve", 5273);
     //addReservation(7,6.3, 1, "joe", 238749);
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

       // displayReservation();
    }

    public void displayReservation() {
        //System.out.println(reservations[]);
        for (int x = 0; x < reservations.length; x++) {
            if (reservations[x] == null) {
                System.out.println("available for booking");

            } else {
                reservations[x].print();
            }
        }
    }

    public void selectionSort() {

       /* for (int i = 0; i < reservations.length; i++) {
            reservations[i] = (int) (Math.random() * 100);
            System.out.print(reservations[i] + ", ");
        }
        System.out.println();*/

        //start of selectionSort();
        //find the min
        int n = reservations.length;
        Reservation filler = new Reservation(0,0,0,"0", 0);
        for (int k = 0; k < n - 1; k++) {
            int minIndex = k;

            for (int v = k + 1; v < n; v++) {
                if (reservations[v]!= null) {
                    if (reservations[v].priority < reservations[minIndex].priority) {
                        minIndex = v;
                    }
                }
            }


            //swap indexs
            filler = reservations[minIndex];
            reservations[minIndex] = reservations[k];
            reservations[k] = filler;
        }
        for (int i = 0; i < reservations.length; i++) {
            System.out.println(reservations[i] + ", ");
        }
        displayReservation();

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
