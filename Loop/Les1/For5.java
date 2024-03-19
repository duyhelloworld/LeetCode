package Loop.Les1;

/***
 *      *****
 *      ****
 *      ***
 *      **
 *      *
 */
public class For5 {
    public static void main(String[] args) {
        int size = 4;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
