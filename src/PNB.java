import java.util.Scanner;
import java.util.Random;

public class PNB {
    public static void main(String[]args){



        //Creating Variables
        Scanner input;
        String usersChoice;
        String computersInput1;
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
        
        //Debugging
        System.out.println("\n"+Object[Generator]);

        //Results if user chooses Pencil
        if(usersObject == 1 && Object[Generator] == Object[0]) {
            System.out.println("\nTie!");
        } else if(usersObject == 1 && Object[Generator] == Object[1]){
            System.out.println("\nNotebook beats Pencil! Sorry feel free to play again.");
        } else if(usersObject == 1 && Object[Generator] == Object[2]){
            System.out.println("\nPencil beats Book Bag! Congrats feel free to play agin.");
        }

        //Results if user chooses Notebook
        if(usersObject == 1 && Object[Generator] == Object[0]) {
            System.out.println("\nTie!");
        } else if(usersObject == 1 && Object[Generator] == Object[1]){
            System.out.println("\nNotebook beats Pencil! Sorry feel free to play again.");
        } else if(usersObject == 1 && Object[Generator] == Object[2]){
            System.out.println("\nPencil beats Book Bag! Congrats feel free to play agin.");
        }
        
        //Results if user chooses Book Bag
        if(usersObject == 1 && Object[Generator] == Object[0]) {
            System.out.println("\nTie!");
        } else if(usersObject == 1 && Object[Generator] == Object[1]){
            System.out.println("\nNotebook beats Pencil! Sorry feel free to play again.");
        } else if(usersObject == 1 && Object[Generator] == Object[2]){
            System.out.println("\nPencil beats Book Bag! Congrats feel free to play agin.");
        }
        
        boolean Loop = true;
        while(Loop){
            System.out.println("Let's play again! You know the drill\n1 For Pencil\n2 For Notebook\n3 For Book Bag");
            usersChoice = input.nextLine();
        }

    }
}
