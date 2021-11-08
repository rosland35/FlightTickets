import java.util.Scanner;

public class FlightTickets {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean[] seats = new boolean[10];
        seats[0] = false;
        seats[1] = false;
        seats[2] = false;
        seats[3] = false;
        seats[4] = false;
        seats[5] = false;
        seats[6] = false;
        seats[7] = false;
        seats[8] = false;
        seats[9] = false;
        while (1 > 0) {
            if(isPlaneFull(seats)==true){
                System.out.println("The plane is now full.");
            }
            System.out.println("Please type 1 for Buying First Class Ticket");
            System.out.println("Please type 2 for Buying Economy Class Ticket");
            System.out.println("Please type 3 for Ticket Validation");
            int enteredValue = input.nextInt();
            if (enteredValue == 1) {
                if(seats[4]==true&&seats[9]==false){
                    System.out.println("First Class is full.Do you prefer Economy Class?");
                    System.out.println("1.YES , 2.NO");
                    System.out.println("Your choice:");
                    int choice=input.nextInt();
                    if(choice==1){
                        economyClass(seats);
                    }
                    if(choice==2){
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                }
                else{
                firstClass(seats);
                }
                }
            if (enteredValue==2){
                if(seats[9]==true&&seats[4]==false){
                    System.out.println("Economy Class is full.Do you prefer First Class?");
                    System.out.println("1.YES , 2.NO");
                    System.out.println("Your choice: ");
                    int choice2=input.nextInt();
                    if(choice2==1){
                        firstClass(seats);
                    }
                    else if(choice2==2){
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                }
                else{
                    economyClass(seats);
                }
                
            }
            if(enteredValue==3){
                System.out.println("Enter seat ID which will be validated ");
                int seatIdValidate=input.nextInt();
                if(seatIdValidate>10 || seatIdValidate<1){
                    System.out.println("There is no seat with this ID.");
                }
                else{
                validateTicketBySeatId(seatIdValidate, seats);
                }
            }
            
        }

    }
    public static void validateTicketBySeatId(int seatID, boolean[] seats){

        if(seats[seatID-1]==true){
            System.out.println("Ticket is sold");
        }
        if(seats[seatID-1]==false){
            System.out.println("Ticket is NOT sold yet.");
        }
        
        
    }
    public static boolean isPlaneFull(boolean[] seats){
        if(seats[4]&&seats[9]==true){

            return true;
        }
        else{

        return false;
        
    }


    }
    public static void economyClass(boolean[] seats){
        for (int a = 5; a < 10; a++) {
            if (seats[a] == false) {
                seats[a] = true;
                System.out.println("Economy Class Ticket is bought. Seat #" + (a + 1));
                break;
            }
        }
    }
    public static void firstClass(boolean [] seats){
        for (int i = 0; i < 5; i++) {
            if (seats[i] == false) {
                seats[i] = true;
                System.out.println("First Class Ticket is bought. Seat #" + (i + 1));
                break;
            }

        }

    }






}
