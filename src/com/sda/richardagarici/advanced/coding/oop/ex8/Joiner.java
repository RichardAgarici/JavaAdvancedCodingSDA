package com.sda.richardagarici.advanced.coding.oop.ex8;

import java.util.List;

public class Joiner<T> {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(List<T> elements) {
        String result = "";
        for (int i = 0; i < elements.size(); i++) {
            result = result + elements.get(i).toString();
            if (i != elements.size() - 1) {
                result = result + separator;
            }
        }

        return result;
    }

}
