package exception.ex01;

import java.util.HashMap;

public class Test01 {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();

        map.put("userid","younghun0126");
        map.put("pwd","1212");
        map.put("name","정영훈");
        map.put("age","20");

        System.out.println(map);

        System.out.println(map.get("userid"));
        System.out.println(map.get("pwd"));
        System.out.println(map.get("name"));
        System.out.println(map.get("age"));

    }
}
