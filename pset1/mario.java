import java.util.Scanner;

public class Mario {

    public static void main(String[] args) {
        Scanner userrequest = new Scanner(System.in);

		/*  This program is to create a half pyramid that will be right justified and as tall as a user
		    will input as a integer number between 0 and 23.                                       */

		    /*  Define all variables needed to solve the problem.                                   */
        int height;
        System.out.println(" Enter the Height of the pyramid: ");
        height = userrequest.nextInt();

		    /*  If you get an integer that is not between 0 and 23, notify the user of the
		        bounds and re-prompt for pyramid's height                                          */
        while (height < 0 || height >= 24) {
            System.out.printf("The pyramid's height must be between 0 and 23.\n");
            System.out.printf("Height: ");
            height = userrequest.nextInt();
        }
		   /*  Change the print function of each char to use StringBuilder then call print once for each line  */
		    /*  Setup an outter loop to build the string of #'s for the requested height of the pyramid                   */
        for (int i = 0; i < height; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < height - i - 1; j++) {
                stringBuilder.append(" ");
            }
		        /*  Append the required number of spaces & # char for each line of the pyramid     */
            for (int k = 0; k < i + 2; k++) {
                stringBuilder.append("#");
            }
            System.out.println(stringBuilder.toString());
        }
    }

}
