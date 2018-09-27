import java.util.Scanner;
import java.util.Random;

public class PNB {
    public static void main(String[]args){



        //Creating Variables
        Scanner input;
        String usersChoice;
        String objectName;
        String[] Object;

        //Initializing Variables
        input = new Scanner(System.in);
        Random PNB = new Random();
        int Generator = PNB.nextInt(3);

        //Array for PNB
        Object = new String[3];
        Object[0] = "Pencil";
        Object[1] = "Notebook";
        Object[2] = "Book Bag";

        //Grabbing users choice of object
        System.out.println("Let's play Pencil, Notebook, Book Bag! You'll be playing against the computer so select" +
                "your option wisely!\n1 For Pencil\n2 For Notebook\n3 For Book Bag");
        usersChoice = input.nextLine();
        int usersObject = Integer.parseInt(usersChoice);
        if(usersObject == 1) {
            objectName = "Pencil";
        } else if(usersObject == 2) {
            objectName = "Notebook";
        } else if(usersObject == 3) {
            objectName = "Book Bag";
        }
        
        System.out.println("/nYou chose "+objectName+" and the computer chose "+Object[Generator]);
        
        //Results if user chooses Pencil
        if(usersObject == 1 && Object[Generator] == Object[0]) {
            System.out.println("\nTie! No one won feel free to play again.");
        } else if(usersObject == 1 && Object[Generator] == Object[1]){
            System.out.println("\nNotebook beats Pencil! Sorry feel free to play again.");
        } else if(usersObject == 1 && Object[Generator] == Object[2]){
            System.out.println("\nPencil beats Book Bag! Congrats feel free to play again.");
        }

        //Results if user chooses Notebook
        if(usersObject == 2 && Object[Generator] == Object[0]) {
            System.out.println("Notebook beats Pencil! Congrats feel free to play again.");
        } else if(usersObject == 1 && Object[Generator] == Object[1]){
            System.out.println("\nTie! No one won feel free to play again.");
        } else if(usersObject == 1 && Object[Generator] == Object[2]){
            System.out.println("\nBook Bag beats Notebook! Sorry feel free to play again.");
        }
        
        //Results if user chooses Book Bag
        if(usersObject == 3 && Object[Generator] == Object[0]) {
            System.out.println("Pencil beats Book Bag! Sorry feel free to play again");
        } else if(usersObject == 1 && Object[Generator] == Object[1]){
            System.out.println("\nBook Bag beats Notebook! Congrats feel free to play again.");
        } else if(usersObject == 1 && Object[Generator] == Object[2]){
            System.out.println("\nTie! No one won feel free to play again.");
        }
        
        boolean Loop = true;
        while(Loop){
            System.out.println("Let's play again! You know the drill\n1 For Pencil\n2 For Notebook\n3 For Book Bag");
            usersChoice = input.nextLine();
        }

    }
}
