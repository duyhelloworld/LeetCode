package Loop.Les1;

/**
 *      ***********
 *       *********
 *        *******
 *         *****
 *          ***
 *           *
 */
public class For3 {
    public static void main(String[] args) {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j < size * 2 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }        
    }
}
