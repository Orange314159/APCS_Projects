import java.util.Scanner; // scanner
/*
This program deals with user input and returns values with println and print statements
- Matt Robson
*/
public class UserInput {


   public static void main(String[] args){
   int w = 1;

int x = w / 2;

double y = 3;

int z = (int) (x + y);
       // Create a scanner called scan to detect user input
       Scanner scan = new Scanner(System.in);


       // find the user's name
       System.out.print("What is your name? ");
       String userName = scan.next(); // takes the users name and adds it to the string user name
       scan.nextLine(); // clear the \n
       System.out.println("Hello " + userName + "!"); // tells the user hello then their name


       // find the user's age in days
       System.out.print("What is your age in days? ");
       int userAgeDays = scan.nextInt();
       scan.nextLine(); // clear the \n


       // Turn days to y m d
       int userAgeYears = userAgeDays / 365;      // find how many years old
       int userAgeLeftOver = userAgeDays % 365;   // set left over days
       int userAgeMonths = userAgeLeftOver / 30;  // find how many months
       userAgeLeftOver = userAgeLeftOver % 30;    // set left over days
       userAgeDays = userAgeLeftOver;             // set how many days
       System.out.println("You are " + userAgeYears + " years " + userAgeMonths + " months and " + userAgeDays + " days old."); // print age in year, month, day


       // Favorite bands
       System.out.print("What is your favorite band? "); // ask favorite band
       String userFavoriteBand = scan.nextLine(); // store in a string
       System.out.print("What is your 2nd favorite band? "); // ask second favorite band
       String userSecondFavoriteBand = scan.nextLine(); // store in a string
       System.out.println("I like " + userFavoriteBand + " and " + userSecondFavoriteBand + " too!!!");


       // how long?
       System.out.print("How long does it take? ");
       int userTimeHours = scan.nextInt();
       scan.next(); // clear hours
       scan.next(); // clear and
       int userTimeMinutes = scan.nextInt();
       scan.next(); // clear minutes
       scan.next(); // clear to
       scan.next(); // clear go
       scan.next(); // clear to
       String userPlace = scan.nextLine();
       int userMinutesTotal;
       userMinutesTotal = userTimeMinutes + (userTimeHours * 60);
       System.out.print("It takes " + userMinutesTotal + " minutes to go to" + userPlace + ".");   
   }


}

