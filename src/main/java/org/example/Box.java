package org.example;

public class Box {
    private String size;

    @Override
    public String toString() {
        return "Box{" +
                "size='" + size + '\'' +
                '}';
    }

    public String getSize() {
        return size;
    }
}
