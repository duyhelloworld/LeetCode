package Loop.Les1;

/**
 *      *****
 *      
 *      *****
 *      
 *      *****
 */
public class For2 {
    public static void main(String[] args) {
        int size = 5;
        for (int i = 0; i < size; i++) {
            String c = i % 2 == 0 ? "*" : " ";
            for (int j = 0; j < size; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
