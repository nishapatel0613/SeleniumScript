import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream file = new FileInputStream("C:\\Users\\Ankur\\Desktop\\Nisha Zipcode\\GitHub\\SeleniumScript\\src\\data.properties");
        prop.load(file);
        System.out.println(prop.getProperty("browser"));
        System.out.println(prop.getProperty("url"));
        prop.setProperty("browser","Firefox");
        System.out.println(prop.getProperty("browser","Firefox"));
        FileOutputStream file1 = new FileOutputStream("C:\\Users\\Ankur\\Desktop\\Nisha Zipcode\\GitHub\\SeleniumScript\\src\\data.properties");
        prop.store(file1,null);
    }
}
