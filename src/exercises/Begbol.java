package exercises;
import java.util.Scanner;

public class Begbol {

    public static void main(String[] args) {
        Begbol begbol = new Begbol();
        begbol.askUserForName();

//        for(int x = 1; x <= 5; x++){
//            for(int y = 1; y <= x; y++){
//                System.out.print(y+" ");
//            }
//            System.out.println();
//        }


    }

    public void askUserForName() {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello, What is your name? ");

        String name = input.nextLine();

        System.out.println("Hello " + name);


    }


}
