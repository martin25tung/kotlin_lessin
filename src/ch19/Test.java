package ch19;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Denny", "Claudette", "Peter");
        List<String> shirtSizes = Arrays.asList("large", "x-large", "medium");
        Map<String, String> employeeShirtSizes = new HashMap<>();
        for (int i = 0;i < employees.size(); i++){
            employeeShirtSizes.put(employees.get(i), shirtSizes.get(i));
        }

    }
}
