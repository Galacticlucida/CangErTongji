package cn.lyc.demo.until;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class JsonToList {
    public static <T> List<T> getPersons(String jsonString, Class cls) {
        List<T> list = new ArrayList<T>();
        try {
            list = JSON.parseArray(jsonString, cls);
        } catch (Exception e) {
        }
        return list;
    }
}
