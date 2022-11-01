package exercises;

public class Ex3_FixErrors {


    /*
    Fix the errors in the following code:

    int catCount;    // Number of cats

    catCount = 4.1;

    if(catCount < 4.1);
    {
       printf“Number of cats is greater than 4”)
    }}
    else
    {
       Printf(“Number of cats is less than 4”)

Write the code and fix bugs

     */

    public static void main(String[] args) {
        fixedCode();
    }

    public static void fixedCode() {
        double catCount;    // Number of cats

        catCount = 4.1;

        if (catCount > 4.1) {
            System.out.print("Number of cats is greater than 4\n");
        }
        else {
            System.out.print("Number of cats is less than or equal to 4\n");

        }
    }
}
