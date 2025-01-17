package ejson.app;
import org.json.JSONObject;
import java.util.HashMap;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class Actions{
    
    public static String generate_public_private_key() {
        int keySize = 2048;
        JSONObject keys = new JSONObject();

        try{
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(keySize);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            
            byte[] publicKey = keyPair.getPublic().getEncoded();
            byte[] privateKey = keyPair.getPrivate().getEncoded();
            
            String publicKeyHex = bytesToHex(publicKey);
            String privateKeyHex = bytesToHex(privateKey);
            
            keys.put("public_key", publicKeyHex);
            keys.put("private_key", privateKeyHex);
            
            String keyString = keys.toString();
            return keyString;
        }
        catch (NoSuchAlgorithmException e) { 
            System.out.print("Error Occured: ");
            e.printStackTrace();
            return "error";
        }
        
    }


    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xFF & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}