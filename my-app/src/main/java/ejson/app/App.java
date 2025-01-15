package ejson.app;
import java.util.Scanner;


public class App{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your you command: ");
        String command = scanner.nextLine();

        switch(command){
            case "keygen":
                String result = Actions.generate_public_private_key();
                Boolean file_create_result = CreateFile.write_to_file(result);
                System.out.print(file_create_result);
                break;
            case "keygen -w":
                System.out.print("Need to generate and create a file ");
                break;
            default:
                System.out.print("Entry invalid For help please type help valid options are keygen, keygen -w");
                break;
        }
        scanner.close();
    }
}