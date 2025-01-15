import java.util.HashMap;


public class Actions {
    public static HashMap generate_public_private_key() {
        HashMap<String, String> keys = new HashMap<String, String>();
        keys.put("public_key", "dummyPublicKey");
        keys.put("private_key", "dummyPrivateKey");
        return keys;
    }

    public static HashMap generate_files(HashMap<String, String> dictionary){
        System.out.print(dictionary);
        return dictionary;
    }
}
