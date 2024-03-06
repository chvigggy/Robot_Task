import java.util.Map;
import java.util.HashMap;

class Robot {
    static void finalPosition(String p) {
        Map<Character, Integer> dm = new HashMap<>();
        dm.put('U', 0);
        dm.put('D', 0);
        dm.put('L', 0);
        dm.put('R', 0);

    }

    
    

    public static void main(String[] args) {
        String p = "UDDLRL";
        finalPosition(p);
    }
}

