import java.util.*;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    protected static char key, keyOfMaxValue, keyOfMinValue;
    protected static int value;
    protected static int maxValue = Integer.MIN_VALUE;
    protected static int minValue = Integer.MAX_VALUE;

    public static void main(String[] args) {
        char textChar[] = text.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < textChar.length; i++) {
            key = textChar[i];
            if (Character.isLetter(key)) {
                if (map.containsKey(key)) {
                    value = map.get(key);
                    map.put(key, value + 1);
                } else {
                    map.put(key, 1);
                }
            }
        }
        for (Character key : map.keySet()) {
            if (map.get(key) > maxValue) {
                maxValue = map.get(key);
                keyOfMaxValue = key;
            }
            if (map.get(key) < minValue) {
                minValue = map.get(key);
                keyOfMinValue = key;
            }
        }

        System.out.println("Самая часто встречающаяся буква - " + keyOfMaxValue + " (" + maxValue + " шт.)");
        System.out.println("Самая редко встречающаяся буква - " + keyOfMinValue + " (" + minValue + " шт.)");
    }
}