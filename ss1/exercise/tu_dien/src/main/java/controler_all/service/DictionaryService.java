package controler_all.service;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryService implements IDictionaryService {
    public static Map<String, String> map = new HashMap<>();
    static {
        map.put("hello", "xin chao");
        map.put("bye bye", "tam biet");
        map.put("see you", "hen gap lai");
    }

    public String findByKey(String input) {
        for (Map.Entry<String, String> tem : map.entrySet()) {
            if (tem.getKey().contains(input)) {
                return tem.getValue();
            }
        }
        return null;
    }
}
