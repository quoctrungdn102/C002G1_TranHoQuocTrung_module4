package controler_all.dao;

import java.util.HashMap;
import java.util.Map;

public class DictionaryDao {
    public static Map<String,String> map = new HashMap<>();
    static {
        map.put("hello","xin chao");
        map.put("bye bye","tam biet");
        map.put("see you","hen gap lai");
    }
public static String findByKey(String input){
    for (Map.Entry<String, String> tem: map.entrySet()){
        if (tem.getKey().contains(input)){
            return tem.getValue();
        }
    }
    return null;
}
}
