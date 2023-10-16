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
        request.split();


    }
}

