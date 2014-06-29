import java.util.Scanner;

public class mario {

    public static void main(String[] args) {
        Scanner userrequest = new Scanner(System.in);

		/*  This program is to create a half pyramid that will be right justified and as tall as a user
		    will input as a integer number between 0 and 23.                                       */

		    /*  Define all variables needed to solve the problem.                                   */
        double height;
        System.out.println(" Enter the Height of the piramid: ");
        height = userrequest.nextDouble();

		    /*  If you get an integer that is not between 0 and 23, notify the user of the
		        bounds and re-prompt for pyramid's height                                          */
        while (height < 0 || height >= 24) {
            System.out.printf("The pyramid's height must be between 0 and 23.\n");
            System.out.printf("Height: ");
            height = userrequest.nextDouble();
        }
		    /*     System.out.printf("Height: %d",height);   */
		    /*  Setup an outter loop to print the requested height of the pyramid                   */
        for (int i = 0; i < height; i++) {
		        /*  Print the requirnumber of spaces for each line of the pyramid                   */
            for (int j = 0; j < height - i - 1; j++) {
                System.out.printf(" ");
            }
		        /*  Print the required number of # char for each line of the pyramid                */
            for (int k = 0; k < i + 2; k++) {
                System.out.printf("#");
            }
            System.out.printf("\n");
        }
    }

}
