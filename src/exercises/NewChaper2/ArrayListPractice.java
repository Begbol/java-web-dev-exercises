package exercises.NewChaper2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
//        ArrayList<Integer> numbersToSum = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        Integer theSum = ArrayListPractice.sumAllEvenValues(numbersToSum);
//        System.out.println("The sum is: " + theSum.toString());

        ArrayPractice arrayPractice = new ArrayPractice();
        String[] returnWords = arrayPractice.splitGivenString();

        ArrayList<String> searchWords = new ArrayList<String>(Arrays.asList(returnWords));
        System.out.println("What word length are you looking for: ");
        Integer searchLength = ArrayListPractice.getUserSearchInput();
        ArrayListPractice.printWordsWithFiveLetters(searchWords, searchLength);
    }

    public static Integer getUserSearchInput(){
        Scanner scanner = new Scanner(System.in);
        Integer myUserInt = scanner.nextInt();
        scanner.close();
        return myUserInt;
    }

    public static void printWordsWithFiveLetters(ArrayList <String> words, Integer searchLength){
        //Find the word with 5 characters
        for(int i = 0; i < words.size(); i++){
            if(words.get(i).length() == searchLength)
            System.out.println(words.get(i));
        }

    }

    public static Integer sumAllEvenValues(ArrayList<Integer> valuesToSum){
        Integer sum = 0;
        for(int i = 0; i < valuesToSum.size(); i++){

            //How do we check if a number is even?
            if(valuesToSum.get(i) % 2 == 0){
                sum = sum + valuesToSum.get(i);

            }
        }
        return sum;
    }
}
