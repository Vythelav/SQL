package org.example.com.digdes.school;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaSchoolStarter {
    Table table = new Table();
    Scanner cr = new Scanner(System.in);

    public JavaSchoolStarter() {
        Table table = new Table();
    }

    public List<Map<String, Object>> execute(String request) throws Exception {
        readOrder(request);
        return table.getData();
    }

    private String updateRequest(String request) {
        return request.
                replace(" ", "").
                substring(13).
                replace("'", "");
    }

    private void readOrder(String request) {
        if (request.startsWith("INSERT")) {
            String updatedRequest = updateRequest(request);
            insertValues(updatedRequest);
        } else if (request.startsWith("UPDATE")) {
            updateValues();
        } else if (request.startsWith("DELETE")) {
            String updatedRequest = updateRequest(request);
            insertValues(updatedRequest);
            deleteValues(updatedRequest);
        } else if (request.startsWith("SELECT")) {
            selectValues();
        }
    }


    private void insertValues(String request) {
        String[] parts = request.split(",");
        Map<String, Object> row3 = new HashMap<>();

        for(String part: parts) {
            String key = part.substring(0, part.indexOf("="));
            String value = part.substring(part.indexOf("=")+1);
            row3.put(key, value);
        }
        table.getData().add(row3);
        System.out.println(table.getData());
        }
    private void deleteValues(String request) {
        String[] parts = request.split(",");
        Map<String, Object> row = new HashMap<>();

        for(String part: parts) {
            String key = part.substring(0, part.indexOf("="));
            String value = part.substring(part.indexOf("=")+1);
            row.put(key, value);
        }
        table.getData().remove(row);
        System.out.println(table.getData());
    }

    private void selectValues() {

    }

    private void updateValues() {

    }
    }


