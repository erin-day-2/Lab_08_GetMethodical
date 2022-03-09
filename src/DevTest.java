import java.util.Scanner;
public class DevTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     /*   String userName = "";
        Scanner in = new Scanner(System.in);


        userName = getNonZeroLenString(in, "Enter your user name");

    }
        public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }
    */


  /*      Scanner in = new Scanner(System.in);
        boolean done = false;
        int inputInt = 0;

        inputInt = getInt(in, "Enter an integer: ");

    }
        public static int getInt (Scanner pipe, String prompt)
        {
            boolean done = false;
            int inputInt = 0;
            String trash = "";

            do {
                System.out.print(prompt);
                if (pipe.hasNextInt())
                {
                    inputInt = pipe.nextInt();
                    pipe.nextLine();
                    done = true;
                }
                else
                {
                    trash = pipe.nextLine();
                    System.out.println("Enter a valid integer not: " + trash);
                }
            }while(!done);

            return inputInt;
        }*/

     /*   boolean done = false;
        double inputDouble = 0;
        String trash = "";


        inputDouble = getDouble(in, "Enter your double number: ");
    }
        public static double getDouble (Scanner pipe, String prompt)
        {
            boolean done = false;
            double inputDouble = 0;
            String trash = "";

            do {
                System.out.print(prompt);
                if (pipe.hasNextDouble()) {
                    inputDouble = pipe.nextDouble();
                    pipe.nextLine();
                    done = true;
                }else
                {
                    trash = pipe.nextLine();
                    System.out.println("Enter a valid double not: " + trash);
                }
            }while(!done);

            return inputDouble;
        }*/


  /*      int rangeInt = 0;
        String trash = "";

        rangeInt = getRangedInt(in, "Enter a number [1-20]: ", 1, 20);

    }
    public static int getRangedInt (Scanner pipe, String prompt, int low, int high) {
        boolean done = false;
        int rangeInt = 0;
        String trash = "";

            do {
                System.out.print(prompt);
                if (pipe.hasNextInt())
                {
                    rangeInt = pipe.nextInt();
                    pipe.nextLine();

                    if (rangeInt >= low && rangeInt <= high)
                    {
                        System.out.println("You selected withing the range: " + rangeInt);
                        done = true;
                    }
                    else
                    {
                        System.out.println("Enter a valid number within the range, not: " + rangeInt);
                    }
                }
                else
                {
                        trash = pipe.nextLine();
                        System.out.println("Enter a valid number within the range, not: " + trash);
                }
        }while(!done);
        return rangeInt;
    }

*/
   /*     boolean done = false;
        double rangeDouble = 0;
        String trash = "";

        rangeDouble = getRangedDouble(in, "Enter a number [1-25]: ", 1, 25);
    }
    public static double getRangedDouble (Scanner pipe, String prompt, int low, int high) {
        boolean done = false;
        double rangeDouble = 0;
        String trash = "";

        do {
            System.out.print(prompt);
            if (pipe.hasNextDouble())
            {
                rangeDouble = pipe.nextDouble();
                pipe.nextLine();

                if (rangeDouble >= low && rangeDouble <= high)
                {
                    System.out.println("You selected within the range: " + rangeDouble);
                    done = true;
                }
                else
                {
                    System.out.println("Enter a valid number within the range, not: " + rangeDouble);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid number within the range, not: " + trash);
            }
        }while(!done);
        return rangeDouble;
    }*/


        //enter Variables

  /*    boolean continueYN;

        continueYN = getYNConfirm(in, "Would you like to continue? [Y/N] ");
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        System.out.print(prompt);
        String continueYN = pipe.nextLine();

        while (!continueYN.equalsIgnoreCase("y") && !continueYN.equalsIgnoreCase("n")) {

            System.out.println("\nInvalid response. Try again.");
            continueYN = pipe.next();
        }
        if (continueYN.equalsIgnoreCase("n")) {
            return false;
        } else {
            return true;
        }
    }

    */
        String testing = "";

        testing = getRegExString(in, "Enter 3 numbers please", "/d{3}");
        System.out.println("you selected: " + testing);

    }



    public static String getRegExString (Scanner pipe, String prompt, String regEx) {
        boolean done = false;
        String trash = "";
        String retVal = "";

        do {

            System.out.print(prompt);
            retVal = pipe.nextLine();
            if (retVal.matches(regEx)) {
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("Enter a matching pattern.");
            }
        } while (!done);
        return retVal;

    }

public static void prettyHeader(String msg)
{
int starCount = 60;
    while(starCount!=0) {
        System.out.print("*");
        starCount--;
    }
    System.out.println();
    int leftStar = (60-msg.length())/2;
    int left=1;
    while(left<=leftStar)
    {
        System.out.print("*");
        left++;
    }
    System.out.print(msg);
    int right = 0;
    while(right<=leftStar)
    {
        System.out.print("*");
        right++;
    }
    System.out.println();
    starCount = 60;
    while(starCount!=0)
    {
        System.out.print("*");
        starCount--;
    }
}
}