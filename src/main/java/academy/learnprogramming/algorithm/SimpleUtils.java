package academy.learnprogramming.algorithm;

public class SimpleUtils {
    public boolean stringToBoolean(String value){
        if (value == null) return false;
        if (value != null && (value.equals("y") || value.equals("Yes") || value.equals("true"))) return true;
        return false;
    }
}
