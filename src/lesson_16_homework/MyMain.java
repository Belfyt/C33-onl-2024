package lesson_16_homework;
import java.util.HashMap;
import java.util.Map;
public class MyMain {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

    public static void taskOne() {


        String[] words1 = {"a", "b", "a", "c", "b"};
        String[] words2 = {"c", "b", "a"};
        String[] words3 = {"c", "c", "c", "c"};
        System.out.println(wordMultiple(words1));
        System.out.println(wordMultiple(words2));
        System.out.println(wordMultiple(words3));
    }

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Boolean> resultMap = new HashMap<>();

        for (String str : strings) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            resultMap.put(entry.getKey(), entry.getValue() >= 2);
        }
        return resultMap;
    }

    public static void taskTwo() {
        String[] words1 = {"code", "bug"};
        String[] words2 = {"man", "moon", "main"};
        String[] words3 = {"man", "moon", "good", "night"};

        System.out.println(pairs(words1));
        System.out.println(pairs(words2));
        System.out.println(pairs(words3));
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String str : strings) {
            if (str.length() > 0) {
                String firstChar = String.valueOf(str.charAt(0));
                String lastChar = String.valueOf(str.charAt(str.length() - 1));
                result.put(firstChar, lastChar);
            }
        }

        return result;
    }
}







