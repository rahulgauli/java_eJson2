package ejson.app;
import org.json.JSONObject;



public class Actions{
    public static String generate_public_private_key() {
        JSONObject keys = new JSONObject();
            keys.add("public_key", "dummyPublicKey");
            keys.add("private_key", "dummyPrivateKey");
        String keyString = keys.toString();
        return keyString;
    }

    public static HashMap generate_files(HashMap<String, String> dictionary){
        System.out.print(dictionary);
        return dictionary;
    }
}
