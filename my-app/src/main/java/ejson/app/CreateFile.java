package ejson.app;
import java.io.File; 
import java.io.IOException;
import java.io.FileWriter;


public class CreateFile{

    public static Boolean write_to_file(String keydata) {

        try {
            System.out.print(keydata);
            File myObj = new File("keys.json");
            if (myObj.createNewFile()) {
                System.out.print("File Created: " + myObj.getName());
            } else {
                System.out.print("file already exists");
            };
            FileWriter myWriter = new FileWriter("keys.json");
            myWriter.write(keydata);
            myWriter.close();
            System.out.print(" Successfully wrote to the file");
            return true;
            
        } catch (IOException e){
            System.out.print("Error Occured: ");
            e.printStackTrace();
            return false;
        }
    }

}