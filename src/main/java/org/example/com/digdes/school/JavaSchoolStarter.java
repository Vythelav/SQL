package org.example.com.digdes.school;

import java.util.*;

public class JavaSchoolStarter {
    Table table = new Table();
    Scanner cr = new Scanner(System.in);
    List<Map<String, Object>> data = new ArrayList<>();

    public JavaSchoolStarter() {

    }

    public List<Map<String, Object>> execute(String request) throws Exception {
        data = new ArrayList<>();
        readOrder(request);


        return new ArrayList<>();
    }

    private void readOrder(String request) {
        if (request.startsWith("INSERT")) {
            insertValues(request);
        } else if (request.startsWith("UPDATE")) {
            updateValues();
        } else if (request.startsWith("DELETE")) {
            deleteValues();
        } else if (request.startsWith("SELECT")) {
            selectValues();
        }
    }

    private void deleteValues() {

    }

    private void selectValues() {

    }

    private void updateValues() {

    }

    private void insertValues(String request) {
        Map<String, Object> row3 = new HashMap<>();
        row3.put("id",3);
        row3.put("lastName","идр");
        row3.put("age",19);
        row3.put("cost",5.4);
        row3.put("active", true);
        table.setData((List<Map<String, Object>>) row3);

    }
}

