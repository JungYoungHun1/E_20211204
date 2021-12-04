package exception.ex01;

import java.util.HashMap;

public class Test02 {
    public static void main(String[] args) {
        String[] nation = {"한국","일본","중국","미국","태국","영국"};
        String[] city = {"서울","동경","북경","워싱턴","방콕","런던"};

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < city.length; i++) {
            map.put(nation[i], city[i]);
        }
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
