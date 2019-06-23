import java.util.Set;
public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Woooh Bullet the blue sky", "Bullet the Blue sky- U2");
        userMap.put("Don't they know each moments fleeting I cant help but feeling I'm right where I should be", "Degenerates- I The Mighty");
        userMap.put("Promise you'll be faithfull when you go go go", "Man of the Year - Dance Gavin Dance");
        userMap.put("Am I everything you imagined me to be?","Reimagined - The Contortionist");
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            String main = userMap.get("Woooh Bullet the blue sky");

    
        }
    }
}

