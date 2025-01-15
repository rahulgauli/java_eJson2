import java.io.File; 
import java.io.IOException;
import java.io.FileWriter;
import java.util.HashMap;
import javax.json.Json;
import javax.json.JsonObject;


public class CreateFile{

    public static Boolean write_to_file(JsonObject keydata) {

        try {

            File myObj = new File("keys.json");
            if (myObj.createNewFile()) {
                System.out.print("File Created: " + myObj.getName());
            } else {
                System.out.print("file already exists");
            };
            String public_key = keydata.getString("public_key");
            String private_key = keydata.getString("private_key");

            FileWriter myWriter = new FileWriter("keys.json");
            myWriter.write("public_key " + public_key);
            myWriter.write("private_key " + private_key);
            myWriter.close();
            System.out.print("Successfully wrote to the file");
            return true;
        } catch (IOException e){
            System.out.print("Error Occured: ");
            e.printStackTrace();
            return false;
        }
    }

}