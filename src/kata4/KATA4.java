
package kata4;

import java.io.File;

/**
 *
 * @author Goretti
 */
public class KATA4 {

    public static void main(String[] args) {
        
        String pathName = "c:/";
        File file = new File (pathName);
        String [] dire = file.list();
        for (String dire1 : dire) {
            System.out.println(dire1);
        }
    }
    
}
