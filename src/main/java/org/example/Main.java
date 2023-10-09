package org.example;

import org.example.com.digdes.school.JavaSchoolStarter;
import org.example.com.digdes.school.Table;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        JavaSchoolStarter starter = new JavaSchoolStarter();
//        List<Map<String,Object>> result1 = starter.execute("INSERT VALUES " +
//                "'lastName' = 'Федоров' , " +
//                "'id'=3, 'age'=40, 'active'=true");
        Table table = new Table();
        table.creetTable();
        System.out.println(table.getData());
        starter.execute("INCERT");
        System.out.println(table.getData());


    }
}