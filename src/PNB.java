import java.util.Scanner;
import java.util.Random;

public class PNB {
    public static void main(String[]args){

        //Creating Variables
        Scanner input;
        String usersChoice;
        String objectName;
        String[] Object;
        int Generator;
        int loopGenerator;
        int usersObject;
        int u;
        int c;
        int r;

        //Initializing Variables
        input = new Scanner(System.in);
        Random PNB = new Random();
        Generator = PNB.nextInt(3);
        u = 0;
        c = 0;
        r = 1;

        //Array for PNB
        Object = new String[3];
        Object[0] = "Pencil";
        Object[1] = "Notebook";
        Object[2] = "Book Bag";

        //Grabbing users choice of object
        System.out.println("Let's play Pencil, Notebook, Book Bag! You'll be playing against the computer and \nwe'll play"+
                " one round for practice! Choose one of the following.\n\n1 For Pencil\n2 For Notebook\n3 For Book Bag");
        usersChoice = input.nextLine();
        usersObject = Integer.parseInt(usersChoice);
        if(usersObject <=0) {
            System.out.println("Now you don't get to practice since you selected neither of the choices! Good luck.");
        } else if(usersObject >= 4) {
            System.out.println("Now you don't get to practice since you selected neither of the choices! Good luck.");
        }

        if(usersObject == 1) {
            System.out.println("\nYou chose Pencil and the computer chose "+Object[Generator]);
        } else if(usersObject == 2) {
            System.out.println("\nYou chose Notebook and the computer chose "+Object[Generator]);
        } else if(usersObject == 3) {
            System.out.println("\nYou chose Book Bag and the computer chose "+Object[Generator]);
        }
        
        //Results if user chooses Pencil
        if(usersObject == 1 && Object[Generator] == Object[0]) {
            System.out.println("Tie! No one won the practice round.");
        } else if(usersObject == 1 && Object[Generator] == Object[1]){
            System.out.println("Notebook beats Pencil! Sorry you lost the practice round.");
        } else if(usersObject == 1 && Object[Generator] == Object[2]){
            System.out.println("Pencil beats Book Bag! Congrats you won the practice round.");
        }

        //Results if user chooses Notebook
        if(usersObject == 2 && Object[Generator] == Object[0]) {
            System.out.println("Notebook beats Pencil! Congrats you won the practice round.");
        } else if(usersObject == 2 && Object[Generator] == Object[1]){
            System.out.println("Tie! No one won the practice round.");
        } else if(usersObject == 2 && Object[Generator] == Object[2]){
            System.out.println("Book Bag beats Notebook! Sorry you lost the practice round.");
        }
        
        //Results if user chooses Book Bag
        if(usersObject == 3 && Object[Generator] == Object[0]) {
            System.out.println("Pencil beats Book Bag! Sorry you lost the practice round.");
        } else if(usersObject == 3 && Object[Generator] == Object[1]){
            System.out.println("Book Bag beats Notebook! Congrats you won the practice round.");
        } else if(usersObject == 3 && Object[Generator] == Object[2]){
            System.out.println("Tie! No one won the practice round.");
        }

        System.out.println("Ok you'll be playing for real from now on so choose carefully! The first to score 8 points" +
                "will win the game.");

        boolean Loop = true;
        while(Loop){
            loopGenerator = PNB.nextInt(3);
            System.out.println("1 For Pencil\n2 For Notebook\n3 For Book Bag");
            usersChoice = input.nextLine();
            usersObject = Integer.parseInt(usersChoice);
            r++;

            if(usersObject == 1) {
                System.out.println("\nYou chose Pencil and the computer chose "+Object[loopGenerator]);
            } else if(usersObject == 2) {
                System.out.println("\nYou chose Notebook and the computer chose "+Object[loopGenerator]);
            } else if(usersObject == 3) {
                System.out.println("\nYou chose Book Bag and the computer chose "+Object[loopGenerator]);
            }

            //Results if user chooses a different option
            if(usersObject <= 0) {
                System.out.println("Since you didn't select a correct response, that round didn't count.");
                r--;
            } else if(usersObject >=4) {
                System.out.println("Since you didn't select a correct response, that round didn't count.");
                r--;
            }

            //Results if user chooses Pencil
            if(usersObject == 1 && Object[loopGenerator] == Object[0]) {
                System.out.println("Tie!");
                r--;
            } else if(usersObject == 1 && Object[loopGenerator] == Object[1]){
                System.out.println("Notebook beats Pencil!");
                c++;
            } else if(usersObject == 1 && Object[loopGenerator] == Object[2]){
                System.out.println("Pencil beats Book Bag!");
                u++;
            }

            //Results if user chooses Notebook
            if(usersObject == 2 && Object[loopGenerator] == Object[0]) {
                System.out.println("Notebook beats Pencil!");
                u++;
            } else if(usersObject == 2 && Object[loopGenerator] == Object[1]){
                System.out.println("Tie!");
                r--;
            } else if(usersObject == 2 && Object[loopGenerator] == Object[2]){
                System.out.println("Book Bag beats Notebook!");
                c++;
            }

            //Results if user chooses Book Bag
            if(usersObject == 3 && Object[loopGenerator] == Object[0]) {
                System.out.println("Pencil beats Book Bag!");
                c++;
            } else if(usersObject == 3 && Object[loopGenerator] == Object[1]){
                System.out.println("Book Bag beats Notebook!");
                u++;
            } else if(usersObject == 3 && Object[loopGenerator] == Object[2]){
                System.out.println("Tie!");
                r--;
            }
            if(u > 1 && c > 1){
                System.out.println("Round: " + r + "\nUser: " + u + " points" + "\nComputer: " + c + " points");
            } else if(u == 1 && c == 1){
                System.out.println("Round: " + r + "\nUser: " + u + " point" + "\nComputer: " + c + " point");
            } else if(u > 1 && c == 1){
                System.out.println("Round: " + r + "\nUser: " + u + " points" + "\nComputer: " + c + " point");
            } else if(u == 1 && c > 1){
                System.out.println("Round: " + r + "\nUser: " + u + " point" + "\nComputer: " + c + " points");
            } else if(u == 0 && c == 0){
                System.out.println("Round: " + r + "\nUser: " + u + " points" + "\nComputer: " + c + " points");
            } else if(u == 1 && c == 0){
                System.out.println("Round: " + r + "\nUser: " + u + " point" + "\nComputer: " + c + " points");
            } else if(u == 0 && c == 1){
                System.out.println("Round: " + r + "\nUser: " + u + " points" + "\nComputer: " + c + " point");
            } else if(u == 0 && c > 1){
                System.out.println("Round: " + r + "\nUser: " + u + " points" + "\nComputer: " + c + " points");
            } else if(u > 1 && c == 0){
                System.out.println("Round: " + r + "\nUser: " + u + " points" + "\nComputer: " + c + " points");
            }
            if(u == 8) {
                System.out.println("The game is over!");
                if((u-c) == 1){
                    System.out.println("Congrats you won the game! You had " + (u - c) + " more " +
                            "point than the computer and you won in round " + (r--) + ". Feel free to play again.");
                } else{
                    System.out.println("Congrats you won the game! You had " + (u - c) + " more " +
                            "points than the computer and you won in round " + (r--) + ". Feel free to play again.");
                }
                System.exit(0);
            } else if(c == 8){
                System.out.println("The game is over!");
                if((c-u) == 1){
                    System.out.println("Sorry the computer won the game! It had " + (c - u) + " more " +
                            "point than you and won in round " + (r--) + ". Feel free to play again.");
                } else{
                    System.out.println("Sorry the computer won the game! It had " + (c - u) + " more " +
                            "points than you and won in round " + (r--) + ". Feel free to play again.");
                }
                System.exit(0);
            }
        }
    }
}