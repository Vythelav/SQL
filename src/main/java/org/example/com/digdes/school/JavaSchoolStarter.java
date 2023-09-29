package org.example.com.digdes.school;

import java.util.*;

public class JavaSchoolStarter {
    Scanner cr = new Scanner(System.in);
    List<Map<String, Object>> data;

    public JavaSchoolStarter() {

    }

    public List<Map<String, Object>> execute(String request) throws Exception {
        data = new ArrayList<>();
        readOrder(request);


        return new ArrayList<>();
    }

    private void readOrder(String request) {
        if (request.startsWith("INSERT")) {
            insertValues();
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

    private void insertValues() {

    }
}

