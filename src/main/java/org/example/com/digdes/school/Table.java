package org.example.com.digdes.school;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {
    private static List<Map<String, Object>> data = new ArrayList<>();

    static {
       Map<String, Object> row1 = new HashMap<>();
       row1.put("id",1);
       row1.put("lastName","Сидоров");
       row1.put("age",18);
       row1.put("cost",5.4);
       row1.put("active", true);

       Map<String, Object> row2 = new HashMap<>();
       row2.put("id",2);
       row2.put("lastName","Михайлин");
       row2.put("age",8);
       row2.put("cost",5.9);
       row2.put("active", false);
       data.add(row1);
       data.add(row2);
    }

    public List<Map<String, Object>> getData() {
        return data;
    }
}
