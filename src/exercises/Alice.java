package exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        Alice alice = new Alice();
        String searchTerm = alice.getUserSearchTerm();
        boolean myReturnResult = alice.searchAliceQuote(searchTerm);
        if(myReturnResult == true){
            alice.getWordsIndex(searchTerm);
            alice.removeWordsFromQuote(searchTerm);
        }

        System.out.println("The results is: "+ myReturnResult);

    }
    public void removeWordsFromQuote(String searchTerm){
        String theQuote = "Alice was beginning to get very tired of sitting by her on the bank, and of having nothing to do: once or twice she had peeded into the book her sister was reading, but it had no pictures or conversation in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?' ";
        String theQuoteLowerCase = theQuote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();

        // Use the substring method to remove ta section from a string
//        theQuoteLowerCase.substring();
        int startingPoint1 = 0;
        int endingPoint1 = theQuoteLowerCase.indexOf(searchTermLowerCase);
        int startingPoint2 = theQuoteLowerCase.indexOf(searchTermLowerCase) + searchTermLowerCase.length();

        String ourNewQuote = theQuote.substring(startingPoint1, endingPoint1) + theQuote.substring(startingPoint2);
        System.out.println("The new qoote is: " + ourNewQuote);

            }

    public void getWordsIndex(String searchTerm){
        String theQuote = "Alice was beginning to get very tired of sitting by her on the bank, and of having nothing to do: once or twice she had peeded into the book her sister was reading, but it had no pictures or conversation in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?' ";
        String theQuoteLowerCase = theQuote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();

        int theIndex = theQuoteLowerCase.indexOf(searchTermLowerCase);
        System.out.println("The index is " + theIndex + "and the length is " + searchTermLowerCase.length());
    }

    public String getUserSearchTerm(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("What is the quote?");
        String searchTerm = scanner.nextLine();
        scanner.close();
        return searchTerm;
    }

    public boolean searchAliceQuote(String searchTerm){
        String theQuote = "Alice was beginning to get very tired of sitting by her on the bank, and of having nothing to do: once or twice she had peeded into the book her sister was reading, but it had no pictures or conversation in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?' ";
        String theQuoteLowerCase = theQuote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();

        boolean result = theQuoteLowerCase.contains(searchTermLowerCase);
        return result;

    }
}



