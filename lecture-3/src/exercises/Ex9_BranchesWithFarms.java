package exercises;

import java.util.Scanner;

public class Ex9_BranchesWithFarms
{

    /*
    Complete the following branch statements:

Enter name of the farmer
Farmer “Bob” may enter the number of sheep he:
- currently owns (can be zero)
- he recently bought
- he recently sold
^^^^^^^^^^^^^^^^^^^^ BOB MUST CHOOSE EITHER 'BOUGHT' OR 'SOLD'
Farmer “Tom” may enter the number of cows he
currently owns (can be zero)
he recently bought/sold
Display the number of animals the farmer owns

Providing error checking so that the farmer is warned if any value entered is zero and all calculations stop.

____________________________________________________________________________________________________
Enter the type of farm: “arable” or “dairy”
Arable farmers enter size of the field and the profit made per m2
Dairy farmers enter the number of cows they own, the average milk quantity per cow and the profit made per litre
Display the profit made by the farmer


     */
    private static Scanner stdin = new Scanner(System.in);


    public static void main(String[] args)
    {
        farmerBobOrFarmerTom();
    }

    public static void farmerBobOrFarmerTom()
    {

        String farmerName;
        int openingCount, boughtCount, soldCount;

        System.out.printf("Are you 'Bob' or 'Tom'?\n");
        farmerName = stdin.nextLine().toLowerCase();

        if (farmerName.equals("bob"))
        {
            System.out.printf("How many sheep do you own?\n");
            openingCount = Integer.parseInt(stdin.nextLine());

            try
            {
                System.out.printf("Have you bought or sold sheep?\n");
                String boughtOrSoldResp = stdin.nextLine().toLowerCase();
                if (boughtOrSoldResp.equals("bought"))
                {
                    System.out.printf("How many sheep have you bought?\n");
                    boughtCount = Integer.parseInt(stdin.nextLine());
                    if (boughtCount > 0)
                    {
                        System.out.printf("There are now %d sheep", openingCount + boughtCount);
                    }
                    else
                    {
                        throw new NumberFormatException(
                        );
                    }
                }
            }
            catch (NumberFormatException e)
            {
                System.out.printf("Number must be positive");
            }
        }
        else if (farmerName.equals("tom"))
        {
            System.out.printf("PLACEHOLDER");
        }
    }
}

