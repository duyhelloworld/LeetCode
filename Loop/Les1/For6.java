package Loop.Les1;

/**
 *              *
 *             **
 *            ***
 *           ****
 *          *****
 */
public class For6 {
    public static void main(String[] args) {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = size - i - 1; j < size; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
