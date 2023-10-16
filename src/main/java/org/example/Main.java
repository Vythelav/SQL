package org.example;

import org.example.com.digdes.school.JavaSchoolStarter;
import org.example.com.digdes.school.Table;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        JavaSchoolStarter starter = new JavaSchoolStarter();
        List<Map<String,Object>> result3 = starter.execute("INSERT VALUES " +
                "'lastName' = 'Гайсин' , " +
                "'id'= 5, 'age' = 15, 'active' = true");
        List<Map<String,Object>> result1 = starter.execute("DELETE VALUES " +
                "'lastName' = 'сайсин' , " +
                "'id'= 4, 'age' = 5, 'active' = true");


    }
}