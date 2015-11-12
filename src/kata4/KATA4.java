
package kata4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class KATA4 {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {
        
        //String nameFile = "C:\\Users\\Goretti\\Documents\\NetBeansProjects\\KATA4\\DATA\\emailsfilev1.txt";
        ArrayList<String> mailArray = MailListReaderDDBB.read();
        
        System.out.println(mailArray.size());
        
        Histogram<String> histogram = MailHistogramBuilder.buil(mailArray);
        
        
        new HistogramDisplay(histogram).execute();
    }
}
